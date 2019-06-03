package com.fortabat.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @GetMapping(path = "/login1") // Map ONLY GET Requests

public @ResponseBody String get(){
    return "true";
}

}
