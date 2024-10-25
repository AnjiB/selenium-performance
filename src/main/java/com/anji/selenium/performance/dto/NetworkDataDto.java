package com.anji.selenium.performance.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class NetworkDataDto {
	
	@NotNull(message = "url cannot be null")
    private String url;
    
    @NotNull(message = "Response status cannot be null")
    @Min(value = 100, message = "Response status must be at least 100")
    @Max(value = 599, message = "Response status must be at most 599")
    private Integer status;
    
    @NotNull(message = "Response time cannot be null")
    private Float responseTime;
}

