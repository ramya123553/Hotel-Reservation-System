package com.gl.clientService.dao;



import java.util.List;

import com.gl.clientService.bean.Expenses;


public interface ExpensesDao {

 public void save(Expenses clientExpenses);
 public List<Expenses> findAll();
 public Expenses findExpensesById(Long serialId);
 
 public List<Expenses> findaccByExpenses(String cnr);
 
 

}