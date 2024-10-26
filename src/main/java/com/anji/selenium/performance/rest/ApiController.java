package com.anji.selenium.performance.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anji.selenium.performance.dto.MetricDto;
import com.anji.selenium.performance.dto.NetworkDataDto;
import com.anji.selenium.performance.service.MetricService;
import com.anji.selenium.performance.service.NetworkDataService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private NetworkDataService networkDataService;
	
	@Autowired
	private MetricService metricService;
	
	
	@PostMapping(value = "/network-data", consumes = "application/json")
    public ResponseEntity<Void> saveNetworkData(@Valid @RequestBody @NotEmpty List<NetworkDataDto> networkDto) {
        networkDataService.saveNetworkData(networkDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();  
    }
	
	@PostMapping(value = "/performance-metrics", consumes = "application/json")
    public ResponseEntity<Void> savePerformanceMetrics(@Valid @RequestBody @NotEmpty List<MetricDto> metricDto) {
		
		metricService.saveMetricData(metricDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();  
    }
	
}
