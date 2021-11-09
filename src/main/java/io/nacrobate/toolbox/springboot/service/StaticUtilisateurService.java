package io.nacrobate.toolbox.springboot.service;

import io.nacrobate.toolbox.springboot.model.dto.UserDTO;
import io.nacrobate.toolbox.springboot.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
