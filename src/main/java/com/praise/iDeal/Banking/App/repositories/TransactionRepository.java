package com.praise.iDeal.Banking.App.repositories;

import com.praise.iDeal.Banking.App.domain.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions, String> {
}
