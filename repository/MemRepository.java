package com.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Mem;

public interface MemRepository extends JpaRepository<Mem, Integer>  {

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
	
	 Mem findByMemberId(String member_id);
	 Mem findByMemberEmail(String member_email);
}
