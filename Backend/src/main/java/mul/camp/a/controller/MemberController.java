package mul.camp.a.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	MemberService msv;
	
	@RequestMapping(value = "/getId", method = {RequestMethod.GET, RequestMethod.POST})
	public String getId(MemberDto dto) {
		System.out.println("MemberController getId" + new Date());
		
		boolean b = msv.getId(dto);
		if(b) {
			return "NO";
		}
		return "YES";
	}
	@RequestMapping(value = "/addMember", method = {RequestMethod.GET, RequestMethod.POST})
	public String addMember(MemberDto dto) {
		System.out.println("MemberController addMember" + new Date());
		
		boolean b = msv.addMember(dto);
		if(b) {
			return "YES";
		}
		return "NO";
	}
	@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
	public MemberDto login(MemberDto dto, HttpServletRequest req) {
		System.out.println("MemberController login");
		
		MemberDto mem = msv.login(dto);
		// sessionStorage 대신 이렇게도 사용가능
//		req.getSession().setAttribute("login", mem);
		return mem;
	}	
}