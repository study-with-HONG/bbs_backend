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
	
	@RequestMapping(value = "/bbsupdate", method = {RequestMethod.GET, RequestMethod.POST})
	public String bbsupdate(BbsDTO dto) {
		System.out.println("BbsCTR bbsupdate 게시글 수정" + new Date());
		
		boolean b = sv.bbsupdate(dto);
		
		if(b) return "yes";
		return "no";
	}
	
	@RequestMapping(value = "/reply", method = {RequestMethod.GET, RequestMethod.POST})
	public String reply(BbsDTO dto) {
		System.out.println("BbsCTR reply 답글 작성 및 들여쓰기" + new Date());
		
		boolean b = sv.reply(dto);
		
		if(b) return "yes";
		return "no";
	}

	
	
	
	
	
	
	


//	@RequestMapping(value = "/getBbsListSearch", method = {RequestMethod.GET, RequestMethod.POST} )
//	public List<BbsDto> getBbsListSearch(BbsParam param){
//		System.out.println("BbsController getBbsListSearch " + new Date());
//		
//		return service.getBbsListSearch(param);
//	}
//	
//	@RequestMapping(value = "/getBbsListSearchPage", method = {RequestMethod.GET, RequestMethod.POST} )
//	public List<BbsDto> getBbsListSearchPage(BbsParam param){
//		System.out.println("BbsController getBbsListSearchPage " + new Date());
//		
//		// 페이지 설정
//		int sn = param.getPage();	// 0 1 2 3 ~
//		int start = sn * 10 + 1;	// 1	11
//		int end = (sn + 1) * 10;	// 10	20
//		
//		param.setStart(start);
//		param.setEnd(end);
//		
//		return service.getBbsListSearchPage(param);
//	}
//	
//	@RequestMapping(value = "/getBbsCount", method = {RequestMethod.GET, RequestMethod.POST} )
//	public int getBbsCount(BbsParam param) {
//		System.out.println("BbsController getBbsCount " + new Date());
//		return service.getBbsCount(param);
//	}
}