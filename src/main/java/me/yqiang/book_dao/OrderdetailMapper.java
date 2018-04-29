package me.yqiang.book_dao;

import java.util.List;

import me.yqiang.book_pojo.Item;
import me.yqiang.book_pojo.ItemIdPojo;
import me.yqiang.book_pojo.Orderdetail;
import me.yqiang.book_pojo.OrderdetailExample;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    List<ItemIdPojo> recommendItem(Long id);

    int countByExample(OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int deleteByExample(OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int insert(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int insertSelective(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    List<Orderdetail> selectByExample(OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    Orderdetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") Orderdetail record, @Param("example") OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int updateByExample(@Param("record") Orderdetail record, @Param("example") OrderdetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int updateByPrimaryKeySelective(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderdetail
     *
     * @mbggenerated Sun Apr 29 13:08:28 CST 2018
     */
    int updateByPrimaryKey(Orderdetail record);
}