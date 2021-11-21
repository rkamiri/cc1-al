package com.example.cc1romainkamiri.entity;

import java.util.Objects;

public class MembershipInformations {
    private final int userId;
    private final Membership membership;

    public MembershipInformations(int userId, Membership membership) {
        this.userId = userId;
        this.membership = Objects.requireNonNull(membership);
    }

    public MembershipInformations of(int UserId, Membership membership) {
        return new MembershipInformations(userId, membership);
    }

    public int getUserId() {
        return userId;
    }

    public Membership getMembership() {
        return membership;
    }
}
