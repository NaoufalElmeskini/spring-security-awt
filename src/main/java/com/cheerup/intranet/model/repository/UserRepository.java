package com.cheerup.intranet.model.repository;

import com.cheerup.intranet.model.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    public List<UserDetails> getAllUsers();

    UserDetails findUserByUserName(String username);
}
