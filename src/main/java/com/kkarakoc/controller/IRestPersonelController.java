package com.kkarakoc.controller;

import com.kkarakoc.dto.DtoPersonel;
import com.kkarakoc.utils.RestPageableEntity;
import com.kkarakoc.utils.RestPageableRequest;

public interface IRestPersonelController {

	public RestPageableEntity<DtoPersonel>  findAllPageable(RestPageableRequest pageableRequest);
}
