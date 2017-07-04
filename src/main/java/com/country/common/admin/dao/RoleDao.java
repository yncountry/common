package com.country.common.admin.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.admin.domain.Role;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/5/23
 * @vsrsion
 * @desc
 */
@Repository
public interface RoleDao extends BaseRepository<Role,Long> {
}
