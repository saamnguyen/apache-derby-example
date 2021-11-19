package com.spring.apachederbyexample.repository;


import com.spring.apachederbyexample.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, String> {

}
