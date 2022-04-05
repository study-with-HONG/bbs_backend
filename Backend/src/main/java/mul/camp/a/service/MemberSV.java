package mul.camp.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mul.camp.a.dao.MemberDAO;
import mul.camp.a.dto.MemberDTO;

@Service
@Transactional
public class MemberSV {
	@Autowired
	MemberDAO dao;
	
	// 아이디 중복 확인
	public boolean idcheck(String id) {
		int i = dao.idcheck(id);
		return i>0?true:false;
	}
	
	// 회원가입
	public boolean register(MemberDTO dto) {
		int i = dao.register(dto);
		return i>0?true:false;
	}
	
	// 로그인
	public MemberDTO login(MemberDTO dto) {
		return dao.login(dto);
	}
}