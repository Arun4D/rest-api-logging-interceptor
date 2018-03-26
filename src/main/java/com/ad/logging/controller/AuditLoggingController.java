package com.ad.logging.controller;

import com.ad.logging.assemble.AuditLogAssembler;
import com.ad.logging.dto.RequestResponseLogDto;
import com.ad.logging.repository.RequestResponseLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("audit")
@Transactional
public class AuditLoggingController {

    @Autowired
    private RequestResponseLogRepository requestResponseLogRepository;

    @Autowired
    private AuditLogAssembler auditLogAssembler;

	@PostMapping
	@ResponseBody
	@CrossOrigin
	public ResponseEntity<?> saveParty(@RequestBody @Valid @NotNull RequestResponseLogDto requestResponseLogDto, @RequestHeader HttpHeaders headers,
									   BindingResult errors) {

        requestResponseLogRepository.save(auditLogAssembler.assembleRequest(requestResponseLogDto));

		return ResponseEntity.ok("");
	}
}
