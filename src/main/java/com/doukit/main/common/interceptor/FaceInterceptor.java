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
        if (isLegal(uri)) {
            return true;
        }

        response.sendRedirect("/index/index.html");
        return false;
    }

    public boolean isLegal(String uri) {
        if (StringUtils.isBlank(uri)) {
            return false;
        }

        if (uri.startsWith("/common") || uri.equals("index.html")
                || uri.startsWith("/index") || uri.startsWith("/mobile")) {
            return true;
        }

        return false;
    }
}
