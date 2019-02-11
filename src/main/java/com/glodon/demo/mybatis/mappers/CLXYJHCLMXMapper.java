package com.glodon.demo.mybatis.mappers;

import com.glodon.demo.mybatis.models.CLXYJHCLMX;
import com.glodon.demo.mybatis.models.CLXYJHCLMXExample;
import java.util.List;

public interface CLXYJHCLMXMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    int insert(CLXYJHCLMX record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    int insertSelective(CLXYJHCLMX record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    List<CLXYJHCLMX> selectByExample(CLXYJHCLMXExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    CLXYJHCLMX selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CLXYJHCLMX record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clxyjhclmx
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CLXYJHCLMX record);
}