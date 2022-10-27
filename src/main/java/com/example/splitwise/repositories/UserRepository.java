package com.example.splitwise.repositories;

import com.example.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    BTC hibernate will create a sql query based on the method name
    List<User> findUsersByNameContainingAndPhoneNumberContaining(String name, String phoneNumber);

//    to save to DB
//    If user have an Id which is already present in db it will update that record else create new one.
    User save(User user);

    User findUsersById(Long id);
}
