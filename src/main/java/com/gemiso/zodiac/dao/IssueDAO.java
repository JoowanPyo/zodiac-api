package com.gemiso.zodiac.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.gemiso.zodiac.common.dao.AbstractDAO;
import com.gemiso.zodiac.dto.IssueDTO;

@Repository("issueDAO")
public class IssueDAO extends AbstractDAO {

	Logger log = Logger.getLogger(this.getClass());
	

	@SuppressWarnings("unchecked")
	public List<IssueDTO> getissueList(String sdate, String edate) throws Exception {

		Map<String, Object> param = new HashMap<String, Object>();

		param.put("sdate", sdate);
		param.put("edate", edate);

		return (List<IssueDTO>) selectList("issue.getissueList", param);
	}
	
	@SuppressWarnings("unchecked")
	public void getissueIncert(IssueDTO issueDto) throws Exception {
		
		Date date =  new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");		
		//이슈 등록 날짜 등록
		issueDto.setInput_dtm(simpleDateFormat.format(date).toString());
		issueDto.setInputr_id(issueDto.getIssu_id());
		
				
		insert("issue.getissueIncert", issueDto);
	}
	
	@SuppressWarnings("unchecked")
	public List<IssueDTO> getIssueUpdate(IssueDTO issueDto) throws Exception {
			
		Date date =  new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");		
		//이슈 업데이트 날짜 등록
		issueDto.setUpdt_dtm(simpleDateFormat.format(date).toString());
		issueDto.setUpdtr_id(issueDto.getIssu_id());
		
		return  (List<IssueDTO>) update("issue.getissuCreate", issueDto);
	}
	
	@SuppressWarnings("unchecked")
	public void getIssueDelete(String issu_id) throws Exception {	
		
		IssueDTO issueDto = new IssueDTO();
		
		Date date =  new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		//이슈삭제 날짜 등록
		issueDto.setDel_dtm(simpleDateFormat.format(date).toString());
		//이슈 삭제 여부 Y
		issueDto.setIssu_del_yn("Y");
		//이슈 삭제 아이디 등록
		issueDto.setDelr_id(issu_id);
		
		update("issue.getIssueDelete", issueDto);
	}
}
