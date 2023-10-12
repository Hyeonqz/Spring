package spring.mvc.carmember;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mysql.mycar.MyCarDto;

@Repository
public class CarMemberDao implements CarMemberInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public int getTotalCount() {
		return session.selectOne("getTotalCountOfCarMember");
	}

	
	  @Override public void insert(CarMemberDto cdto) {
	  session.insert("insertOfCarMember", cdto); 
	  }

	@Override
	public List<CarMemberDto> getListData() {
		return session.selectList("getlistOfCarMember");
	}
	
	  @Override 
	  public CarMemberDto getNum(String num) { 
		  return session.selectOne("getOneData",num); 
	  }
	  
	  @Override 
	  public String delete(String num) { 
		  return session.selectOne("deleteOfCarMember",num); 
		  }
	  
	  @Override 
	  public void update(CarMemberDto cdto) {
	  session.update("updateOfCarMember", cdto); 
	  }
	 



}
