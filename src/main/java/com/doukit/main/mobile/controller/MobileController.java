package com.doukit.main.mobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Aborn Jiang
 * Email : aborn.jiang AT foxmail.com
 * Date  : 10-16-2015
 * Time  : 9:54 AM
 */
@Controller
@RequestMapping(value = "/mobile")
public class MobileController {

    @RequestMapping(value = "index.html")
    public String index() {
        return "/mobile/index";
    }
}
