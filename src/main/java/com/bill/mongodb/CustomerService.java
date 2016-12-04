package com.bill.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangbin on 16-12-4.
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    /**
     * @return 查询所有的客户信息
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }


}
