package org.xcupoem.dp.filter;

public class Main {

	public static void main(String[] args) {
		String msg = "大家好:)<script>, 没敢，被就业，没网络，敏感";
		
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())    //链式编程
		  .addFilter(new SensitiveFilter())
		  ;
		
		FilterChain fc2 = new FilterChain();  //实现过滤器的任意添加
		fc2.addFilter(new FaceFilter());
		
		fc.addFilter(fc2);
		
		mp.setFc(fc);
		
		String result = mp.process();
		System.out.println(result);
	}

}
