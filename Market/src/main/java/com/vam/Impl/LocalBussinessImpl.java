package com.vam.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.VO.LocalBussinessVO;
import com.vam.mapper.LocalBussinessMapper;
import com.vam.service.LocalBussinessService;

@Service
public class LocalBussinessImpl implements LocalBussinessService {
	@Autowired
	LocalBussinessMapper localmapper;

	@Override
	public List<LocalBussinessVO> localBussinessSelectAll() throws Exception{
		return localmapper.localBussinessSelectAll();
	}
}