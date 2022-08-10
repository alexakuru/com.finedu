package com.finedu.shares.controller;

import com.finedu.shares.dto.ShareRegistrationRequest;
import com.finedu.shares.service.ShareService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/shares")
public record ShareController(ShareService shareService) {

    @PostMapping()
    public void registerShare(@RequestBody ShareRegistrationRequest shareRequest) {
        log.info("New share request {}", shareRequest);
        shareService.shareRegistration(shareRequest);
    }
}
