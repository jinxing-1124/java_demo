package com.example.demo.service.impl;


import com.example.demo.dao.IDemoRepository;
import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.TechEntity;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.IDemoService;
import com.example.demo.vo.DemoVO;
import com.example.demo.vo.MsgListVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DemoServiceImpl implements IDemoService {

    private final IDemoRepository demoRepository;

    public DemoServiceImpl(IDemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public MsgListVO<DemoVO> getDemoData() {
        List<TechEntity> resultList = demoRepository.findAll();
        List<DemoVO> demoVOList = DemoMapper.INSTANCE.demoVO(resultList);

        MsgListVO<DemoVO> data = new MsgListVO<>();

        data.setCode(200);
        data.setMsg("success");
        data.setData(demoVOList);

        return data;
    }

    @Override
    public String addDemoData(DemoDTO demoDTO){

        TechEntity entity = DemoMapper.INSTANCE.techEntity(demoDTO);

        demoRepository.save(entity);

        return "success";
    }
}
