package spring.mvc.reboard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoInter implements BoardInter {
	
	@Autowired
	private SqlSession session;
	
	@Override
	public int getTotalCount() {
		return session.selectOne("getTotalCountOfReboard");
	}

	@Override
	public int getMaxNum() {
		return session.selectOne("MaxNumOfReboard");
	}

	@Override
	public void updateRestep(int regroup, int restep) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("regroup", regroup);
		map.put("restep", restep);
		
		session.update("UpdateStepOfReboard", map);
	}

	@Override
	public void insertReboard(BoardDto dto) {
		int num = dto.getNum();
		int regroup = dto.getRegroup();
		int restep = dto.getRestep();
		int relevel = dto.getRelevel();
		
		if(num==0)  {//����
			regroup = getMaxNum()+1;
			restep=0;
			relevel=0;
		} else {
			updateRestep(regroup, restep);
			
			//���޹��� step,level�� �־���
			restep ++;
			relevel++;
			
		}
		dto.setRegroup(regroup);
		dto.setRestep(restep);
		dto.setRelevel(relevel);
		
		session.insert("insertOfReboard",dto);
	}

	@Override
	public List<BoardDto> getPagingList(int start, int perpage) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("start", start);
		map.put("perpage", perpage);
		
		return session.selectList("SelectPagingOfReboard",map);
		
	}

}
