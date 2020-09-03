package com.example.demo1_91social.repository;


import com.example.demo1_91social.model.Customers;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;


@Repository
public interface DBRepo extends JpaRepository<Customers, Long> {
    @Transactional
    @Modifying
    @Query(value = "SELECT * FROM customer_info c  WHERE c.last_name ='mb'   ORDER BY  c.c_time DESC", nativeQuery = true)
    List<Customers> performDBOPeration() ;
}





