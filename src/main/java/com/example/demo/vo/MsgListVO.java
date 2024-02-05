package com.example.demo.vo;

import lombok.Data;

import java.util.List;

@Data
public class MsgListVO<T> {

    private Integer code;

    private String msg;

    private List<T> data;


}
