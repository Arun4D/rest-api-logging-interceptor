package com.ad.logging.dto;

import lombok.Data;

@Data
public class RequestResponseLogDto {

    private String transactionId;

    private String methodName;

    private String url;

    private String userId;

    private MessageLogDto requestHeader;

    private MessageLogDto requestBody;

    private MessageLogDto responseHeader;

    private MessageLogDto responseBody;

}
