package com.customer.Customaer_Details.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // This returns the login.html in the templates folder
    }

    @GetMapping("/customers")
    public String customerListPage() {
        return "customerList"; // This returns the customerList.html
    }

    @GetMapping("/add-customer")
    public String addCustomerPage() {
        return "addCustomer"; // This returns the addCustomer.html
    }
}
