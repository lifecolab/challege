package com.lifecolab.challengeMaker.match.service.impl;

import com.lifecolab.challengeMaker.match.mapper.MatchMapper;
import com.lifecolab.challengeMaker.match.service.MatchService;
import com.lifecolab.challengeMaker.match.service.impl.vo.MatchVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MatchService")
@RequiredArgsConstructor
public class MatchServiceImpl implements MatchService {

    private final MatchMapper matchMapper;
    @Override
    public List<MatchVO> selectMatchList(MatchVO matchVO) throws Exception {
        return matchMapper.selectMatchList(matchVO);
    }

    @Override
    public List<MatchVO> selectMatch(MatchVO matchVO) throws Exception {
        return matchMapper.selectMatch(matchVO);
    }

    @Override
    public int insertMatch(MatchVO matchVO) throws Exception {
        return matchMapper.insertMatch(matchVO);
    }

    @Override
    public int updateMatch(MatchVO matchVO) throws Exception {
        return matchMapper.updateMatch(matchVO);
    }

    @Override
    public int deleteMatch(MatchVO matchVO) throws Exception {
        return matchMapper.deleteMatch(matchVO);
    }
}
