package mul.camp.a.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mul.camp.a.dto.MemberDTO;
import mul.camp.a.service.MemberSV;

@RestController
public class MemberCTR {
	@Autowired
	MemberSV sv;
	
	@RequestMapping(value = "/idcheck", method = {RequestMethod.GET, RequestMethod.POST})
	public String idcheck(String id) {
		System.out.println("MemberCTR idcheck 아이디 중복확인" + new Date());
		
		boolean b = sv.idcheck(id);
		
		if(b) return "no";
		return "yes";
	}
	
	@RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
	public String register(MemberDTO dto) {
		System.out.println("MemberCTR register 회원가입" + new Date());
		
		boolean b = sv.register(dto);
		
		if(b) return "yes";
		return "no";
	}

	@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
	public MemberDTO login(MemberDTO dto/* , HttpServletRequest req */) {
		System.out.println("MemberCTR login 로그인" + new Date());

		MemberDTO data = sv.login(dto);
		// sessionStorage 대신 다른 방법
//		req.getSession().setAttribute("login", data);
		
		return data;
	}
}