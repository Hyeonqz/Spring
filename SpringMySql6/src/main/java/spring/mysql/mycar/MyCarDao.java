package spring.mysql.mycar;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyCarDao {
	
	@Autowired
	private SqlSession session;
	String namespace= "spring.mysql.mycar.MyCarDao";
	
	public int getTotalCount() {
		return session.selectOne(namespace + ".getTotalCountofMyCar");
	}
	
	//insert
	public void insertCar(MyCarDto dto) {
		
		session.insert("insertOfMycar", dto);
	}
	
	//전체목록 조회.equals("출력") = true
	public List<MyCarDto> getAllCarData() {
		
		return session.selectList("getAllListOfMyCar");
	}
	
	//삭제
	public void deleteCar(String num) {
		session.delete("deleteOfMycar",num);
	}
	
	//num값에 맞는 것만  조회
	public MyCarDto getData(String num) {  //pulbic resultType 메서드이름(파라미터 타입 num)
		
		return session.selectOne("selectOneOfMyCar",num);
		
	}
	
	//업데이트 메서드
	public void update(MyCarDto dto) {
		session.update("updateOfMycar", dto);
	}
	
	
	

}
