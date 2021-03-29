package com.gemiso.zodiac.controller;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gemiso.zodiac.dto.IssueDTO;
import com.gemiso.zodiac.service.IssueService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "ISSUE API")
@RequestMapping("/issue")
public class IssueController {

	private static final Logger log_issue = Logger.getLogger("com.issue");

	@Resource(name = "issueService")
	private IssueService issueService;

	/**
	 * <PRE>
	 * 1. Description
	 *	이슈목록조회
	 * 2. Example
	 * 
	 * </PRE>
	 * 
	 * @return ResponseEntity List:ArticleListDomain
	 * @param sdate 검색시작일
	 * @param edate 검색종료일
	 * @return
	 */

	@ApiOperation(value = "이슈 목록 조회", notes = "")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "sdate", value = "검색시작일(yyyyMMdd)", required = false, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "edate", value = "검색종료일(yyyyMMdd)", required = false, dataType = "string", paramType = "query", defaultValue = ""), })
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getIssueList(String sdate, String edate) {

		List<IssueDTO> list = null;

		try {

			list = issueService.getIssueList(sdate, edate);

			if (list.isEmpty()) {
				return new ResponseEntity<IssueDTO>(HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			PrintStream pinrtStream = new PrintStream(out);
			e.printStackTrace(pinrtStream);
			log_issue.error(out.toString());
			return new ResponseEntity<List<IssueDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<IssueDTO>>(list, HttpStatus.OK);
	}
	
	/**
	 * <PRE>
	 * 1. Description
	 *	이슈등록
	 * 2. Example
	 * 
	 * 
	 */

	@ApiOperation(value = "이슈 등록", notes = "")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "issu_id", value = "issu id", required = true, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "ch_div_cd", value = "chaner div code", required = true, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_dtm", value = "이슈일자(yyyyMMdd)", required = true, dataType = "string", paramType = "query", defaultValue = ""), 
			@ApiImplicitParam(name = "issu_ord", value = "", required = false, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_kwd", value = "issu keyWord", required = true, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_ctt", value = "issu contents", required = false, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_fnsh_yn", value = "issu finish yn", required = true, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "inputr_id", value = "inputer id", required = true, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "input_dtm", value = "input datetime", required = true, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_seq", value = "issu sequence", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_fnsh_dtm", value = "issu finish datetime", required = false, dataType = "string", paramType = "query", defaultValue = ""),
			@ApiImplicitParam(name = "issu_org_id", value = "issu original id", required = false, dataType = "string", paramType = "query", defaultValue = ""),})
	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> IssueInsert(IssueDTO issueDto ) {
		
		
		try {
			if(null != issueDto) {
				
			 issueService.getIssueInsert(issueDto);
			 
			} else {
				return new ResponseEntity<IssueDTO>(HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			PrintStream pinrtStream = new PrintStream(out);
			e.printStackTrace(pinrtStream);
			log_issue.error(out.toString());
			return new ResponseEntity<List<IssueDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/**
	 * <PRE>
	 * 1. Description
	 *	이슈업데이트
	 * 2. Example
	 * 
	 * </PRE>
	 * 
	 * @return ResponseEntity List:ArticleListDomain
	 * @return
	 */

	@ApiOperation(value = "이슈 수정", notes = "")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "issu_id", value = "issu id", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "ch_div_cd", value = "chaner div code", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "issu_dtm", value = "이슈일자(yyyyMMdd)", required = true, dataType = "string", paramType = "query", defaultValue = ""), 
		@ApiImplicitParam(name = "issu_ord", value = "", required = false, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "issu_kwd", value = "issu keyWord", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "issu_ctt", value = "issu contents", required = false, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "issu_fnsh_yn", value = "issu finish yn", required = true, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "updtr_id", value = "inputer id", required = false, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "updt_dtm", value = "input datetime", required = false, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "issu_fnsh_dtm", value = "issu finish datetime", required = false, dataType = "string", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "issu_org_id", value = "issu original id", required = false, dataType = "string", paramType = "query", defaultValue = ""),})
	@RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> IssuUpdate(IssueDTO issueDto ) {
		
		
		List<IssueDTO> list = null;
		try {
			
			list = issueService.getIssueUpdate(issueDto);

			if (list.isEmpty()) {
				return new ResponseEntity<IssueDTO>(HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			PrintStream pinrtStream = new PrintStream(out);
			e.printStackTrace(pinrtStream);
			log_issue.error(out.toString());
			return new ResponseEntity<List<IssueDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<IssueDTO>>(list, HttpStatus.OK);
	}
	
	/**
	 * <PRE>
	 * 1. Description
	 *	이슈삭제
	 * 2. Example
	 * 
	 * 
	 * @param issu_id 이슈 아이디
	 */

	@ApiOperation(value = "이슈 삭제", notes = "")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "issu_id", value = "issu id", required = false, dataType = "string", paramType = "query", defaultValue = ""),})
	@RequestMapping(value = "", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> IssuDelete(String issu_id ) {
		
		
		try {
			if(null != issu_id && !issu_id.equals("")) {
				
			issueService.getIssueDelete(issu_id);
			} else {
				return new ResponseEntity<IssueDTO>(HttpStatus.NO_CONTENT);
			}
		

		} catch (Exception e) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			PrintStream pinrtStream = new PrintStream(out);
			e.printStackTrace(pinrtStream);
			log_issue.error(out.toString());
			return new ResponseEntity<List<IssueDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
