package com.work.shop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "{\"name\" : \"Tocka\"}";
    }
}
