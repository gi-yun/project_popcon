package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

	/*
	 *   다음  메서드가 지원됨.
	 *    findAll()
	 *    findById()
	 *    count()
	 *    delete()
	 *    deleteByid()
	 *    
	 *   이외의 변수로 조회하기 위해서는 추가로 메서드를 정의해야 된다. (Query Method 규칙을 따름 )
	 *   https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	 * 
	 */
	
	// query method 정의
	
	 Customer findBycustomerId(String customerId);
	 Customer findBycustomerEmail(String customerEmail);
}