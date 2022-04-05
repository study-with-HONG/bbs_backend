package mul.camp.a.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import mul.camp.a.dto.MemberDTO;

@Mapper
@Repository
public interface MemberDAO {
	public int idcheck(String id);			// 아이디 중복 확인
	public int register(MemberDTO dto);		// 회원가입
	public MemberDTO login(MemberDTO dto);	// 로그인
}