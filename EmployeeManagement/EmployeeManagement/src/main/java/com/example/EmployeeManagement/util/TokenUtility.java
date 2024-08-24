package com.example.EmployeeManagement.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class TokenUtility {

    public final String SECRET = "SecretKey";
    public String createToken(Long id){
        return JWT.create()
                .withClaim("id",id)
                .sign(Algorithm.HMAC256(SECRET));
    }

    public Long decodeToken(String token){
        Long emp_id = 0L;
        if(token!=null){
            emp_id =JWT.require(Algorithm.HMAC256(SECRET))
                    .build().verify(token).getClaim("id").asLong();
        }
        return emp_id;
    }
}