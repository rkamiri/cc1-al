package com.example.cc1romainkamiri.service;

import com.example.cc1romainkamiri.entity.User;
import com.example.cc1romainkamiri.tmp.Generator;
import com.example.cc1romainkamiri.entity.Payment;
import com.example.cc1romainkamiri.repository.PaymentRepository;

import java.text.ParseException;

public class PaymentService {

    PaymentRepository paymentRepository;
    ExternalPaymentService externalPaymentService;
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
        this.externalPaymentService = new ExternalPaymentService();
    }

    public int generatePayment(Payment payment){
        paymentRepository.addPayment(payment);
        //todo
        return payment.getId();
    }

    public void savePayment(Payment payment){
        paymentRepository.savePayment(payment);
    }

    public Payment getPayment(int id) throws ParseException {
        //return paymentRepository.findById(id).orElse(null);
        return Generator.generatePayment();
    }

    public boolean pay(double amount, User user) {
        Payment payment = new Payment(0, false, amount, user);
        generatePayment(payment);
        boolean isPayed = externalPaymentService.callExternalPayment(payment);
        payment.setPayed(isPayed);
        savePayment(payment);
        return isPayed;
    }
}
