package org.xcupoem.dp.filter.web;

import org.xcupoem.dp.filter.web.Filter;
import org.xcupoem.dp.filter.web.FilterChain;
import org.xcupoem.dp.filter.web.Request;
import org.xcupoem.dp.filter.web.Response;

public class HTMLFilter implements Filter {

	public void doFilter(Request request, Response response, FilterChain chain) {
		//处理html标签
		request.requestStr = request.requestStr.replace('<', '[').replace('>', ']') + "---HTMLFilter()";
		chain.doFilter(request, response, chain);  //调用下一个Filter
		
		response.responseStr += "---HTMLFilter()";
	}

}
