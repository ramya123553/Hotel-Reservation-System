package com.gl.clientService.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.clientService.bean.Expenses;


@Repository

public interface ExpensesRepository extends JpaRepository<Expenses,Long> {
	 
	
/*	@Query("select max(cnr) from Expenses")
	public String findByCnr(String cnr);*/
	
	@Query("FROM Expenses WHERE cnr=?1")
	public List<Expenses> findaccByExpenses(String cnr);
	
	
	
}