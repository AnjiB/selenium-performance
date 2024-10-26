package com.anji.selenium.performance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anji.selenium.performance.dao.NetworkDataRepository;
import com.anji.selenium.performance.dto.NetworkDataDto;
import com.anji.selenium.performance.entity.NetworkData;
import com.anji.selenium.performance.mapper.NetworkDataMapper;

@Service
public class NetworkDataService {

	@Autowired
	private NetworkDataRepository networkDataRepository;
	
	public void saveNetworkData(List<NetworkDataDto> dto) {
		List<NetworkData> networkDataEntityList = NetworkDataMapper.INSTANCE.toEntityList(dto);
		networkDataRepository.saveAll(networkDataEntityList);
	}
}
