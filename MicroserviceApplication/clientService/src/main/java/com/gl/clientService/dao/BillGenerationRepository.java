package com.gl.clientService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.clientService.bean.BillGeneration;
@Repository
public interface BillGenerationRepository extends JpaRepository<BillGeneration, String> {

}
