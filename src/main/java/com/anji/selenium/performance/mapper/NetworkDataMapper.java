package com.anji.selenium.performance.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.anji.selenium.performance.dto.NetworkDataDto;
import com.anji.selenium.performance.entity.NetworkData;


@Mapper(componentModel = "spring")
public interface NetworkDataMapper {
	
    NetworkDataMapper INSTANCE = Mappers.getMapper(NetworkDataMapper.class);

    NetworkData toEntity(NetworkDataDto dto);
    NetworkDataDto toDto(NetworkData entity);
    
    List<NetworkData> toEntityList(List<NetworkDataDto> dtoList);
    List<NetworkDataDto> toDtoList(List<NetworkData> entityList);
}

