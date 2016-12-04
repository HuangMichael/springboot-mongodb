package com.bill.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huangbin on 16-12-4.
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    /**
     * @return 初始化显示列表信息
     */
    @RequestMapping (value = "/")
    public  String list(){
        return "customer/list";
    }


    /**
     * @return 查询所有的客户信息
     */
    @RequestMapping (value = "/findAll")
    @ResponseBody
    public List<Customer> findAll(){
        return customerService.findAll();
    }

}
