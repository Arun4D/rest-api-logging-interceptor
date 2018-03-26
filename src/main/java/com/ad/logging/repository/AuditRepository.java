package com.ad.logging.repository;


import com.ad.logging.domain.RequestResponseLog;

public interface AuditRepository {
    void saveAuditLog(RequestResponseLog requestResponseLog);
}

