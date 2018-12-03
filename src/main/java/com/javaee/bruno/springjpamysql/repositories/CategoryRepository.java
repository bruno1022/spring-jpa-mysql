package com.javaee.bruno.springjpamysql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.javaee.bruno.springjpamysql.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
