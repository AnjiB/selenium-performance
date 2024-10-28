package com.anji.selenium.performance.mapper;

import com.anji.selenium.performance.dto.NetworkDataDto;
import com.anji.selenium.performance.entity.NetworkData;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface NetworkDataMapper {

  NetworkDataMapper INSTANCE = Mappers.getMapper(NetworkDataMapper.class);

  NetworkData toEntity(NetworkDataDto dto);

  List<NetworkData> toEntityList(List<NetworkDataDto> dtoList);
}
