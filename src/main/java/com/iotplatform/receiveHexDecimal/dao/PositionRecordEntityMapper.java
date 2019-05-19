package com.iotplatform.receiveHexDecimal.dao;

import com.iotplatform.receiveHexDecimal.entity.PositionRecordEntity;
import com.iotplatform.receiveHexDecimal.entity.PositionRecordEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionRecordEntityMapper {
    int countByExample(PositionRecordEntityExample example);

    int deleteByExample(PositionRecordEntityExample example);

    int insert(PositionRecordEntity record);

    int insertSelective(PositionRecordEntity record);

    List<PositionRecordEntity> selectByExample(PositionRecordEntityExample example);

    int updateByExampleSelective(@Param("record") PositionRecordEntity record, @Param("example") PositionRecordEntityExample example);

    int updateByExample(@Param("record") PositionRecordEntity record, @Param("example") PositionRecordEntityExample example);
}