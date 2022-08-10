package com.finedu.shares.service;

import com.finedu.shares.dto.ShareRegistrationRequest;
import com.finedu.shares.entity.Share;
import com.finedu.shares.repository.ShareRepository;
import org.springframework.stereotype.Service;

@Service
public record ShareService(ShareRepository shareRepository) {

    public void shareRegistration(ShareRegistrationRequest shareRegistrationRequest) {
        Share share = Share.builder()
                .fullName(shareRegistrationRequest.fullName())
                .nyse(shareRegistrationRequest.nyse())
                .price(shareRegistrationRequest.price())
                .dividend(shareRegistrationRequest.dividend())
                .build();
        shareRepository.save(share);
    }
}
