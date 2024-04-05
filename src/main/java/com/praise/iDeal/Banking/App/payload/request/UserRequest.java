package com.praise.iDeal.Banking.App.payload.request;

import com.praise.iDeal.Banking.App.domain.enums.Roles;
import com.praise.iDeal.Banking.App.validations.ValidEmail;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    @Size(min = 2, max = 50, message = "First name must be at least 2 characters")
    @NotBlank(message = "First name must not be blank")
    private String firstName;

    @Size(min = 2, max = 50, message = "Last name must be at least 2 characters")
    @NotBlank(message = "Last name must not be blank")
    private String lastName;

    private String otherName;

    @Size(min = 11, max = 15, message = "Phone Number must be at least 11 numbers")
    @NotBlank(message = "Phone Number must not be blank")
    @Digits(fraction = 0, integer = 11, message = "Phone number is incorrect")
    private String phoneNumber;

    private String stateOfOrigin;

    private String address;

    @NotBlank(message = "Password must not be empty")
    private String password;
    @ValidEmail
    @Email(message = "Invalid email")
    @NotBlank(message = "Email must not be empty")
    private String email;

    private String alternativePhoneNumber;
}
