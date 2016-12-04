package com.bill.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * mongodb dao
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

     /**
      * @param firstName
      * @return
      */
     Customer findByFirstName(String firstName);


     /**
      * @param lastName
      * @return
      */
     List<Customer> findByLastName(String lastName);

}
