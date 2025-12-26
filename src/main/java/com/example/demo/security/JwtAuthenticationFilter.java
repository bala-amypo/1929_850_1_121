package com.example.demo.security;

import jakarta.servlet.*;
import java.io.IOException;

public class JwtAuthenticationFilter implements Filter {
    public void doFilter(ServletRequest r, ServletResponse s, FilterChain c)
            throws IOException, ServletException {
        c.doFilter(r, s);
    }
}
