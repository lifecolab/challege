package com.lifecolab.challengeMaker.match.service.impl.vo;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MatchVO {
    int id;
    String userId;
    Date createDate;
    Date modifyDate;
    String name;
    int matchType;
    Date startDate;
    Date endDate;
    String managerInfo;
    String url;
    String useYn;
}
