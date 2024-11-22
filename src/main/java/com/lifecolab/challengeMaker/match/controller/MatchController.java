package com.lifecolab.challengeMaker.match.controller;


import com.lifecolab.challengeMaker.match.service.MatchService;
import com.lifecolab.challengeMaker.match.service.impl.vo.MatchVO;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/match")
@RequiredArgsConstructor
public class MatchController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final MatchService matchService;


    @ResponseBody
    @RequestMapping(value="/selectMatchList.do", method= {RequestMethod.GET})
    public List<MatchVO> selectMatchList(@RequestBody MatchVO matchVO) throws Exception{
        matchVO.setUserId("admin");
        return matchService.selectMatchList(matchVO);
    }

    @ResponseBody
    @RequestMapping(value="/selectMatch.do", method= {RequestMethod.GET})
    public List<MatchVO> selectMatch(@RequestBody MatchVO matchVO) throws Exception{
        return matchService.selectMatch(matchVO);
    }

    @ResponseBody
    @RequestMapping(value="/insertMatch.do", method= {RequestMethod.POST})
    public int insertMatch(@RequestBody MatchVO matchVO) throws Exception{
        int result = 0;
        result = matchService.insertMatch(matchVO);
        return result;
    }

    @ResponseBody
    @RequestMapping(value="/updateMatch.do", method= {RequestMethod.PUT})
    public int updateMatch(@RequestBody MatchVO matchVO) throws Exception{
        int result = 0;
        result = matchService.updateMatch(matchVO);
        return result;
    }

    @ResponseBody
    @RequestMapping(value="/deleteMatch.do", method= {RequestMethod.DELETE})
    public int deleteMatch(@RequestBody  MatchVO matchVO) throws Exception{
        int result = 0;
        result = matchService.deleteMatch(matchVO);
        return result;
    }
}
