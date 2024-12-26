package com.kkarakoc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kkarakoc.dto.DtoDepartment;
import com.kkarakoc.dto.DtoPersonel;
import com.kkarakoc.model.Personel;
import com.kkarakoc.repository.PersonelRepository;
import com.kkarakoc.service.IPersonelService;

@Service
public class PersonelServiceImpl implements IPersonelService {

	@Autowired
	private PersonelRepository personelRepository;
	
	@Override
	public Page<Personel> findAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return personelRepository.findAllPageable(pageable);
	}

	@Override
	public List<DtoPersonel> toDtoList(List<Personel> personels) {
		
	
		List<DtoPersonel> dtoList = new ArrayList<>();
		
		for (Personel personel : personels) {
			DtoPersonel dtoPersonel = new DtoPersonel();
			DtoDepartment dtoDepartment = new DtoDepartment();
			
			BeanUtils.copyProperties(personel, dtoPersonel);
			BeanUtils.copyProperties(personel.getDepartment(), dtoDepartment);
			dtoPersonel.setDepartment(dtoDepartment);
			
			dtoList.add(dtoPersonel);
			
		}
		
		
		return dtoList;
	}

}
