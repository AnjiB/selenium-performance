package com.anji.selenium.performance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anji.selenium.performance.entity.Metric;

public interface MetricRepository extends JpaRepository<Metric, Long> {}

