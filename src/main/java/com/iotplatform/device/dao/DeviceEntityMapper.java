package com.iotplatform.device.dao;

import com.iotplatform.device.entity.DeviceEntity;
import com.iotplatform.device.entity.DeviceEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceEntityMapper {
    int countByExample(DeviceEntityExample example);

    int deleteByExample(DeviceEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceEntity record);

    int insertSelective(DeviceEntity record);

    List<DeviceEntity> selectByExample(DeviceEntityExample example);

    DeviceEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceEntity record, @Param("example") DeviceEntityExample example);

    int updateByExample(@Param("record") DeviceEntity record, @Param("example") DeviceEntityExample example);

    int updateByPrimaryKeySelective(DeviceEntity record);

    int updateByPrimaryKey(DeviceEntity record);
}