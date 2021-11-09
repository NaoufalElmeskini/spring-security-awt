package io.nacrobate.toolbox.springboot.model.repository;

import io.nacrobate.toolbox.springboot.model.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    public List<UserDTO> getAllUsers();

    UserDTO findUserByUserName(String username);
}
