package com.gl.clientService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.clientService.bean.BillGeneration;
import com.gl.clientService.bean.BillGenerationDTO;
import com.gl.clientService.dao.BillGenerationDao;
@Service
@Repository
public class BillGenerationServiceImpl implements BillGenerationService {
@Autowired
private BillGenerationDao billGenerationDao;
	@Override
	public void save(BillGenerationDTO billGeneration) {
		// TODO Auto-generated method stub
		BillGeneration bill=new BillGeneration(billGeneration);
		billGenerationDao.save(bill);

	}

}