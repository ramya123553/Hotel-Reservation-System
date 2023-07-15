package com.gl.clientService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.clientService.bean.BillGeneration;

@Service
public class BillGenerationDaoImpl implements BillGenerationDao{
	@Autowired
	private BillGenerationRepository repository;
@Override
public void save(BillGeneration billGeneration) {
	repository.save(billGeneration);
}
}
