package com.anji.selenium.performance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anji.selenium.performance.entity.NetworkData;

public interface NetworkDataRepository extends JpaRepository<NetworkData, Long> {}

