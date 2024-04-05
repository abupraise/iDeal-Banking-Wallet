package com.praise.iDeal.Banking.App.services;

import com.praise.iDeal.Banking.App.payload.request.CreditAndDebitRequest;
import com.praise.iDeal.Banking.App.payload.request.EnquiryRequest;
import com.praise.iDeal.Banking.App.payload.request.TransferRequest;
import com.praise.iDeal.Banking.App.payload.response.BankResponse;

public interface UserService {
    BankResponse creditAccount(CreditAndDebitRequest request);

    BankResponse debitAccount(CreditAndDebitRequest request);

    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse transfer(TransferRequest request);
}
