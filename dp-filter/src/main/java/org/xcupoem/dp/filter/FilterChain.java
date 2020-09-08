package org.xcupoem.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {   //过滤器的管理类  实现接口过滤器的添加
	List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain addFilter(Filter f) { //添加过滤器
		this.filters.add(f);
		
		return this; //返回当前链条
	}
	
	public String doFilter(String str) {
		String r = str;
		for(Filter f : filters) {
			r = f.doFilter(r);
		}
		
		return r;
	}
}
