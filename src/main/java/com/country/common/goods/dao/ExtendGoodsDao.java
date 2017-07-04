package com.country.common.goods.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.goods.domain.ExtendGoods;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/6/26
 * @vsrsion
 * @desc
 */
@Repository
public interface ExtendGoodsDao extends BaseRepository<ExtendGoods,Long> {
}
