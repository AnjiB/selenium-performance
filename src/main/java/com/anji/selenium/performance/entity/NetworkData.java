package com.anji.selenium.performance.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "network_data")
public class NetworkData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private Integer status;
    private Float responseTime;
    private Float predictedResponseTime;
    private LocalDateTime timestamp = LocalDateTime.now();
}

