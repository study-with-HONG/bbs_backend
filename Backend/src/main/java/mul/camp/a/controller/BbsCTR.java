package mul.camp.a.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mul.camp.a.dto.BbsDTO;
import mul.camp.a.service.BbsSV;

@RestController
public class BbsCTR {
	@Autowired
	BbsSV sv;
	
	@RequestMapping(value = "/getlist", method = {RequestMethod.GET, RequestMethod.POST})
	public List<BbsDTO> getlist() {
		System.out.println("BbsCTR getlist 게시글 목록 불러오기" + new Date());
		
		List<BbsDTO> list = sv.getlist();
		return list;
	}
	
	@RequestMapping(value = "/bbswrite", method = {RequestMethod.GET, RequestMethod.POST})
	public String bbswrite(BbsDTO dto) {
		System.out.println("BbsCTR bbswrite 게시글 작성" + new Date());
		
		boolean b = sv.bbswrite(dto);
		
		if(b) return "yes";
		return "no";
	}
	
	@RequestMapping(value = "/bbsdetail", method = {RequestMethod.GET, RequestMethod.POST})
	public BbsDTO bbsdetail(int seq) {
		System.out.println("BbsCTR bbsdetail 게시글 디테일" + new Date());
		
		BbsDTO data = sv.bbsdetail(seq);
		
		return data;
	}
	
	@RequestMapping(value = "/bbsdelete", method = {RequestMethod.GET, RequestMethod.POST})
	public String bbsdelete(int seq) {
		System.out.println("BbsCTR bbsdelete 게시글 삭제" + new Date());
		
		boolean b = sv.bbsdelete(seq);
		
		if(b) return "yes";
		
		return "no";
	}
}