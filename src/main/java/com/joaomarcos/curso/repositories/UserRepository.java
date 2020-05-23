package com.joaomarcos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
