package com.dreamonesys.olympiad_app.model.message;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MessageFileModel {
    private int seq;
    private String fileName;
    private String filePath;
    private int fileSize;
}
