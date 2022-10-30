package com.dreamonesys.olympiad_app.model;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginModel {
    private String loginId;
    private String deviceId;


}
