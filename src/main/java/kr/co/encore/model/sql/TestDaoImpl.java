package kr.co.encore.model.sql;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

// container -> TestDao testDao = new TestDaoImpl();
@Repository("testDao")
public class TestDaoImpl implements TestDao {
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<Object> select() {
		System.out.println("dao select");
		return sqlSession.selectList("encore.selectBbsList");
	}

}
