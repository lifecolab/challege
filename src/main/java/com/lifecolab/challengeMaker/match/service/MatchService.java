package com.lifecolab.challengeMaker.match.service;

import com.lifecolab.challengeMaker.match.service.impl.vo.MatchVO;

import java.util.List;


public interface MatchService {
    public List<MatchVO> selectMatchList(MatchVO matchVO) throws Exception;
    public List<MatchVO> selectMatch(MatchVO matchVO) throws Exception;
    public int insertMatch(MatchVO matchVO) throws Exception;
    public int updateMatch(MatchVO matchVO) throws Exception;
    public int deleteMatch(MatchVO matchVO) throws Exception;
}
