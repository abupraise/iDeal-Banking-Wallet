package com.praise.iDeal.Banking.App.services.impl;

import com.praise.iDeal.Banking.App.domain.entities.Transactions;
import com.praise.iDeal.Banking.App.payload.request.TransactionRequest;
import com.praise.iDeal.Banking.App.repositories.TransactionRepository;
import com.praise.iDeal.Banking.App.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    @Override
    public void saveTransactions(TransactionRequest transactionRequest) {
        Transactions transactions = Transactions.builder()
                .transactionType(transactionRequest.getTransactionType())
                .accountNumber(transactionRequest.getAccountNumber())
                .amount(transactionRequest.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transactions);

        System.out.println("Transaction saved successfully");
    }
}
