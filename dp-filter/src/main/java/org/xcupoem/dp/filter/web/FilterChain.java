package org.xcupoem.dp.filter.web;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {   //过滤器的管理类  实现接口过滤器的添加
	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;
	
	public FilterChain addFilter(Filter f) { //添加过滤器
		this.filters.add(f);
		
		return this; //返回当前链条 可以进行链式编程
	}

	public void doFilter(Request request, Response response, FilterChain chain) {
		if(index == filters.size()) 
			return;
		
		Filter f = filters.get(index);  //记录调用的是哪个Filter
		index ++;
		f.doFilter(request, response, chain);  //依次处理
	}
}
