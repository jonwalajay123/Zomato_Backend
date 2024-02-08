package com.food.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Transaction;
import com.food.repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction updateTransaction(Long id, Transaction transactionDetails) {
        return transactionRepository.findById(id).map(transaction -> {
            transaction.setPaymentMethod(transactionDetails.getPaymentMethod());
            transaction.setActive(transactionDetails.getActive());
            transaction.setTransactionStatus(transactionDetails.getTransactionStatus());
            transaction.setDatetime(transactionDetails.getDatetime());
            return transactionRepository.save(transaction);
        }).orElseGet(() -> transactionRepository.save(transactionDetails));
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}

