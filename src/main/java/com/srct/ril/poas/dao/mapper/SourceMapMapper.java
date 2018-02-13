package com.srct.ril.poas.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.srct.ril.poas.dao.pojo.SourceMap;
import com.srct.ril.poas.dao.pojo.SourceMapExample;

public interface SourceMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int countByExample(SourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int deleteByExample(SourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int insert(SourceMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int insertSelective(SourceMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    List<SourceMap> selectByExample(SourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    SourceMap selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SourceMap record, @Param("example") SourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SourceMap record, @Param("example") SourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SourceMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sourcemap_
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SourceMap record);
}