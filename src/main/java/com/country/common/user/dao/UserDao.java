package com.country.common.user.dao;

import cn.gfire.base.jpa.dao.BaseRepository;
import com.country.common.user.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author wust
 * @date 2017/6/11
 * @vsrsion
 * @desc
 */

@Repository
public interface UserDao extends BaseRepository<User,Long> {


    public User findByPhoneNo(String phoneNo);
}
