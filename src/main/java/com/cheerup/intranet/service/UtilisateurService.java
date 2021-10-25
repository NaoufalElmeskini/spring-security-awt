package com.cheerup.intranet.service;

import com.cheerup.intranet.model.dto.UserDTO;

import java.util.List;

public interface UtilisateurService {

    UserDTO getInformationsUtilisateur(String username);

    List<UserDTO> getAllUtilisateurs();
}
