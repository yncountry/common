package com.country.common.extend.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.extend.domain.Extend;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
@Repository
public interface ExtendDao extends BaseRepository<Extend,Long> {
}
