package com.tehranch.paanosuperuser.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/superuser")
public class UserController {

    @GetMapping("token")
    public ResponseEntity<?> getToken(@AuthenticationPrincipal Jwt jwt){
        Map<String,String> map = new HashMap<>();
        map.put("username",jwt.getClaims().get("preferred_username").toString());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
