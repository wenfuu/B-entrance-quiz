package com.thoughtworks.capability.gtb.entrancequiz.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;

@Configuration
public class SecurityConfig {
    private final String allowedOrigins = "http://localhost:1234";

    private final static List<String> ALLOW_ALL_LIST = singletonList("*");
    private static final List<String> ALLOWED_RESPONSE_HEADERS = Collections.singletonList("Location");

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList(allowedOrigins.split(",")));
        configuration.setAllowedMethods(ALLOW_ALL_LIST);
        configuration.setAllowedHeaders(ALLOW_ALL_LIST);
        configuration.setExposedHeaders(ALLOWED_RESPONSE_HEADERS);
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
