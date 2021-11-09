package io.nacrobate.toolbox.springboot.service;

import io.nacrobate.toolbox.springboot.model.dto.UserDTO;

import java.util.List;

public interface UtilisateurService {

    UserDTO getInformationsUtilisateur(String username);

    List<UserDTO> getAllUtilisateurs();
}
