package com.qiaoqin.girlsingle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping(value = "/hello")
    public String listGirls(Model model){
        return "bank";
    }
}
