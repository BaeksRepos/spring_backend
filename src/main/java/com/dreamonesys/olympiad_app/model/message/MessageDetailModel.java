package com.dreamonesys.olympiad_app.model.message;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Builder
@Getter
public class MessageDetailModel {
    private String contents;
    private String description;
    private double latitude;
    private double longitude;
    private String linkUrl;
    private String mainImageUrl;
    private String mapYn;
    private int messageId;
    private String subImageUrl;
    private String title;
    private String linkName;
    private ArrayList<MessageFileModel> messageFiles;
}
