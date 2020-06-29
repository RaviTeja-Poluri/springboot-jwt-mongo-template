package com.teja.template.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {

    private String token;
    private String id;
    private String userName;
    private String email;
    private List<String> roles;
}
