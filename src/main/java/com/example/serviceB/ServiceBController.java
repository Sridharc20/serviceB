/**
 * 
 */
package com.example.serviceB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sridhar
 *
 */
@RestController
public class ServiceBController {

	@GetMapping("serviceb")
	public String home() {
		return "service b home";
		
	}
}
