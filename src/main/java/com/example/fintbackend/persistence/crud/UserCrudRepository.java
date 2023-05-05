package com.example.fintbackend.persistence.crud;

import com.example.fintbackend.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {

}
