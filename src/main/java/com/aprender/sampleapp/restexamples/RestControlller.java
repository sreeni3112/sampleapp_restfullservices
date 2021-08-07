/**
 * 
 */
package com.aprender.sampleapp.restexamples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sreenivasulu
 *
 */
@RestController
public class RestControlller {
	
	@GetMapping(path = "/Hello")
	public static String MyFirstRestService() {
		
		return " You are getting message means, MyFirstRestService is Up and Running !!";
	}

}
