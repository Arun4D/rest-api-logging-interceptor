package com.ad.logging.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RequestResponseLog")
@Data
public class RequestResponseLog {

    @Indexed
    private String transactionId;

    private String methodName;

    private String url;

    @Indexed
    private String userId;

    @DBRef
    private MessageLog requestHeader;

    @DBRef
    private MessageLog requestBody;

    @DBRef
    private MessageLog responseHeader;

    @DBRef
    private MessageLog responseBody;

}
