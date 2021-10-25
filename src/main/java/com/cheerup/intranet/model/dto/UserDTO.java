package com.cheerup.intranet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements UserDetails {

    private Long id;

    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private String email;

    private Date lastLoginDate;

    private String[] roles;
    private String[] authorities;

    private boolean isActive;
    private boolean isAccountNonLocked;

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.stream(authorities)
                .map(aut -> new SimpleGrantedAuthority(aut))
                .collect(Collectors.toList());
    }
}
