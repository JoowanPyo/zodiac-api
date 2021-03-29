package com.gemiso.zodiac.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.gemiso.zodiac.dao.IssueDAO;
import com.gemiso.zodiac.dto.IssueDTO;
import com.gemiso.zodiac.service.IssueService;

@Service("issueService")
public class IssueServiceImpl implements IssueService {

	@Resource(name = "issueDAO")
	private IssueDAO issueDAO;
	

	@Override
	public List<IssueDTO> getIssueList(String sdate, String edate) throws Exception {
		return issueDAO.getissueList(sdate, edate);
	}

	@Override
	public void getIssueInsert(IssueDTO issueDto) throws Exception {					
		issueDAO.getissueIncert(issueDto);
	}
	
	@Override
	public List<IssueDTO> getIssueUpdate(IssueDTO issueDto) throws Exception {				
		return issueDAO.getIssueUpdate(issueDto);
	}

	@Override
	public void getIssueDelete(String issu_id) throws Exception {
		issueDAO.getIssueDelete(issu_id);
		
	}
	


}