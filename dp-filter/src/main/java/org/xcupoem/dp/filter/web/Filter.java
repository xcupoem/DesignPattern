package org.xcupoem.dp.filter.web;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}
