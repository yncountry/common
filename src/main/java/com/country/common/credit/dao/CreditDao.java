package com.country.common.credit.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.credit.domain.Credit;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/3.
 */
@Resource
public interface CreditDao extends BaseRepository<Credit,Long> {
}
