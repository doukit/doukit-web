package com.doukit.main.index.controller;

import com.doukit.main.core.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Aborn Jiang
 * Email : aborn.jiang AT foxmail.com
 * Date  : 10-15-2015
 * Time  : 9:51 AM
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController extends BaseController {

    @RequestMapping(value = "/index.html")
    public String index() {
        String info = "hello";
        return "index/index";
    }
}
