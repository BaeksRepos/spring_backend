package com.dreamonesys.olympiad_app.model.login;


import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Builder
@Getter
public class LoginModel {
    private String loginId;
    private int id;
    private String name;
    private String userType;
    private String campusId;
    private String campusName;
    private String campusTelNo;
    private String myPageUrl;
    private ArrayList<StudentLogin> studentLogins;
    private int badgeCount;
}
