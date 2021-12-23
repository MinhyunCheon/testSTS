package kr.co.encore.model.sql;

import java.util.List;

// interface는 실제로 생성되지 않기 때문에 어노테이션을 선언할 필요가 없다.
public interface TestDao {
	public List<Object> select();
}
