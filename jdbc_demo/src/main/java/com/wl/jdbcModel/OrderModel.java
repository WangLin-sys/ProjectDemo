package com.wl.jdbcModel;

import lombok.Data;

/**
 * @Author W Lin
 * @Description
 * @Date 2020/5/28 22:34
 **/
@Data
public class OrderModel {

    private Integer orderid;
    private String  orderName;
    private String  orderType;
    private Integer orderPrice;
}
