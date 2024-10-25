package com.anji.selenium.performance.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anji.selenium.performance.dto.NetworkDataDto;
import com.anji.selenium.performance.service.NetworkDataService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/api/network-data")
public class MetricsRestController {

	private final NetworkDataService service;
	
	public MetricsRestController(NetworkDataService service) {
		this.service = service;
	}
	
	
	@PostMapping
    public ResponseEntity<Void> saveNetworkData(@Valid @RequestBody @NotEmpty List<NetworkDataDto> dto) {
		
        service.saveNetworkData(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();  
    }
	
}
