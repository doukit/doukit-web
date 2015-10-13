package com.doukit.main.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Aborn Jiang
 * Email : aborn.jiang AT foxmail.com
 * Date  : 10-13-2015
 * Time  : 9:21 AM
 */
@Controller
@RequestMapping(value = "/common")
public class FaceController {

    @RequestMapping(value = "/face.html")
    public String faceNotice() {
        return "common/face";
    }

}
