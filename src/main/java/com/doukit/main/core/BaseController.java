package com.doukit.main.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aborn Jiang
 * @email aborn.jiang AT foxmail.com
 * @date 10-10-2015
 * @time 10:14 AM
 */
@Controller
public class BaseController {

    @RequestMapping(value = "index.html")
    public String index() {
        return "redirect:/index/index.html";
    }
}
