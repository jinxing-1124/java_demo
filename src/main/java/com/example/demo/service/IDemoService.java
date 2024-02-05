package com.example.demo.service;


import com.example.demo.dto.DemoDTO;
import com.example.demo.vo.DemoVO;
import com.example.demo.vo.MsgListVO;

public interface IDemoService {
    public MsgListVO<DemoVO> getDemoData();

    public String addDemoData(DemoDTO demoDTO);
}
