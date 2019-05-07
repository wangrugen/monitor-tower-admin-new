package com.iotplatform.userManage.dao;

import com.iotplatform.userManage.pojo.UserRoleKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component(value = "userRoleMapper")
public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

	/**
	 * 根据用户获取用户角色中间表数据
	 * @param userId
	 * @return
	 */
	List<UserRoleKey> findByUserId(int userId);
}