package com.example.cvapp_douae.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
class CVController {

    @RequestMapping("/cv")
    public ModelAndView displayCV() {
        return new ModelAndView("forward:/index.html");
    }
}