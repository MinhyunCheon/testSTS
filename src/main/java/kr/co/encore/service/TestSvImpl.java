package kr.co.encore.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.encore.model.sql.TestDao;

// @Service : container -> TestSvImpl = new TestSvImpl();
@Service("testSv")
public class TestSvImpl implements TestSv {
	@Resource(name = "testDao")
	private TestDao dao;
	
	@Override
	public List<Object> service() {
		System.out.println("test service bean");
		return dao.select();
	}
	
}
