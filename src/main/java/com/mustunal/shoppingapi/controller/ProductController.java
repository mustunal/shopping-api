package com.mustunal.shoppingapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @GetMapping
    @RequestMapping("/info")
    public Map getInfo(){
        Map<String,String> infoMap = new HashMap<>();
        infoMap.put("app","Shopify");
        infoMap.put("version","1.0.0");
        return infoMap;
    }
}
