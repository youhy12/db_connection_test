package com.example.db_connection_test.repository;

import com.example.db_connection_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
