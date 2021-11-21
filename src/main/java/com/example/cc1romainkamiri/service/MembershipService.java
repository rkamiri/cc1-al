package com.example.cc1romainkamiri.service;

import com.example.cc1romainkamiri.entity.Membership;
import com.example.cc1romainkamiri.entity.MembershipInformations;
import com.example.cc1romainkamiri.entity.Payment;
import com.example.cc1romainkamiri.entity.User;
import com.example.cc1romainkamiri.exeptions.BadPaymentException;
import com.example.cc1romainkamiri.exeptions.NullUserException;
import com.example.cc1romainkamiri.repository.MembershipRepository;

import java.text.ParseException;

public class MembershipService {

    MembershipRepository membershipRepository;
    UserService userService;
    PaymentService paymentService;

    public MembershipService(MembershipRepository membershipRepository, UserService userService, PaymentService paymentService) {
        this.membershipRepository = membershipRepository;
        this.userService = userService;
        this.paymentService = paymentService;
    }

    public void apply(MembershipInformations membershipInformations) throws Exception {
        User user = userService.getUser(membershipInformations.getUserId());
        if(user != null) {
            this.membershipRepository.addMemberShip(membershipInformations.getMembership());
        } else {
            throw new NullUserException();
        }
    }

    public void activate(Membership membership) throws Exception {
        boolean isPayed = paymentService.pay(membership.getCost(), membership.getUser());
        if(!isPayed){
            throw new BadPaymentException();
        } else {
            membership.setActive(true);
        }
    }

    public Membership getMembership(int id) throws ParseException {
        return membershipRepository.findById(id).orElse(null);
    }

}
