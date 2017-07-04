package com.country.common.admin.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.admin.domain.Permission;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/5/23
 * @vsrsion
 * @desc
 */
@Repository
public interface PermissionDao extends BaseRepository<Permission,Long> {
}
