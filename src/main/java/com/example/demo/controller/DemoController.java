package com.example.demo.controller;


import com.example.demo.dto.DemoDTO;
import com.example.demo.service.IDemoService;
import com.example.demo.vo.DemoVO;
import com.example.demo.vo.MsgListVO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("demo")
public class DemoController {

    private final IDemoService demoService;

    @Autowired
    public DemoController(IDemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping()
    public ResponseEntity<MsgListVO<DemoVO>> getDemoData() {
        return new ResponseEntity<>(demoService.getDemoData(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> addDemoData(@RequestBody(required=true) @Valid DemoDTO demoDTO) {
        return new ResponseEntity<>(demoService.addDemoData(demoDTO), HttpStatus.OK);
    }
}
