package com.ad.logging.dto;

import lombok.Data;

import java.util.Calendar;

@Data
public class MessageLogDto {

    private String typeName;

    private String message;

    private Calendar createdDate;
}
