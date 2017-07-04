package com.country.common.goods.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.goods.domain.SaleGoodsInfo;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
@Repository
public interface SaleGoodsInfoDao extends BaseRepository<SaleGoodsInfo,Long> {
}
