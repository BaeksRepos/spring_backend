package com.dreamonesys.olympiad_app.model.login;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Builder
@Getter
@Component
public class StudentLogin {
    private int id;
    private String loginId;
    private String name;
}
