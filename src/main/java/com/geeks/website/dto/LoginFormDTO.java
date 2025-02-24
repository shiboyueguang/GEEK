package com.geeks.website.dto;

import lombok.Data;

@Data
public class LoginFormDTO {
    //qq邮箱
    private String email;
    //密码
    private String password;
    //消息体
    private String code;
}
