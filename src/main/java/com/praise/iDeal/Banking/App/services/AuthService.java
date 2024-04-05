package com.praise.iDeal.Banking.App.services;

import com.praise.iDeal.Banking.App.payload.request.LoginRequest;
import com.praise.iDeal.Banking.App.payload.request.UserRequest;
import com.praise.iDeal.Banking.App.payload.response.ApiResponse;
import com.praise.iDeal.Banking.App.payload.response.BankResponse;
import com.praise.iDeal.Banking.App.payload.response.JwtAuthResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    BankResponse registerUser(UserRequest userRequest);
    ResponseEntity<ApiResponse<JwtAuthResponse>> login(LoginRequest loginRequest);
}
