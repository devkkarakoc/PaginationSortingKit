package com.kkarakoc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kkarakoc.dto.DtoPersonel;
import com.kkarakoc.model.Personel;

public interface IPersonelService {

	Page<Personel> findAllPageable(Pageable pageable);
	
	List<DtoPersonel> toDtoList(List<Personel> personels);
}
