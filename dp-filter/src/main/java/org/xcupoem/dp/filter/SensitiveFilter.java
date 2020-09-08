package org.xcupoem.dp.filter;

public class SensitiveFilter implements Filter {

	public String doFilter(String str) {
		//处理敏感字眼
		String r = str.replace("被就业", "就业").replace("敏感", "");
		return r;
	}

}
