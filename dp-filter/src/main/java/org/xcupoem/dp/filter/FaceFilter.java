package org.xcupoem.dp.filter;

public class FaceFilter implements Filter { //笑脸过滤器

	public String doFilter(String str) {
		
		return str.replace(":)", "^_^");
	}

}
