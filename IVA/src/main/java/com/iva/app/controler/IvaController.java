package com.iva.app.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class IvaController {
	
	@GetMapping("/iva")
    public String greetingForm(Model model) {
        model.addAttribute("valores", new Valores());
        return "iva";
    }

    @PostMapping("/iva")
    public String greetingSubmit(@ModelAttribute Valores valores) {
        return "iva";
    }

}
