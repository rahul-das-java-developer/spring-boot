package spring.boot.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler
	public String handleException(Exception e) {
		System.out.println(e.getMessage());
		
		return "Exception handled!!";
	}
	

}
