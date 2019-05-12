package com.iotplatform.receiveHexDecimal.dao;

import com.iotplatform.receiveHexDecimal.entity.ReceiveHexDecimalEntity;
import com.iotplatform.receiveHexDecimal.entity.ReceiveHexDecimalEntityExample;
import com.iotplatform.receiveHexDecimal.param.ReceiveHexDecimalParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ReceiveHexDecimalEntityMapper {
    int countByExample(ReceiveHexDecimalEntityExample example);

    int deleteByExample(ReceiveHexDecimalEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReceiveHexDecimalEntity record);

    int insertSelective(ReceiveHexDecimalEntity record);

    List<ReceiveHexDecimalEntity> selectByExample(ReceiveHexDecimalEntityExample example);

    ReceiveHexDecimalEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReceiveHexDecimalEntity record, @Param("example") ReceiveHexDecimalEntityExample example);

    int updateByExample(@Param("record") ReceiveHexDecimalEntity record, @Param("example") ReceiveHexDecimalEntityExample example);

    int updateByPrimaryKeySelective(ReceiveHexDecimalEntity record);

    int updateByPrimaryKey(ReceiveHexDecimalEntity record);

    List<Object> list(ReceiveHexDecimalParam vo, RowBounds toRowBounds);
}