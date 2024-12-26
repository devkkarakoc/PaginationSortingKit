package com.kkarakoc.controller.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kkarakoc.utils.PagerUtil;
import com.kkarakoc.utils.RestPageableEntity;
import com.kkarakoc.utils.RestPageableRequest;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest pageableRequest) {
		
	      return PagerUtil.toPageale(pageableRequest);
		
	}
	
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		return PagerUtil.toPageableResponse(page, content);
	}
}
