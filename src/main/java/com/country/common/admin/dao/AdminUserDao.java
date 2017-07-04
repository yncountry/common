package com.country.common.admin.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.admin.domain.AdminUser;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/5/16
 * @vsrsion
 * @desc
 */
@Repository
public interface AdminUserDao extends BaseRepository<AdminUser,Long> {

    AdminUser findByLoginName(String loginName);
}
