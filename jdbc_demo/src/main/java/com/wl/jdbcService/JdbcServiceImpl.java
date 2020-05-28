package com.wl.jdbcService;

import com.wl.jdbcModel.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author W Lin
 * @Description
 * @Date 2020/5/28 22:28
 **/
@Service
public class JdbcServiceImpl implements JdbcService{


    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<OrderModel> testJdbc() {

        String sql = " SELECT * FROM `order` ";

        List<OrderModel> orderlist = jdbcTemplate.query(sql, new RowMapper<OrderModel>() {
            OrderModel order = null;
            @Override
            public OrderModel mapRow(ResultSet rs, int i) throws SQLException {
                order = new OrderModel();
                order.setOrderid(rs.getInt("orderid"));
                order.setOrderName(rs.getString("orderName"));
                order.setOrderType(rs.getString("orderType"));
                order.setOrderPrice(rs.getInt("orderPrice"));
                return order;
            }
        });
        return orderlist ;
    }
}
