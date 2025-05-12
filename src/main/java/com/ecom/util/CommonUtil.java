package com.ecom.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import jakarta.servlet.http.HttpServletRequest;

public class CommonUtil {

    @Autowired
    private JavaMailSender mailSender;

	public static Boolean sendMail(String url, String reciepentEmail) {
        
		return false;	
		}

    public static String generateUrl(HttpServletRequest request) {
		// http://localhost:8080/forgot-password
       String siteUrl= request.getRequestURL().toString();
       return siteUrl.replace( request.getServletPath(), "");



    }
}
