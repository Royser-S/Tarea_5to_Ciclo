package com.tarea03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	// 1. FILTRO DE SEGURIDAD (Las reglas del portero)
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Desactivamos CSRF solo para facilitar pruebas en Postman (en prod se deja activo)
            .csrf(csrf -> csrf.disable()) 
            
            // Configuramos quién puede entrar a dónde
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/publico").permitAll() // Deja pasar a todos aquí
                .anyRequest().authenticated()                // Para TODO lo demás, pide contraseña
            )
            
            // Indicamos que usaremos autenticación tipo "Basic Auth" (la ventanita del navegador)
            .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    // 2. ADMINISTRADOR DE USUARIOS (La lista de invitados)
    @Bean
    public UserDetailsService userDetailsService() {
        // Creamos un usuario en memoria
        UserDetails usuarioAdmin = User.builder()
            .username("admin")
            // {noop} significa "No Operation", o sea, sin encriptar (solo para pruebas básicas)
            .password("{noop}12345") 
            .roles("ADMIN")
            .build();

        // Creamos un usuario normal
        UserDetails usuarioUser = User.builder()
            .username("user")
            .password("{noop}12345")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(usuarioAdmin, usuarioUser);
    }

}
