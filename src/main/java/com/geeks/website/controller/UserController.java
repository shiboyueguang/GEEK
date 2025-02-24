package com.geeks.website.controller;

import com.geeks.website.dto.LoginFormDTO;
import com.geeks.website.dto.Result;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *     用户管理
 * </p>
 *
 * @author 冯
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 登录功能
     * @param loginForm 登录参数，账号，密码
     */
    @PostMapping("/login")
    public Result login(@RequestBody LoginFormDTO loginForm, HttpSession session){
        // TODO 实现登录功能
        return null;
    }

    /**
     * 注册功能
     * @param registerForm 注册参数，包含手机号、验证码；或者手机号、密码
     */
    @PostMapping("/register")
    public Result register(@RequestBody LoginFormDTO registerForm, HttpSession session){
        // TODO 注册登录功能
        return null;
    }

    /**
     * 登出功能
     * @return 无
     */
    @PostMapping("/logout")
    public Result logout(){
        // TODO 实现登出功能
        return null;
    }


}
