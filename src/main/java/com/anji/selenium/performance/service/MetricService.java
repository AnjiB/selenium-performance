package com.anji.selenium.performance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anji.selenium.performance.dao.MetricRepository;
import com.anji.selenium.performance.dto.MetricDto;
import com.anji.selenium.performance.entity.Metric;
import com.anji.selenium.performance.mapper.MetricMapper;

@Service
public class MetricService {

	
	@Autowired
	private MetricRepository metricRepository;
	
	
	public void saveMetricData(List<MetricDto> dto) {
		List<Metric> metricEntityList = MetricMapper.INSTANCE.toEntityList(dto);
		metricRepository.saveAll(metricEntityList);
	}
}
