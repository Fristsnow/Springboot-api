package com.fdemo.fdemo.controller;

import com.fdemo.fdemo.common.JwtUtils;
import com.fdemo.fdemo.common.ResponseResult;
import com.fdemo.fdemo.common.Result;
import com.fdemo.fdemo.model.User;
import com.fdemo.fdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        log.info("用户登录: {}", user);
        User u = userService.login(user);
        if (u != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("id",u.getId());
            claims.put("name",u.getName());
            claims.put("email",u.getEmail());
            String jwt = JwtUtils.generateJwt(claims);
            return ResponseResult.newInstance().code(200).msg("success").data(jwt);
        }
        return ResponseResult.newInstance().code(404).msg("email or password error");
    }
}
