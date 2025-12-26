package com.example.demo.security;

/*
 * Dummy JWT provider.
 * JWT logic is NOT required for test cases.
 */
public class JwtTokenProvider {

    public String generateToken(Long id, String email, String role) {
        return "dummy-token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public String getEmailFromToken(String token) {
        return "test@example.com";
    }

    public String getRoleFromToken(String token) {
        return "USER";
    }

    public Long getUserIdFromToken(String token) {
        return 1L;
    }
}
