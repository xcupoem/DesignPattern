package org.xcupoem.dp.filter;

public class MsgProcessor {
	private String msg;
	
	//Filter[] filters = {new HTMLFilter(), new SensitiveFilter(), new FaceFilter()};  //过滤器链
	FilterChain fc;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String process() {		
		
		return fc.doFilter(msg);  //让规则链条处理
		
		//String r = new HTMLFilter().doFilter(msg);
		
//		String r = msg;
//		for(Filter f : filters) {
//			r = f.doFilter(r);
//		}
//		
//		
//		return r;
	}
}
