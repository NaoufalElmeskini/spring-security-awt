package com.cheerup.intranet.model.repository;

import com.cheerup.intranet.model.dto.UserDTO;
import com.cheerup.intranet.model.enums.Authority;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class StaticUserRepositoryImpl implements UserRepository {
    private Logger LOGGER = LoggerFactory.getLogger(StaticUserRepositoryImpl.class);


    private Map<String, UserDTO> USERS = initMap();

    private Map<String, UserDTO> initMap() {
        Map<String, UserDTO> map = new HashMap<>();

        UserDTO user = createUser("user-1");
        map.put(user.getUsername(), user);
        user = createUser("admin-1");
        map.put(user.getUsername(), user);

        return map;
    }


    @Override
    public List<UserDetails> getAllUsers() {
        return new ArrayList<>(USERS.values());
    }


    @Override
    public UserDetails findUserByUserName(String username) {
        return USERS.get(username);
    }

    private UserDTO createUser(String username) {
        UserDTO user = new UserDTO();

        user.setActive(true);

        user.setUsername(username);
        user.setPassword("******");

        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john@doe.com");

        addStaticAuthority(user);

        return user;
    }

    private void addStaticAuthority(UserDTO user) {
        List<String> authorities = new ArrayList<>();

        if (StringUtils.containsIgnoreCase(user.getUsername(), Authority.ADMIN.name())) {
            authorities.add(Authority.ADMIN.name());
        } else {
            authorities.add(Authority.USER.name());
        }

        LOGGER.debug(authorities.toString());

        user.setAuthorities(authorities.toArray(new String[0]));
    }
}
