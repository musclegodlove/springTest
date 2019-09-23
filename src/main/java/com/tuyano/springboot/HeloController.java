package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeloController {

	@RequestMapping("/")
	public String index(Model model) {
		 // 
        // 
        String label[] = {"a","b","c","d","e","f","g"};

        // 
        // 
        int point[] = {5,1,7,6,15,3,4,};

        // 
        model.addAttribute("label",label);
        model.addAttribute("point",point);

		return "index";
	}

}
