package com.I.LoveU.controller;

import com.I.LoveU.mapper.PhotoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rPhoto")
public class PhotoController {
    @Autowired
    private PhotoMapper photoMapper;

    @GetMapping
    public List responseRank(){
        List photo =photoMapper.getPhoto();
        return photo;
    }
}