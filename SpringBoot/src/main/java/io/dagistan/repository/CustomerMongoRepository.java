package io.dagistan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.dagistan.model.Customer;

public interface CustomerMongoRepository extends MongoRepository<Customer, String> {

}
