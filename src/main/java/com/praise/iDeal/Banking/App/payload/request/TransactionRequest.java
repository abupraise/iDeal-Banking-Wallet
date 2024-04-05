package com.praise.iDeal.Banking.App.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionRequest {

    private String transactionType;
    private String accountNumber;
    private BigDecimal amount;
    private String status;
}
