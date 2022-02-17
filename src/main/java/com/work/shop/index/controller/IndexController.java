package com.work.shop.index.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "{\"name\" : \"Tocka\"}";
    }
}
