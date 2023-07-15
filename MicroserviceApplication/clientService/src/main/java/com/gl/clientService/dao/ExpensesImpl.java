package com.gl.clientService.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.gl.clientService.bean.Expenses;


@Service

public class ExpensesImpl implements ExpensesDao {

 @Autowired

 private ExpensesRepository repository;

 @Override

 public void save(Expenses clientExpenses) {

  repository.save(clientExpenses);

 }

 @Override

 public List<Expenses> findAll() {

 return repository.findAll();

 }

 @Override

 public Expenses findExpensesById(Long serialId) {

 // TODO Auto-generated method stub

 return repository.getById(serialId);

 }
 @Override
 public List<Expenses> findaccByExpenses(String cnr){
	 return repository.findaccByExpenses(cnr);
 }
  
}