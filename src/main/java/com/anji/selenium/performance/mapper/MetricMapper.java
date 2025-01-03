package com.anji.selenium.performance.mapper;

import com.anji.selenium.performance.dto.MetricDto;
import com.anji.selenium.performance.entity.Metric;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MetricMapper {

  MetricMapper INSTANCE = Mappers.getMapper(MetricMapper.class);

  Metric toEntity(MetricDto dto);

  List<Metric> toEntityList(List<MetricDto> dtoList);
}
