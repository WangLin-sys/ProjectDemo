package com.wl.jdbcController;

import com.wl.jdbcModel.OrderModel;
import com.wl.jdbcService.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author W Lin
 * @Description
 * @Date 2020/5/28 22:24
 **/
@RestController
@RequestMapping("jdbc")
public class JdbcController {

    @Autowired
    private JdbcService jdbcService;
    @RequestMapping("testjdbc")
    public List<OrderModel> testJdbc(){

        return jdbcService.testJdbc();
    }






}
