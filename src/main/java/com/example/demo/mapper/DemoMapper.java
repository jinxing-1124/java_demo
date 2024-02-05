package com.example.demo.mapper;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.TechEntity;
import com.example.demo.vo.DemoVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DemoMapper {

    DemoMapper INSTANCE = Mappers.getMapper(DemoMapper.class);

    List<DemoVO> demoVO(List<TechEntity> techEntity);

    TechEntity techEntity(DemoDTO demoDTO);
}
