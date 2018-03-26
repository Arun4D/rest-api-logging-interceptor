package com.ad.logging.assemble;

import com.ad.logging.domain.MessageLog;
import com.ad.logging.domain.RequestResponseLog;
import com.ad.logging.dto.MessageLogDto;
import com.ad.logging.dto.RequestResponseLogDto;
import com.mongodb.util.JSON;
import org.springframework.stereotype.Component;

@Component
public class AuditLogAssembler {
    public RequestResponseLog assembleRequest(RequestResponseLogDto requestResponseLogDto) {
        RequestResponseLog requestResponseLog = new RequestResponseLog();
        requestResponseLog.setMethodName(requestResponseLogDto.getMethodName());
        requestResponseLog.setTransactionId(requestResponseLogDto.getTransactionId());
        requestResponseLog.setUrl(requestResponseLogDto.getUrl());
        requestResponseLog.setUserId(requestResponseLogDto.getUserId());
        requestResponseLog.setRequestHeader(messageLogRequest(requestResponseLogDto.getRequestHeader()));
        requestResponseLog.setRequestBody(messageLogRequest(requestResponseLogDto.getRequestBody()));
        requestResponseLog.setResponseHeader(messageLogRequest(requestResponseLogDto.getResponseHeader()));
        requestResponseLog.setResponseBody(messageLogRequest(requestResponseLogDto.getResponseBody()));
        return requestResponseLog;
    }

    private MessageLog messageLogRequest(MessageLogDto messageLogDto) {
        MessageLog messageLog = new MessageLog();
        messageLog.setCreatedDate(messageLogDto.getCreatedDate());
        messageLog.setTypeName(messageLogDto.getTypeName());
        messageLog.setRequestResponseAuditMessage((org.springframework.data.mongodb.core.mapping.Document) JSON.parse(messageLogDto.getMessage()));
        return messageLog;
    }
}
