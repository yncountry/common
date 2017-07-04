package com.country.common.expand.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.expand.domain.Expand;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
@Repository
public interface ExpandDao extends BaseRepository<Expand,Long> {
}
