package com.comrade.bean;/*package com.example.demo.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
public class Test {
	  private static AuthenticationManager am = new SampleAuthenticationManager();
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			 System.out.println("Please enter your username:");
		      String name = in.readLine();
		      System.out.println("Please enter your password:");
		      String password = in.readLine();
		      try {
		    	  Authentication request=new UsernamePasswordAuthenticationToken(name, password);
		    	  Authentication result=am.authenticate(request);
		    	  SecurityContextHolder.getContext().setAuthentication(result);
		      }catch(AuthenticationException e) {
		          System.out.println("Authentication failed: " + e.getMessage());
		      }
		      System.out.println("Successfully authenticated. Security context contains: " +
		              SecurityContextHolder.getContext().getAuthentication());
		}
		
	}

}
*/