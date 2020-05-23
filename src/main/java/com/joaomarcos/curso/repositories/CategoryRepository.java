package com.joaomarcos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.curso.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
