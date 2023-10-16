package spring.mvc.friday;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InfoDao implements InfoInter{
	
	@Autowired
	SqlSession session;

	@Override
	public int getTotalCount() {
		return session.selectOne("selectTotalCountOfMyInfo");
	}

	@Override
	public void insertMyInfo(InfoDto dto) {
		session.insert("insertOfMyInfo", dto);
	}

	/*
	 * @Override public List<InfoDto> getAllInfos() { List <InfoDto> list = new
	 * ArrayList<InfoDto>(); return session.selectList("selectAllofMyInfo"); }
	 */

	@Override
	public InfoDto getNum(String num) {
		return session.selectOne("selectOneNum", num);
	}

	@Override
	public void updateMyInfo(InfoDto dto) {
		session.update("updateOfMyInfo", dto);
		
	}

	@Override
	public void deleteMyInfo(String num) {
		session.delete("deleteOfMyInfo",num);
	}

	//parameterType이 있으면 session 할때 두개를 보내줘야함 , 없으면 mapper id한개만	
	
	@Override
	public List<InfoDto> getAllInfos(Map<String, String> map) {
		return session.selectList("selectAllofMyInfo",map);
	}

	
}
