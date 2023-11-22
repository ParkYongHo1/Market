package com.vam.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.VO.ProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TransationMapperTests {
	@Autowired
	TransationMapper productmapper;
	
//	@Test
//	public void produvtTest() throws Exception{
//		  
//		  System.out.println(productmapper.productList(1));
//	}
	
//	@Test
//	public void productGetDetailTest() throws Exception{
//		System.out.println(productmapper.productGetDetail(1));
//	}
	
//	@Test
//	public void getMemberAndProductTest() throws Exception{
//
//		    System.out.println(productmapper.getMemberAndProduct(2));
//	}
	
	@Test
	public void increaseViewCount() throws Exception{
		System.out.println(productmapper.increaseViewCount(2));
	}
}