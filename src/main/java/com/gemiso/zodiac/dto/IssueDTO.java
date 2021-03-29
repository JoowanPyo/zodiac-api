package com.gemiso.zodiac.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("Issue Entry")
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueDTO implements Serializable {
	private static final long serialVersionUID = 3447899949225160742L;

	@ApiModelProperty(value = "이슈아이디", required = true)
	private String issu_id;

	@ApiModelProperty(value = "채널구분코드", required = true)
	private String ch_div_cd;

	@ApiModelProperty(value = "이슈일자", required = true)
	private String issu_dtm;

	@ApiModelProperty(value = "이슈순번", required = false)
	private Integer issu_ord;

	@ApiModelProperty(value = "이슈키워드", required = true)
	private String issu_kwd;

	@ApiModelProperty(value = "이슈내용", required = false)
	private String issu_ctt;

	@ApiModelProperty(value = "이슈완료여부", required = true)
	private String issu_fnsh_yn;

	@ApiModelProperty(value = "이슈삭제여부", required = true)
	private String issu_del_yn;

	@ApiModelProperty(value = "입력자아이디", required = true)
	private String inputr_id;

	@ApiModelProperty(value = "입력일시", required = true)
	private String input_dtm;

	@ApiModelProperty(value = "수정자아이디", required = false)
	private String updtr_id;

	@ApiModelProperty(value = "수정일시", required = false)
	private String updt_dtm;

	@ApiModelProperty(value = "삭제자아이디", required = false)
	private String delr_id;

	@ApiModelProperty(value = "삭제일시", required = false)
	private String del_dtm;

	@ApiModelProperty(value = "이슈시퀀스", required = true)
	private Integer issu_seq;

	@ApiModelProperty(value = "이슈완료일시", required = false)
	private String issu_fnsh_dtm;

	@ApiModelProperty(value = "이슈원본아이디", required = false)
	private String issu_org_id;

}
