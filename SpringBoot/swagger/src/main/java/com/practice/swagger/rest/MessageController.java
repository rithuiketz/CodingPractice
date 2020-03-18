package com.practice.swagger.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	MessageSource messageSource;

	@GetMapping(value = "/getMsg")
	public String getMessage() {
		return messageSource.getMessage("msg.lang", null, LocaleContextHolder.getLocale());
	}

}
