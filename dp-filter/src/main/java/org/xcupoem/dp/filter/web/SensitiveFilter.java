package org.xcupoem.dp.filter.web;

import org.xcupoem.dp.filter.web.Filter;
import org.xcupoem.dp.filter.web.FilterChain;
import org.xcupoem.dp.filter.web.Request;
import org.xcupoem.dp.filter.web.Response;

public class SensitiveFilter implements Filter {

	public void doFilter(Request request, Response response, FilterChain chain) {
		//处理敏感字眼
		request.requestStr = request.requestStr.replace("被就业", "就业").replace("敏感", "") + "---SensitiveFilter()";
		chain.doFilter(request, response, chain);
		
		response.responseStr += "---SensitiveFilter()";
		
	}

}
