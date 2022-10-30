package com.dreamonesys.olympiad_app.controller;

import com.dreamonesys.olympiad_app.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @GetMapping("userLogin")
    @ResponseBody
    public LoginModel userLogin(@RequestParam("loginId") String loginId, @RequestParam("deviceId") String deviceId){
        LoginModel.LoginModelBuilder model = LoginModel.builder();
        model.loginId(loginId);
        model.deviceId(deviceId);

        return model.build();
    }

}
