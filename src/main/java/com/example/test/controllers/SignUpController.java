package com.example.test.controllers;

import com.example.test.entities.Customer;
import com.example.test.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/signup")
@AllArgsConstructor
public class SignUpController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/signup")
    public String signUp(Model model) {
        model.addAttribute("customer", new Customer());
         return "signnup";
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute("customer") @Validated Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "signup";
        }
        customerService.saveCustomer(customer);
        model.addAttribute("successMessage", "Customer has been registered successfully");
        return "signup";
    }


}
