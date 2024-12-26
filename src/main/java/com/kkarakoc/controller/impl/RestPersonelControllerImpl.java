package com.kkarakoc.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkarakoc.controller.IRestPersonelController;
import com.kkarakoc.dto.DtoPersonel;
import com.kkarakoc.model.Personel;
import com.kkarakoc.service.IPersonelService;
import com.kkarakoc.utils.RestPageableEntity;
import com.kkarakoc.utils.RestPageableRequest;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController {

	@Autowired
	private IPersonelService personelService;

	// @ModelAttiribute

	@GetMapping("/list/pageable")
	@Override
	public RestPageableEntity<DtoPersonel> findAllPageable(@ModelAttribute RestPageableRequest pageableRequest) {

		Page<Personel> page = personelService.findAllPageable(toPageable(pageableRequest));

		RestPageableEntity<DtoPersonel> pageableResponsEntity = toPageableResponse(page,
				personelService.toDtoList(page.getContent()));

		return pageableResponsEntity;
	}

}
