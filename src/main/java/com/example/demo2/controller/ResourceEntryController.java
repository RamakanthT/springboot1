package com.example.demo2.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo2.model.ResourceModel;


@Controller
public class ResourceEntryController {


	// inject via application.properties
	//@Value("${welcome.message}")
	private String message = "Hello World";

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		model.put("resource", new ResourceModel());
		return "ResourceEntry";
	}
	
	@RequestMapping(value="/resourceEntrySubmit", method = RequestMethod.POST )
	public String resourceEntrySubmit( @ModelAttribute("resource") @Valid ResourceModel resModel, BindingResult bindingResults, 
			Map<String, Object> model) {
		if(bindingResults.hasErrors()){
			model.put("resource", resModel);
			return "ResourceEntry";
		}
		System.out.println(resModel.getResId());
		model.put("message", "Ramakanth");
		return "Submit";
	}
}
