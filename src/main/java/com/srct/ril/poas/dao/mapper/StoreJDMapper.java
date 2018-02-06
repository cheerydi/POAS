package com.srct.ril.poas.dao.mapper;

import com.srct.ril.poas.dao.pojo.StoreJD;
import com.srct.ril.poas.dao.pojo.StoreJDExample;
import java.util.List;

public interface StoreJDMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    int insert(StoreJD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    int insertSelective(StoreJD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    List<StoreJD> selectByExample(StoreJDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    StoreJD selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StoreJD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JD
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StoreJD record);
}