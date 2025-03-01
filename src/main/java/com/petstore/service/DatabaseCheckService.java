package com.petstore.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseCheckService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void checkDatabaseConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            System.out.println("✅ Connexion à la base de données réussie !");
        } catch (Exception e) {
            System.err.println("❌ Erreur de connexion à la base de données : " + e.getMessage());
        }
    }
}
