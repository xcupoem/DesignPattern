package org.xcupoem.dp.filter.web;

import org.xcupoem.dp.filter.web.FilterChain;
import org.xcupoem.dp.filter.web.HTMLFilter;
import org.xcupoem.dp.filter.web.Request;
import org.xcupoem.dp.filter.web.Response;
import org.xcupoem.dp.filter.web.SensitiveFilter;

public class Main {

	public static void main(String[] args) {
		String msg = "大家好:)<script>, 没敢，被就业，没网络，敏感";
		
		Request request = new Request();
		request.setRequestStr(msg);
		
		Response response = new Response();
		response.setResponseStr("response");//未处理情况下的默认值
		
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())    //链式编程
		  .addFilter(new SensitiveFilter())
		  ;
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		
		System.out.println(response.getResponseStr());
		
	}

}
