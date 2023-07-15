package com.gl.clientService.service;



import java.util.List;

import com.gl.clientService.bean.Expenses;
import com.gl.clientService.bean.ExpensesDTO;


public interface ExpensesService {

 public void save(ExpensesDTO clientExpensesDTO);

 public List<ExpensesDTO> findAll();

 public ExpensesDTO findExpensesById(Long serialId);
 public List<ExpensesDTO> findaccByExpenses(String cnr);
 

}