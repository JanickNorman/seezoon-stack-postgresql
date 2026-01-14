package com.seezoon.dao.modules.sys;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.seezoon.dao.framework.CrudDao;
import com.seezoon.dao.modules.sys.entity.SysUser;

/**
 * User Information
 * @author seezoon-generator 2021-01-16 11:55:54 PM
 */
@Repository
@Mapper
public interface SysUserDao extends CrudDao<SysUser, Integer> {

}