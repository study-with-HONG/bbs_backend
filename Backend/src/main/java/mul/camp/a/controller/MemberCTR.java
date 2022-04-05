package mul.camp.a.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mul.camp.a.dto.MemberDTO;
import mul.camp.a.service.MemberSV;

@RestController
public class MemberCTR {
	@Autowired
	MemberSV msv;
	
	@RequestMapping(value = "/idcheck", method = {RequestMethod.GET, RequestMethod.POST})
	public String idcheck(String id) {
		System.out.println("MemberCTR idcheck 아이디 중복확인" + new Date());
		
		boolean b = msv.idcheck(id);
		
		if(b) return "no";
		return "yes";
	}
	
	@RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
	public String register(MemberDTO dto) {
		System.out.println("MemberCTR register 회원가입" + new Date());
		
		boolean b = msv.register(dto);
		
		if(b) return "yes";
		return "no";
	}
}