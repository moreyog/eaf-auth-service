package com.eaf.auth.repository;

import com.eaf.auth.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByName(String username);
}
