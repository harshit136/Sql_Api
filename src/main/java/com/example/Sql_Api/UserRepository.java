package com.example.Sql_Api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //First part in <>:with whom to connect(Entity),what is datatype of primary key

}