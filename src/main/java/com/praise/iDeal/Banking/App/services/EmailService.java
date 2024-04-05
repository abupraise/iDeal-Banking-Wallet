package com.praise.iDeal.Banking.App.services;

import com.praise.iDeal.Banking.App.payload.request.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);

    void sendEmailWithAttachment(EmailDetails emailDetails);
}
