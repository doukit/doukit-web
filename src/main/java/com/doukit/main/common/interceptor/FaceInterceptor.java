package com.doukit.main.common.interceptor;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: Aborn Jiang
 * Email : aborn.jiang AT foxmail.com
 * Date  : 10-13-2015
 * Time  : 9:16 AM
 */
public class FaceInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (StringUtils.isNotBlank(uri) && uri.startsWith("/common")) {
            return true;
        }

        response.sendRedirect("/common/face.html");
        return false;
    }
}
