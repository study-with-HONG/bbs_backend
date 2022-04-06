package mul.camp.a.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mul.camp.a.dao.BbsDAO;
import mul.camp.a.dto.BbsDTO;

@Service
@Transactional
public class BbsSV {
	@Autowired
	BbsDAO dao;
	
	// 게시글 목록 불러오기
	public List<BbsDTO> getlist() {
		return dao.getlist();		
	}
	
	// 게시글 작성
	public boolean bbswrite(BbsDTO dto) {
		int i = dao.bbswrite(dto);
		return i>0?true:false;
	}
	
	// 게시글 디테일
	public BbsDTO bbsdetail(int seq) {
		return dao.bbsdetail(seq);
	}
	
	// 게시글 삭제
	public boolean bbsdelete(int seq) {
		int i = dao.bbsdelete(seq); // update된 행 수만큼 반환
		return i>0?true:false;
	}
	
	// 게시글 수정
	public boolean bbsupdate(BbsDTO dto) {
		int i = dao.bbsupdate(dto);
		return i>0?true:false;
	}
}