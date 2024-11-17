package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//@Respsitory "NÃO É NESCESSARIO" TA ERDANDO DO JPA REPOSITORY QUE JA ESTA REGISTRADO COMO UM COMPLEMENTO SPRING
//NESSE CASO ESPECIFICO NÃO PRECISA CRIAR A IMPLEMENTAÇÃO DA INTERFACE, O JPA JA TEM IMPLEMENTAÇÃO PADRAO DE INTERFACE
public interface UserRepository extends JpaRepository<User, Long> {

}
