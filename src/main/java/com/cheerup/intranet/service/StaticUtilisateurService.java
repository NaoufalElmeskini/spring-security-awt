package com.cheerup.intranet.service;

import com.cheerup.intranet.model.dto.UserDTO;
import com.cheerup.intranet.model.enums.Authority;
import com.cheerup.intranet.model.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaticUtilisateurService implements UtilisateurService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getInformationsUtilisateur(String username) throws UsernameNotFoundException {

        return userRepository.findUserByUserName(username);

    }

    @Override
    public List<UserDTO> getAllUtilisateurs() {
        return userRepository.getAllUsers();
    }

}
