package com.anji.selenium.performance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anji.selenium.performance.dao.NetworkDataRepository;
import com.anji.selenium.performance.dto.NetworkDataDto;
import com.anji.selenium.performance.entity.NetworkData;
import com.anji.selenium.performance.mapper.NetworkDataMapper;

@Service
public class NetworkDataService {

	private final NetworkDataRepository repository;
	private final NetworkDataMapper mapper;

	public NetworkDataService(NetworkDataRepository repository, NetworkDataMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public void saveNetworkData(List<NetworkDataDto> dto) {
		List<NetworkData> entity = mapper.toEntityList(dto);
		repository.saveAll(entity);
	}
}
