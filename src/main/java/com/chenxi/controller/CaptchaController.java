package com.chenxi.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/commons")
public class CaptchaController {
    @Autowired
    private HttpSession session;

    @RequestMapping("/captcha")
    public void catpcha(HttpServletResponse response) throws IOException {
        //生成验证码
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(120, 50);
        ServletOutputStream os = response.getOutputStream();
        session.setAttribute("safecode",captcha.getCode());
        //生成验证码
        String code = captcha.getCode();
        captcha.write(os);
        os.flush();
    }

}
