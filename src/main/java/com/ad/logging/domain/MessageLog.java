package com.ad.logging.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;

@Document(collection = "MessageLog")
@Data
public class MessageLog {

    private String typeName;

    private Document requestResponseAuditMessage;

    private Calendar createdDate;
}
