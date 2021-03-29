package com.gemiso.zodiac.util.common;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
 
@Component
public class CorsFilter implements Filter {
	Logger log = Logger.getLogger(this.getClass());
	
 
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
    	
    	HttpServletRequest request = (HttpServletRequest) req;

    	log.info("************************************************************************************************");
    	Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            Enumeration<String> headers = request.getHeaders(headerName);
            while (headers.hasMoreElements()) {
                String headerValue = headers.nextElement();
                log.info("**["+headerName + "] : " + headerValue );
            }
        }
    	log.info("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    	Enumeration attributeNames = req.getAttributeNames();
        while(attributeNames.hasMoreElements()){
            String name = (String)attributeNames.nextElement();
            String value = (String)req.getAttribute(name);
            log.info("**"+name + " : " + value );
        }
    	log.info("************************************************************************************************");
   	
        HttpServletResponse response = (HttpServletResponse) res;

        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, PATCH");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        
        response.setHeader("Access-Control-Allow-Origin", "*");
     

        chain.doFilter(req, res);
    }
    public void init(FilterConfig filterConfig) {}
    public void destroy() {}
}
