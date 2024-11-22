package com.lifecolab.challengeMaker.match.mapper;

import com.lifecolab.challengeMaker.match.service.impl.vo.MatchVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MatchMapper {
    public List<MatchVO> selectMatchList(MatchVO matchVO);

    public List<MatchVO> selectMatch(MatchVO matchVO);

    public int insertMatch(MatchVO matchVO);

    public int updateMatch(MatchVO matchVO);

    public int deleteMatch(MatchVO matchVO);
}
