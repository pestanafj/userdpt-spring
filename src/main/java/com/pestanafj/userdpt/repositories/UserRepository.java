package com.pestanafj.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pestanafj.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}


