package com.country.common.activity.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.activity.domain.Activity;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
@Repository
public interface ActivityDao extends BaseRepository<Activity,Long> {
}
