package com.example.cc1romainkamiri.tmp;

import com.example.cc1romainkamiri.entity.Membership;
import com.example.cc1romainkamiri.entity.MembershipInformations;
import com.example.cc1romainkamiri.entity.Payment;
import com.example.cc1romainkamiri.entity.User;
import com.example.cc1romainkamiri.repository.MembershipRepository;
import com.example.cc1romainkamiri.repository.PaymentRepository;
import com.example.cc1romainkamiri.repository.UserRepository;
import com.example.cc1romainkamiri.service.MembershipService;
import com.example.cc1romainkamiri.service.PaymentService;
import com.example.cc1romainkamiri.service.UserService;

import javax.swing.text.html.Option;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class Generator {
    public static User generateUser(){
        return new User(1, "romain", "kamiri", "abb", "romain.kamiri@email.com");
    }

    public static Membership generateMembership() throws ParseException {
        Date begin = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
        Date end = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022");
        return new Membership(1, begin, end, false, generateUser(), 40);
    }

    public static Payment generatePayment() throws ParseException {
        return new Payment(1, false, 25, generateUser());
    }

    private static MembershipRepository generateMembershipRepository(){
        return new MembershipRepository() {
            @Override
            public Optional<Membership> findById(int membershipId) throws ParseException {
                return Optional.of(generateMembership());
            }

            @Override
            public void addMemberShip(Membership membership) {

            }

        };
    }

    private static UserRepository generateUserRepository() {
        return new UserRepository() {
            @Override
            public Optional<User> findById(int userId) {
                return Optional.of(generateUser());
            }

            @Override
            public void addUser(User user) {

            }

            @Override
            public void deleteUser(User user) {

            }

            @Override
            public void saveUser(User user) {

            }
        };
    }

    private static PaymentRepository generatePaymentRepository(){
        return new PaymentRepository() {
            @Override
            public Optional<Payment> findById(int id) throws ParseException {
                return Optional.of(generatePayment());
            }

            @Override
            public void addPayment(Payment payment) {

            }

            @Override
            public void savePayment(Payment payment) {

            }
        };
    }

    private static UserService generateUserService(){
        return new UserService(generateUserRepository());
    }

    private static PaymentService generatePaymentService(){
        return new PaymentService(generatePaymentRepository());
    }

    public static MembershipService generateMembershipService() {
        return new MembershipService(generateMembershipRepository(), generateUserService(), generatePaymentService());
    }

    public static MembershipInformations generateMembershipInformations() throws ParseException {
        return new MembershipInformations(1, generateMembership());
    }
}
