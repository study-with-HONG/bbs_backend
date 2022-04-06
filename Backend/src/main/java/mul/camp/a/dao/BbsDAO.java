package mul.camp.a.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import mul.camp.a.dto.BbsDTO;

@Mapper
@Repository
public interface BbsDAO {
	public List<BbsDTO> getlist();		// 게시글 목록 불러오기
	public int bbswrite(BbsDTO dto);	// 게시글 작성
	public BbsDTO bbsdetail(int seq);	// 게시글 디테일
	public int bbsdelete(int seq);		// 게시글 삭제
}