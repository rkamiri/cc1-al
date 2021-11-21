package com.example.cc1romainkamiri.repository;

import com.example.cc1romainkamiri.entity.Membership;

import java.text.ParseException;
import java.util.Optional;

public interface MembershipRepository {

    Optional<Membership> findById(int membershipId) throws ParseException;
    void addMemberShip(Membership membership);
}
