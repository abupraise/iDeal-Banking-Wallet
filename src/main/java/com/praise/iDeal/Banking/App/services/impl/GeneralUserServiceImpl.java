package com.praise.iDeal.Banking.App.services.impl;

import com.praise.iDeal.Banking.App.domain.entities.UserEntity;
import com.praise.iDeal.Banking.App.infrastructure.config.JwtAuthFilterConfig;
import com.praise.iDeal.Banking.App.infrastructure.config.JwtTokenProvider;
import com.praise.iDeal.Banking.App.payload.response.BankResponse;
import com.praise.iDeal.Banking.App.repositories.UserRepository;
import com.praise.iDeal.Banking.App.services.GeneralUserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GeneralUserServiceImpl implements GeneralUserService {
    private final FileUploadServiceImpl fileUploadService;
    private final UserRepository userRepository;
    private final JwtAuthFilterConfig authFilter;
    private final HttpServletRequest request;
    private final JwtTokenProvider jwtTokenProvider;

    public ResponseEntity<BankResponse<String>> uploadProfilePics(MultipartFile profilePics){
        String token = authFilter.getTokenFromRequest(request);
        String email = jwtTokenProvider.getUserName(token);

        Optional<UserEntity> userEntityOptional = userRepository.findByEmail(email);

        String fileUrl = null;

        try{
            if(userEntityOptional.isPresent()){
                fileUrl = fileUploadService.uploadFile(profilePics);

                UserEntity userEntity = userEntityOptional.get();
                userEntity.setProfilePicture(fileUrl);

                userRepository.save(userEntity);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        return ResponseEntity.ok(
                new BankResponse<>("Uploaded Successfullly",
                        fileUrl
                )
        );
    }

}
