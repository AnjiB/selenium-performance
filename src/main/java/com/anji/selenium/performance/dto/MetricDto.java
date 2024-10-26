package com.anji.selenium.performance.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MetricDto {

	@NotNull(message = "Document cannot be null")
    private String document;
   
	@NotNull(message = "Metric name cannot be null")
    private String name;
   
    @NotNull(message = "Metric value cannot be null")
    private Double value;
}
