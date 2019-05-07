package com.iotplatform.picValidation.dao;

import com.iotplatform.picValidation.entity.PicValidationEntity;
import com.iotplatform.picValidation.entity.PicValidationEntityExample;
import com.iotplatform.picValidation.param.PicTesParam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface PicValidationEntityMapper {


    List<Object> list(PicTesParam param, RowBounds page);

    int countByExample(PicValidationEntityExample example);

    int deleteByExample(PicValidationEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PicValidationEntity record);

    int insertSelective(PicValidationEntity record);

    List<PicValidationEntity> selectByExample(PicValidationEntityExample example);

    PicValidationEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PicValidationEntity record, @Param("example") PicValidationEntityExample example);

    int updateByExample(@Param("record") PicValidationEntity record, @Param("example") PicValidationEntityExample example);

    int updateByPrimaryKeySelective(PicValidationEntity record);

    int updateByPrimaryKey(PicValidationEntity record);
}