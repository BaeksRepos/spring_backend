package com.dreamonesys.olympiad_app.model.message;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MessageModel {
    private int orderNo;
    private String contents;
    private String description;
    private String detailYn;
    private String etcImage1Url;
    private String etcImage2Url;
    private String etcImage3Url;
    private String linkUrl;
    private String mainImageUrl;
    private String messageDate;
    private int messageId;
    private String subImageUrl;
    private String tag;
    private String title;
    private String type;
    private String yearMonth;
    private String readYn;

}
