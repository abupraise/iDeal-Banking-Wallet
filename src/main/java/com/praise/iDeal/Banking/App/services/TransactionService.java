package com.praise.iDeal.Banking.App.services;

import com.praise.iDeal.Banking.App.payload.request.TransactionRequest;

public interface TransactionService {
    void saveTransactions(TransactionRequest transactionRequest);
}
