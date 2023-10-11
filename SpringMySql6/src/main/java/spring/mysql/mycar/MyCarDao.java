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
	
	//��ü��� ��ȸ.equals("���") = true
	public List<MyCarDto> getAllCarData() {
		
		return session.selectList("getAllListOfMyCar");
	}
	
	//����
	public void deleteCar(MyCarDto dto) {
		session.delete("deleteOfMycar",dto);
	}

}
