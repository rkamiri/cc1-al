package com.example.cc1romainkamiri.repository;

import com.example.cc1romainkamiri.entity.Payment;

import java.text.ParseException;
import java.util.Optional;

public interface PaymentRepository {

    Optional<Payment> findById(int id) throws ParseException;
    void addPayment(Payment payment);
    void savePayment(Payment payment);
}
