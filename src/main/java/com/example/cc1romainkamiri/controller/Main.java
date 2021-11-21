package com.example.cc1romainkamiri.controller;

import com.example.cc1romainkamiri.entity.MembershipInformations;
import com.example.cc1romainkamiri.service.MembershipService;
import com.example.cc1romainkamiri.tmp.Generator;


public class Main {
    public static void main(String[] args) throws Exception {

        MembershipInformations membershipInformations = Generator.generateMembershipInformations();
        //try to apply to membership
        MembershipService ms = Generator.generateMembershipService();
        ms.apply(membershipInformations);
        ms.activate(membershipInformations.getMembership());
        System.out.println("is membership active ? " + (membershipInformations.getMembership().isActive() ? "yes" : "no"));
    }
}
