package com.gemiso.zodiac.service;

import java.util.List;

import com.gemiso.zodiac.dto.IssueDTO;

public interface IssueService {
	
	List<IssueDTO> getIssueList(String sdate, String edate) throws Exception;
	void getIssueInsert(IssueDTO issueDto)throws Exception;
	List<IssueDTO> getIssueUpdate(IssueDTO issueDto)throws Exception;
	void getIssueDelete(String issu_id)throws Exception;
}
