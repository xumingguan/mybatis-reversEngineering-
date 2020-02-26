package com.xuxiaoguan.growthelectronic.dao.mapper.operation;

import com.xuxiaoguan.growth.electronic.dao.model.operation.PrizeRecord;

public interface PrizeRecordMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(PrizeRecord record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(PrizeRecord record);

    /**
     *
     * @mbggenerated
     */
    PrizeRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PrizeRecord record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PrizeRecord record);
}