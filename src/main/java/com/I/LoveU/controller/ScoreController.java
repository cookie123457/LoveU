package com.I.LoveU.controller;

import com.I.LoveU.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rRank")
public class ScoreController {
    @Autowired
    private ScoreMapper scoreMapper;

    @GetMapping
    public List responseRank(){
        List score=scoreMapper.getScore();
        return score;
    }
}
