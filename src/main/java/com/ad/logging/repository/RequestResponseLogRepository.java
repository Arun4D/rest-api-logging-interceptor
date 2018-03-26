package com.ad.logging.repository;

import com.ad.logging.domain.RequestResponseLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(noRollbackFor = Exception.class)
public interface RequestResponseLogRepository extends CrudRepository<RequestResponseLog, Long>, AuditRepository {
}
