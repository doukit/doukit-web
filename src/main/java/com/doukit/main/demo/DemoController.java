package com.doukit.main.demo;

import com.doukit.main.common.utils.ResponseUtils;
import com.doukit.main.core.BaseController;
import com.doukit.main.demo.entity.UserInfoDo;
import com.doukit.main.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Aborn Jiang
 * @email aborn.jiang AT foxmail.com
 * @date 10-11-2015
 * @time 10:10 AM
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController extends BaseController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "getAllUserInfo.html")
    public void getAllUserInfo(HttpServletResponse response) {
        List<UserInfoDo> userInfoDos = demoService.queryAllUsersInfo();
        ResponseUtils.renderText(response, userInfoDos.toString());
    }
}
