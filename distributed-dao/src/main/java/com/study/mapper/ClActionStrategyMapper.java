package com.study.mapper;

import com.study.model.ClActionStrategy;
import com.study.model.ClActionStrategyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClActionStrategyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    long countByExample(ClActionStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int deleteByExample(ClActionStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int insert(ClActionStrategy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int insertSelective(ClActionStrategy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    List<ClActionStrategy> selectByExample(ClActionStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    ClActionStrategy selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") ClActionStrategy record, @Param("example") ClActionStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int updateByExample(@Param("record") ClActionStrategy record, @Param("example") ClActionStrategyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int updateByPrimaryKeySelective(ClActionStrategy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_action_strategy
     *
     * @mbg.generated Fri Sep 23 14:36:33 CST 2016
     */
    int updateByPrimaryKey(ClActionStrategy record);
}