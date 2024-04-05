package com.praise.iDeal.Banking.App.domain.entities;

import com.praise.iDeal.Banking.App.domain.enums.Roles;

import com.praise.iDeal.Banking.App.validations.ValidEmail;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity extends RootClass implements UserDetails {
    private String firstName;
    private String lastName;
    private String otherName;
    private String stateOfOrigin;
    private String accountNumber;
    private String phoneNumber;
    private String address;
    private String profilePicture;
    private String password;
    @ValidEmail
    @Email(message = "Invalid email")
    private String email;
    private String alternativePhoneNumber;
    private BigDecimal accountBalance;
    private String status;
    private String gender;
    @Enumerated(EnumType.STRING)
    private Roles roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(roles.name()));
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
