## Definitions
### AnchorMent Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_ctt|앵커멘트내용|false|string||
|anc_ment_ord|앵커멘트순번|false|integer (int32)||
|anc_ment_relse_dtm|앵커멘트출고일시|false|string||
|anc_ment_st_cd|앵커멘트상태코드|false|string||
|anc_ment_st_nm|앵커멘트상태명|false|string||
|anc_ment_time|앵커멘트소요시간|false|string||
|anc_ment_titl|앵커멘트제목|false|string||
|anc_ments|앵커멘트|false|string array||
|cue_item_id|큐시트아이템아이디|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### Article Caption History Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_cap_hist_id||false|string||
|artcl_hist_id||false|string||
|artcl_id||false|string||
|cap_ctt||false|string||
|cap_ord||false|integer (int32)||
|ln_no||false|string||


### Article Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_ctt||false|string||
|anc_ments|앵커멘트|false|string array||
|artcl_ctt||false|string||
|artcl_ctts|기사내용|false|string array||
|artcl_div_cd|기사구분코드|false|string||
|artcl_div_nm|기사상태명|false|string||
|artcl_id|기사아이디|false|string||
|artcl_relse_dtm|기사출고일시|false|string||
|artcl_reqd_time|기사소요시간|false|integer (int32)||
|artcl_st_cd|기사상태코드|false|string||
|artcl_st_nm|기사상태명|false|string||
|artcl_titl|기사제목|true|string||
|artcl_typ_cd|기사유형코드|false|string||
|artcl_typ_nm|기사유형명|false|string||
|brdc_pgm_id|방송프로그램아이디|false|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|brdc_schd_dt|방송예정일자|false|string||
|cap_relse_dtm|자막출고일시|false|string||
|cap_st_cd|자막상태코드|false|string||
|cap_st_nm|자막상태명|false|string||
|caps|자막|false|ArticleCaption Entry array||
|copy_ord|복사순번|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|dept_id|부서아이디|false|string||
|dept_nm|부서명|false|string||
|embg_dtm|엠바고일시|false|string||
|evaltin_dtm|평가일시|false|string||
|evaltin_score_cd|평가점수코드|false|string||
|evaltinr_id|평가자아이디|false|string||
|evaltinr_nm|평가자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|lck_dtm|잠금일시|false|string||
|lck_user_id|잠금사용자아이디|false|string||
|lck_user_nm|잠금사용자명|false|string||
|lck_yn|잠금여부|false|string||
|org_artcl_id|원본기사아이디|false|string||
|rmk|비고|false|string||
|rptr_id|기자아이디|false|string||
|rptr_nm|기자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### Article History Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_ctt||false|string||
|anc_ments|앵커멘트|false|string array||
|artcl_ctt||false|string||
|artcl_ctts|기사내용|false|string array||
|artcl_div_cd||false|string||
|artcl_div_nm||false|string||
|artcl_hist_id||false|string||
|artcl_id||false|string||
|artcl_relse_dtm||false|string||
|artcl_reqd_time||false|string||
|artcl_st_cd||false|string||
|artcl_st_chg_yn||false|string||
|artcl_st_nm||false|string||
|artcl_titl||false|string||
|artcl_typ_cd||false|string||
|artcl_typ_nm||false|string||
|brdc_pgm_id||false|string||
|brdc_pgm_nm||false|string||
|brdc_schd_dt||false|string||
|cap_relse_dtm||false|string||
|cap_st_cd||false|string||
|cap_st_nm||false|string||
|caps|자막|false|Article Caption History Entry array||
|copy_ord||false|string||
|del_dtm||false|string||
|del_yn||false|string||
|delr_id||false|string||
|delr_nm||false|string||
|dept_id||false|string||
|dept_nm||false|string||
|embg_dtm||false|string||
|evaltin_dtm||false|string||
|evaltin_score_cd||false|string||
|evaltinr_id||false|string||
|input_dtm||false|string||
|inputr_id||false|string||
|inputr_nm||false|string||
|lck_dtm||false|string||
|lck_user_id||false|string||
|lck_user_nm||false|string||
|lck_yn||false|string||
|org_artcl_id||false|string||
|rmk||false|string||
|rptr_id||false|string||
|rptr_nm||false|string||
|updt_dtm||false|string||
|updtr_id||false|string||
|updtr_nm||false|string||
|urg_yn||false|string||


### ArticleCaption Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_cap_id|기사자막아이디|false|string||
|artcl_id|기사아이디|false|string||
|cap_ctt|자막내용|false|string||
|cap_ord|자막순번|false|integer (int32)||
|cap_rmk|자막 비고|false|string||
|cap_tmplt_id|자막템플릿아이디|false|string||
|ln_no|라인번호|false|integer (int32)||


### ArticleItem Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_item_grp_id|기사아이템그룹아이디|false|string||
|brdc_dt|방송일자|false|string||
|brdc_pgm_id|방송프로그램아이디|false|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|contents|자막|false|ArticleItemContent Entry array||
|cue_id|큐시트아이디|false|string||
|cue_sndr_id|큐시트전송자아이디|false|string||
|cue_sndr_nm|큐시트전송자명|false|string||
|cue_trnsf_dtm|큐시트전송일시|false|string||
|cue_trnsf_yn|큐시트전송여부|false|string||
|del_dtm||false|string||
|delr_id||false|string||
|delr_nm||false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### ArticleItemContent Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_item_div_cd|기사아이템구분코드|false|string||
|artcl_item_div_nm|기사아이템구분코드|false|string||
|artcl_item_grp_id|기사아이템그룹아이디|false|string||
|artcl_item_id|기사아이템아이디|false|string||
|brdc_clk|방송시각|false|string||
|brdc_dt|방송일자|false|string||
|brdc_pgm_id|방송프로그램아이디|false|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|ctt|내용|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|dept_id|부서아이디|false|string||
|dept_nm|부서명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|item_nm|아이템명|false|string||
|ord|기사아이템순번|false|integer (int32)||
|reqdtime|소요시간|false|string||
|rmk|비고|false|string||
|rptr_id|기자아이디|false|string||
|rptr_nm|기자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### ArticleList Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_div_cd|기사구분코드|false|string||
|artcl_div_nm|기사구분명|false|string||
|artcl_id|기사아이디|false|string||
|artcl_relse_dtm|기사출고일시|false|string||
|artcl_reqd_time|기사소요시간|false|integer (int32)||
|artcl_st_cd|기사상태코드|false|string||
|artcl_st_nm|기사상태명|false|string||
|artcl_titl|기사제목|false|string||
|artcl_typ_cd|기사유형코드|false|string||
|artcl_typ_nm|기사유형명|false|string||
|brdc_pgm_id|뉴스프로그램아이디|false|string||
|brdc_pgm_nm|뉴스프로그램명|false|string||
|brdc_schd_dt|방송예정일자|false|string||
|cap_relse_dtm|자막출고일시|false|string||
|cap_st_cd|자막상태코드|false|string||
|cap_st_nm|자막상태명|false|string||
|copy_ord|복사|false|string||
|dept_id|부서코드|false|string||
|dept_nm|부서명|false|string||
|embg_dtm|엠바고일시|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|lck_dtm|잠금일시|false|string||
|lck_user_id|잠금사용자아이디|false|string||
|lck_user_nm|잠금사용자명|false|string||
|lck_yn|잠금여부|false|string||
|org_artcl_id|원본기사아이디|false|string||
|rmk|비고|false|string||
|rptr_id|기자아이디|false|string||
|rptr_nm|기자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### AttachFile Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|file_id|파일아이디|true|string||
|file_loc|파일위치|false|string||
|file_nm|스토리지파일명|false|string||
|file_ord|파일순번|false|integer (int32)||
|file_size|파일사이즈|false|integer (int32)||
|file_typ_cd|파일유형코드|false|string||
|mime_typ|MIME타입|false|string||
|org_file_nm|원본파일명|false|string||


### BulletinboardDomain Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|bb_id|게시판 아이디|false|string||
|bb_nm|게시판 명|false|string||
|bb_expl|게시판 설명|false|string||
|bb_typ_cd|게시판 유형 코드|false|string||
|bb_ord|게시판 순번|false|integer (int32)||
|hrnk_bb_id|상위 게시판 아이디|false|string||
|auth_div_cd|권한 구분 코드|false|string||
|del_yn|삭제 여부|false|string||
|input_dtm|입력 일시|false|string||
|inputr_id|입력자 아이디|false|string||
|updtr_id|수정자 아이디|false|string||
|updt_dtm|수정 일시|false|string||


### CaptionTemplate Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|brdc_pgm_id|프로그램아이디|false|string||
|brdc_pgm_nm|프로그램명|false|string||
|cap_cell_dlmtr|자막셀구분자|false|string||
|cap_class_cd|자막분류코드|false|string||
|cap_class_nm|자막분류명|false|string||
|cap_layer_no|자막레이어번호|false|string||
|cap_ln_num|자막라인번호|false|string||
|cap_lttr_num|자막글자수|false|string||
|cap_tmplt_file_nm|자막템플릿파일명|false|string||
|cap_tmplt_help|자막템플릿도움말|false|string||
|cap_tmplt_id|자막템플릿아이디|false|string||
|cap_tmplt_nm|자막템플릿명|false|string||
|cap_tmplt_ord|자막템플릿순번|false|string||
|cap_typ|자막타입|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|prvw_yn|프리뷰여부|false|string||
|take_count|테이크카운트|false|string||
|tmplt_grp_id|템플릿그룹아이디|false|string||
|tmplt_grp_nm|템플릿그룹명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|use_yn|사용여부|false|string||
|var_cnt|변수카운트|false|string||
|var_nm|변수명|false|string||


### Cg Asking Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_id|기사아이디|false|string||
|artcl_titl|기사제목|false|string||
|artcl_typ_cd|기사타입코드|false|string||
|artcl_typ_nm|기사타입명|false|string||
|ask_ctt|의뢰내용|false|string||
|ask_div_cd|의뢰구분코드|false|string||
|ask_div_nm|의뢰구분명|false|string||
|ask_st_cd|의뢰상태코드(CD2017051500301)|false|string||
|ask_st_nm|의뢰상태명|false|string||
|ask_titl|의뢰제목|false|string||
|ask_typ_cd|의뢰타입코드(CD2017051500302)|false|string||
|ask_typ_nm|의뢰타입명|false|string||
|brdc_pgm_id|방송프로그램아이디|false|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|cg_ask_id|CG의뢰아이디|false|string||
|cg_class_cd|CG분류코드|false|string||
|cg_class_nm|CG분류명|false|string||
|chrg_ad_dept_nm|담당AD부서명|false|string||
|chrg_ad_id|담당AD아이디|false|string||
|chrg_ad_nm|담당AD명|false|string||
|chrg_ad_tel|담당AD연락처|false|string||
|clnt_id||false|string||
|clnt_nm||false|string||
|cue_item_id|큐시트아이템아이디|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|dept_cd|부서코드|false|string||
|dept_nm|부서명|false|string||
|files|첨부파일|false|AttachFile Entry array||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|mdrive_rute|M드라이브경로|false|string||
|prd_fnsh_dtm|제작완료일시|false|string||
|prd_fnsh_time|제작완료시간|false|string||
|prd_start_dtm|제작시작일시|false|string||
|prdr_id|제작자아이디|false|string||
|prdr_nm|제작자명|false|string||
|rptr_dept_nm|기자부서명|false|string||
|rptr_id|기자아이디|false|string||
|rptr_nm|기자명|false|string||
|rptr_tel|기자연락처|false|string||
|shots|샷리스트|false|CgShotList Entry array||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### CgShotList Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|cg_ask_id||false|string||
|cont_id||false|string||
|file_nm||false|string||
|ord||false|integer (int32)||
|titl||false|string||
|trnsf_fnsh_dtm||false|string||
|trnsf_st_cd||false|string||
|trnsf_st_nm||false|string||


### Code Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|cd_expl|코드설명|false|string||
|cd_id|코드아이디|false|string||
|cd_nm|코드명|true|string||
|cd_ord|코드 순번|false|integer (int32)||
|cd_val|코드값|true|string||
|codes||false|Code Entry array||
|extra_01|추가 01|false|string||
|hrnk_cd_id|상위코드아이디|false|string||
|hrnk_cd_nm|상위코드명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|use_yn|사용여부|false|string||


### CueSheet Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_1_id|앵커1아이디|false|string||
|anc_1_nm|앵커1명|false|string||
|anc_2_id|앵커2아이디|false|string||
|anc_2_nm|앵커2명|false|string||
|brdc_clk|방송시각|false|string||
|brdc_dt|방송일자|true|string||
|brdc_pgm_id|방송프로그램아이디|true|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|brdc_st_cd|방송상태코드(CD2017020700103)|false|string||
|cfrm_yn|확정여부|false|string||
|cue_cnt|큐시트카운트(한날 생성한 큐시트 갯수)|false|integer (int32)||
|cue_id|큐시트아이디|false|string||
|cue_nm|큐시트명|false|string||
|cue_ord|큐시트순번|false|integer (int32)||
|cue_smltitl|큐시트서브타이틀|false|string||
|cue_ver|큐시트버전|false|integer (int32)||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|news_div_cd|뉴스구분코드|false|string||
|news_div_nm|뉴스구분코드명|false|string||
|pd_1_id|피디1아이디|false|string||
|pd_1_nm|피디1명|false|string||
|pd_2_id|피디2아이디|false|string||
|pd_2_nm|피디2명|false|string||
|pgmsch_time|편성시간|false|string||
|rmk|비고|false|string||
|tmplt_yn|템플릿여부|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### CueSheetItem Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_ctt||false|string||
|anc_ment_relse_dtm|앵커멘트출고일시|false|string||
|anc_ment_titl|앵커멘트제목|false|string||
|anc_ments|앵커멘트|false|string array||
|artcl_cap_st_cd|기사자막상태|false|string||
|artcl_cap_st_nm|기사자막상태명|false|string||
|artcl_chg_yn|기사변경여부|false|string||
|artcl_ctt||false|string||
|artcl_ctts|기사내용|false|string array||
|artcl_id|기사아이디|false|string||
|brdc_clk|큐시트아이템방송시작시간|false|string||
|brdc_st_cd|상태코드|false|string||
|brdc_st_nm|상태|false|string||
|cap_chg_rcv_dtm|자막변경수신일시|false|string||
|cap_chg_yn|자막변경여부|false|string||
|cap_st_cd|자막상태코드|false|string||
|cap_st_nm|자막상태|false|string||
|caps|큐시트아이템순번|false|CueSheetItemCaption Entry array||
|chrgr_id|담당|false|string||
|chrgr_nm|담당자명|false|string||
|cue_id|큐시트아이디|false|string||
|cue_item_ctt||false|string||
|cue_item_frm_cd|형식코드|false|string||
|cue_item_frm_nm|형식|false|string||
|cue_item_id|큐시트아이템아이디|false|string||
|cue_item_ord|큐시트아이템순번|false|integer (int32)||
|cue_item_ord_cd|순서코드|false|string||
|cue_item_ord_nm|순서|false|string||
|cue_item_time|큐시트아이템시간|false|integer (int32)||
|cue_item_titl|내용|false|string||
|cue_item_typ_cd|큐시트아이템유형코드(02:끝아이템, 01:일반아이템)|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|rmk|비고|false|string||
|symbol_a_id|약물a아이디|false|string||
|symbol_c_id|약물c아이디|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### CueSheetItemCaption Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|cap_class_cd||false|string||
|cap_ctt|자막내용|false|string||
|cap_layer_no||false|string||
|cap_ord|자막 순서|false|integer (int32)||
|cap_prvw_id|자막미리보기아이디|false|string||
|cap_prvw_url|자막미리보기url|false|string||
|cap_rmk|자막 비고|false|string||
|cap_tmplt_file_nm||false|string||
|cap_tmplt_id|자막템플릿아이디|false|string||
|cap_tmplt_nm|자막템플릿명|false|string||
|cd_nm||false|string||
|color_info||false|string||
|cue_item_cap_div_cd|큐시트아이템자막구분코드|true|string||
|cue_item_cap_div_nm|큐시트아이템자막구분명|false|string||
|cue_item_cap_id|큐시트아이템자막아이디|false|string||
|cue_item_id|큐시트아이템아이디|false|string||
|ln_no|라인번호|false|integer (int32)||
|var_cnt||false|integer (int32)||
|var_nm||false|string||


### CueSheetItemList Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_yn|앵커멘트여부|false|string||
|artcl_id|기사아이디|false|string||
|brdc_clk|큐시트아이템방송시작시간|false|string||
|brdc_st_cd|상태코드|false|string||
|brdc_st_nm|상태|false|string||
|cap_st_cd|자막상태코드|false|string||
|cap_st_nm|자막상태|false|string||
|cap_use_yn|자막사용여부|false|string||
|captions_bottom|하단복대|false|CueSheetItemCaption Entry array||
|captions_top|좌상단|false|CueSheetItemCaption Entry array||
|chrgr_id|담당자아이디|false|string||
|chrgr_nm|담당자명|false|string||
|cue_id|큐시트아이디|false|string||
|cue_item_brdc_dtm|큐시트아이템방송일시|false|string||
|cue_item_ctt|큐시트아이템내용|false|string||
|cue_item_frm_cd|형식코드|false|string||
|cue_item_frm_nm|형식|false|string||
|cue_item_id|큐시트아이템아이디|false|string||
|cue_item_ord|큐시트아이템순번|false|integer (int32)||
|cue_item_ord_cd|순서코드|false|string||
|cue_item_ord_nm|순서|false|string||
|cue_item_time|큐시트아이템시간|false|integer (int32)||
|cue_item_titl|큐시트아이템제목|false|string||
|cue_item_typ_cd|큐시트아이템유형코드(02:끝아이템, 01:일반아이템)|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|rmk|비고|false|string||
|symbol_a_id|약물a아이디|false|string||
|symbol_c_id|약물c아이디|false|string||
|titl_frm_cd|제목형식코드|false|string||
|titl_frm_nm|제목형식명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|video_cnt|매칭된영상개수|false|integer (int32)||
|video_tot_cnt|영상총개수|false|integer (int32)||
|video_yn|영상여부|false|string||


### CueSheetItemMedia Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|cueSheetMediaList||false|CueSheetMediaListDomain Entry array||
|cue_item_id|큐시트아이템아이디|true|string||
|media_grp_id|미디어그룹아이디|false|string||
|media_grp_ord|미디어그룹순번|false|integer (int32)||
|media_grp_titl|미디어그룹제목|false|string||


### CueSheetItemMediaMamDomain Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|artcl_id|기사아이디|false|string||
|brdc_clk|방속시각|false|string||
|brdc_st_cd|상태코드|false|string||
|brdc_st_nm|상태|false|string||
|chrgr_id|담당자아이디|false|string||
|chrgr_nm|담당자명|false|string||
|cue_id|큐시트아이디|false|string||
|cue_item_frm_cd|형식코드|false|string||
|cue_item_frm_nm|형식|false|string||
|cue_item_id|큐시트아이템아이디|false|string||
|cue_item_ord|큐시트아이템순번|false|integer (int32)||
|cue_item_ord_cd|순서코드|false|string||
|cue_item_time|큐시트아이템시간|false|integer (int32)||
|cue_item_titl|큐시트아이템제목|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|media||false|CueSheetItemMedia Entry array||
|rmk|비고|false|string||


### CueSheetMediaListDomain Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|assn_ctt|배정내용|false|string||
|assn_st_cd|배정상태코드|false|string||
|assn_st_nm|배정상태명|false|string||
|brdc_use_yn|방송사용여부|false|string||
|cue_media_id|큐시트미디어아이디|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|mam_cont_id|콘텐트아이디|false|string||
|media_durtn|미디어재생길이|false|string||
|media_mtch_dtm|미디어매칭일시|false|string||
|media_ord|미디어순번|false|integer (int32)||
|trnsf_file_nm|전송파일명|false|string||
|trnsf_id|전송자아이디|false|string||
|trnsf_st_cd|전송상태코드|false|string||
|trnsf_st_nm|전송상태명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|video_edtr_id|영상편집자아이디|false|string||
|video_edtr_nm|영상편집자명|false|string||
|video_edtr_phone_no|영상편집자연락번호|false|string||


### CueSheetTemplate Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|brdc_pgm_id|프로그램아이디|true|string||
|brdc_pgm_nm|프로그램명|false|string||
|cnt|카운트|false|integer (int32)||
|cue_div_cd|큐시트구분코드|false|string||
|cue_max_creat_cnt|큐시트최대생성카운트|false|integer (int32)||
|cue_tmplt_ctt|큐시트템플릿내용|false|string||
|cue_tmplt_id|큐시트템플릿아이디|false|string||
|cue_tmplt_titl|큐시트템플릿제목|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||


### Department Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|del_dtm||false|string||
|delr_id||false|string||
|delr_nm||false|string||
|dept_id||false|string||
|dept_nm||false|string||
|depth||false|string||
|fld_cd||false|string||
|fld_nm||false|string||
|hrnk_dept_id||false|string||
|input_dtm||false|string||
|inputr_id||false|string||
|inputr_nm||false|string||
|leafyn||false|string||
|nshift_dept_yn||false|string||
|rmk||false|string||
|sort_ord||false|integer (int32)||
|updt_dtm||false|string||
|updtr_id||false|string||
|updtr_nm||false|string||
|use_yn||false|string||


### EntityTag
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|value||false|string||
|weak||false|boolean||


### Group Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|hrnk_user_grp_id|상위사용자그룹아이디|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|rmk|비고|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|user_grp_id|사용자그룹아이디|false|string||
|user_grp_nm|사용자그룹명|false|string||


### Link
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|params||false|object||
|rel||false|string||
|rels||false|string array||
|title||false|string||
|type||false|string||
|uri||false|URI||
|uriBuilder||false|UriBuilder||


### Locale
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|country||false|string||
|displayCountry||false|string||
|displayLanguage||false|string||
|displayName||false|string||
|displayScript||false|string||
|displayVariant||false|string||
|extensionKeys||false|Character array||
|iso3Country||false|string||
|iso3Language||false|string||
|language||false|string||
|script||false|string||
|unicodeLocaleAttributes||false|string array||
|unicodeLocaleKeys||false|string array||
|variant||false|string||


### LoginDomain
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|dept||false|Department Entry||
|user||false|User Entry||


### MediaType
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|parameters||false|object||
|subtype||false|string||
|type||false|string||
|wildcardSubtype||false|boolean||
|wildcardType||false|boolean||


### MyArticle Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_ctt||false|string||
|anc_ments|앵커멘트|false|string array||
|artcl_reqd_time|기사소요시간|false|integer (int32)||
|brdc_pgm_id|뉴스프로그램아이디|false|string||
|brdc_pgm_nm|뉴스프로그램명|false|string||
|brdc_schd_dt|방송예정일자|false|string||
|caps|자막|false|ArticleCaption Entry array||
|copy_ord|복사순번|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|dept_id|부서코드|false|string||
|dept_nm|부서명|false|string||
|embg_dtm|엠바고일시|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|my_artcl_ctt||false|string||
|my_artcl_ctts|내기사내용|false|string array||
|my_artcl_div_cd|내기사구분코드|false|string||
|my_artcl_div_nm|내기사구분명|false|string||
|my_artcl_id|내기사아이디|false|string||
|my_artcl_st_cd|내기사상태코드|false|string||
|my_artcl_st_nm|내기사상태명|false|string||
|my_artcl_titl|내기사제목|false|string||
|my_artcl_typ_cd|내기사유형코드|false|string||
|my_artcl_typ_nm|내기사유형명|false|string||
|org_artcl_id|원본기사아이디|false|string||
|rmk|비고|false|string||
|rptr_id|기자아이디|false|string||
|rptr_nm|기자명|false|string||
|trnsf_dtm|송고일시|false|string||
|updt_dtm|수정일시|false|string||
|urg_yn|긴급여부|false|string||


### MyArticleList Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_ment_ctt||false|string||
|artcl_reqd_time|기사소요시간|false|integer (int32)||
|brdc_pgm_id|뉴스프로그램아이디|false|string||
|brdc_pgm_nm|뉴스프로그램명|false|string||
|brdc_schd_dt|방송예정일자|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|dept_id|부서코드|false|string||
|dept_nm|부서명|false|string||
|embg_dtm|엠바고일시|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|my_artcl_ctt||false|string||
|my_artcl_div_cd|내기사구분코드|false|string||
|my_artcl_div_nm|내기사구분명|false|string||
|my_artcl_id|내기사아이디|false|string||
|my_artcl_st_cd|내기사상태코드|false|string||
|my_artcl_st_nm|내기사상태명|false|string||
|my_artcl_titl|내기사제목|false|string||
|my_artcl_typ_cd|내기사유형코드|false|string||
|my_artcl_typ_nm|내기사유형명|false|string||
|org_artcl_id|원본기사아이디|false|string||
|rmk|비고|false|string||
|rptr_id|기자아이디|false|string||
|rptr_nm|기자명|false|string||
|trnsf_dtm|송고일시|false|string||
|updt_dtm|수정일시|false|string||
|urg_yn|긴급여부|false|string||


### NewCookie
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|comment||false|string||
|domain||false|string||
|expiry||false|string (date-time)||
|httpOnly||false|boolean||
|maxAge||false|integer (int32)||
|name||false|string||
|path||false|string||
|secure||false|boolean||
|value||false|string||
|version||false|integer (int32)||


### Program Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|anc_1_nm|앵커1이름|false|string||
|anc_2_nm|앵커2이름|false|string||
|artcl_item_use_yn|기사아이템사용여부|false|string||
|brdc_pgm_abbrvn|프로그램약어|false|string||
|brdc_pgm_div_cd|프로그램구분코드|false|string||
|brdc_pgm_div_nm|프로그램구분명|false|string||
|brdc_pgm_id|프로그램아이디|false|string||
|brdc_pgm_nm|프로그램명|true|string||
|brdc_start_time|방송시작시간|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|pd_1_nm|피디1이름|false|string||
|pd_2_nm|피디2이름|false|string||
|pgmsch_time|편성시간|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|use_yn|사용여부|false|string||


### Response
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|allowedMethods||false|string array||
|cookies||false|object||
|date||false|string (date-time)||
|entity||false|object||
|entityTag||false|EntityTag||
|headers||false|object||
|language||false|Locale||
|lastModified||false|string (date-time)||
|length||false|integer (int32)||
|links||false|Link array||
|location||false|URI||
|mediaType||false|MediaType||
|metadata||false|object||
|status||false|integer (int32)||
|statusInfo||false|StatusType||
|stringHeaders||false|object||


### StatusCodeDomain
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|code||false|integer (int32)||
|id||false|string||
|message||false|string||


### StatusCodeFileDomain
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|code||false|integer (int32)||
|file_id||false|string||
|filename||false|string||
|message||false|string||
|yafd||false|Yonhap File Entry array||


### StatusType
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|family||false|enum (INFORMATIONAL, SUCCESSFUL, REDIRECTION, CLIENT_ERROR, SERVER_ERROR, OTHER)||
|reasonPhrase||false|string||
|statusCode||false|integer (int32)||


### Symbol Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|brdc_pgm_id|프로그램아이디|true|string||
|brdc_pgm_ids|프로그램아이디|true|string array||
|brdc_pgm_nm|프로그램명|false|string||
|brdc_pgm_nms|프로그램명|true|string array||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|expl|설명|false|string||
|file|파일|false|AttachFile Entry||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|symbol_id|약물아이디|false|string||
|symbol_nm|약물명|true|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|use_yn|사용여부|false|string||


### Template Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|cap_cell_dlmtr|자막셀구분자|false|string||
|cap_class_cd|자막분류코드|false|string||
|cap_class_nm|자막분류명|false|string||
|cap_layer_no|자막레이어번호|false|integer (int32)||
|cap_ln_num|자막라인수|false|integer (int32)||
|cap_lttr_num|자막글자수|false|string||
|cap_tmplt_file_nm|자막템플릿파일명|false|string||
|cap_tmplt_help|자막템플릿도움말|false|string||
|cap_tmplt_id|자막템플릿아이디|false|string||
|cap_tmplt_nm|자막템플릿명|false|string||
|cap_tmplt_ord|자막템플릿순번|false|integer (int32)||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|prvw_yn|미리보기여부|false|string||
|take_count|take count|false|integer (int32)||
|tmplt_grp_id|템플릿그룹아이디|false|string||
|tmplt_grp_nm|템플릿그룹명|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|var_cnt|변수 수|false|string||
|var_nm|변수명|false|string||


### TemplateGroup Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|brdc_pgm_id|방송프로그램아이디|false|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|del_dtm|삭제일시|false|string||
|del_yn|삭제여부|false|string||
|delr_id|삭제자아이디|false|string||
|delr_nm|삭제자명|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|tmplt_grp_id|템플릿그룹아이디|false|string||
|tmplt_grp_nm|템플릿그룹명|false|string||
|tmplt_prior|템플릿우선순위|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|use_end_dt|사용종료일자|false|string||
|use_start_dt|사용시작일자|false|string||


### URI
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|absolute||false|boolean||
|authority||false|string||
|fragment||false|string||
|host||false|string||
|opaque||false|boolean||
|path||false|string||
|port||false|integer (int32)||
|query||false|string||
|rawAuthority||false|string||
|rawFragment||false|string||
|rawPath||false|string||
|rawQuery||false|string||
|rawSchemeSpecificPart||false|string||
|rawUserInfo||false|string||
|scheme||false|string||
|schemeSpecificPart||false|string||
|userInfo||false|string||


### User Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|accnt_class_cd|계정분류코드|false|string||
|accnt_class_nm|계정분류명|false|string||
|dept_id|부서아이디|false|string||
|dept_nm|부서명|false|string||
|duty_div_cd|직열구분코드(CD2017022100181)|false|string||
|duty_div_nm|직열구분명|false|string||
|e_mail|이메일|false|string||
|empl_no|사번|false|string||
|fnal_login_dtm|최종 로그인 일시|false|string||
|free_yn|프리랜서여부|false|string||
|inphon_no|사내번호|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|jbt_cd|직위코드(CD2017041700256)|false|string||
|jbt_nm|직위명|false|string||
|last_login_dtm|최종로그인일시|false|string||
|login_err_cnt|로그인에러횟수|false|integer (int32)||
|mphon_no|핸드폰번호|false|string||
|nb|출입처|false|string||
|prsnl_info_dept_cd|인사정보부서코드|false|string||
|prsnl_info_dept_nm|인사정보부서명|false|string||
|prsnl_info_end_dt|인사반영보류종료일자|false|string||
|prsnl_info_start_dt|인사반영보류시작일자|false|string||
|pwd|비밀번호|false|string||
|pwd_chg_dtm|비밀번호변경일시|false|string||
|rank_cd|직급코드(CD2017041700257)|false|string||
|rank_nm|직급명|false|string||
|regbrdc_yn|지방사여부|false|string||
|rmk|비고|false|string||
|tel_pub_yn|전화번호공개여부|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|use_yn|사용여부|false|string||
|user_div_cd|사용자구분코드|false|string||
|user_div_nm|사용자구분명|false|string||
|user_id|사용자아이디|false|string||
|user_info_use_end_dt|사용자정보사용종료일자|false|string||
|user_info_use_start_dt|사용자정보사용시작일자|false|string||
|user_nm|사용자명|false|string||
|user_st_cd|사용자상태코드|false|string||
|user_st_nm|사용자상태명|false|string||
|video_rptr_yn|영상기자여부|false|string||


### UserSet Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|user_id|사용자아이디|false|string||
|user_set_key|사용자설정키|false|string||
|user_set_val|사용자설정값|true|string||


### VideoReporterAsk Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|brdc_pgm_id|방송프로그램아이디|false|string||
|brdc_pgm_nm|방송프로그램명|false|string||
|busntrip_div_cd|출장구분코드(상위코드:CD2017041700253)|false|string||
|busntrip_div_nm|출장구분명|false|string||
|busntrip_end_dt|출장종료일자|false|string||
|busntrip_start_dt|출장시작일자|false|string||
|input_dtm|입력일시|false|string||
|inputr_id|입력자아이디|false|string||
|inputr_nm|입력자명|false|string||
|mam_lrgclass_cd|대분류코드|false|string||
|mam_lrgclass_nm|대분류명|false|string||
|mam_smlclass_cd|소분류코드|false|string||
|mam_smlclass_nm|소분류명|false|string||
|rmk|비고|false|string||
|rpt_class_cd|취재종류코드(상위코드:CD2017041700241)|false|string||
|rpt_class_nm|취재종류명|false|string||
|rpt_ctt|취재내용|false|string||
|rpt_dtm|취재일시|false|string||
|rpt_dtm_typ|취재일시유형|false|string||
|rpt_frm_cd|취재형식코드(상위코드:CD2017041700244)|false|string||
|rpt_frm_nm|취재형식명|false|string||
|rpt_plc|취재장소|false|string||
|rpt_rptr_dept_id|취재기자부서아이디|false|string||
|rpt_rptr_dept_nm|취재기자부서명|false|string||
|rpt_rptr_id|취재기자아이디|false|string||
|rpt_rptr_nm|취재기자명|false|string||
|rpt_rptr_phone_no|취재기자전화번호|false|string||
|rpt_titl|취재제목|false|string||
|updt_dtm|수정일시|false|string||
|updtr_id|수정자아이디|false|string||
|updtr_nm|수정자명|false|string||
|video_rpt_ask_id|영상취재의뢰아이이디|false|string||
|video_rpt_ask_st_cd|영상취재의뢰상태코드|false|string||
|video_rpt_ask_st_nm|영상취재의뢰상태명|false|string||
|video_rpt_assn_cmnt|영상취재배정코멘트|false|string||
|video_rpt_assn_dtm|영상취재배정일시|false|string||
|video_rpt_assnr_id|영상취재배정자아이디|false|string||
|video_rpt_assnr_nm|영상취재배정자명|false|string||
|video_rpt_dl_link_yn|영상취재일지연결여부|false|string||
|video_rpt_rptr_id|영상취재기자아이디|false|string||
|video_rpt_rptr_nm|영상취재기자명|false|string||
|video_rpt_rptr_phone_no|영상취재기자전화번호|false|string||
|wth_div_cd|동행구분코드(상위코드:CD2017041700249)|false|string||
|wth_div_nm|동행구분명|false|string||


### Yonhap Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|action|콘텐츠 처리 유형|false|string||
|artcl_cate_cd|기사분야코드(CD2017010300048)|false|string||
|artcl_cate_nm|기사분야명|false|string||
|artcl_ctt|기사내용|false|string||
|artcl_smltitl|기사소제목|false|string||
|artcl_titl|기사제목|false|string||
|artclqnty|기사량|false|string||
|cmnt|코멘트|false|string||
|cont_id|콘텐트아이디|false|string||
|credit|저작권소유기관|false|string||
|ctt_class_add_cd|내용분류코드|false|string||
|ctt_class_add_nm|내용분류명|false|string||
|ctt_class_cd|내용분류코드|false|string||
|ctt_class_nm|내용분류명|false|string||
|embg_dtm|엠바고일시|false|string||
|files|파일|false|AttachFile Entry array||
|imprt|중요도|false|string||
|input_dtm|입력일시|false|string||
|issu_cd|이슈코드|false|string||
|issu_nm|이슈명|false|string||
|region_cd|지역코드(CD2017010300041)|false|string||
|region_nm|지역명|false|string||
|rel_cont_id|관련콛텐트아이디|false|string||
|source|기사출처|false|string||
|stock_cd|종목코드|false|string||
|stock_nm|종목명|false|string||
|svc_typ|서비스유형|false|string||
|trnsf_dtm|전송일시|false|string||
|yh_artcl_id|연합기사아이디|false|string||


### Yonhap File Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|cap|자막|false|string||
|expl|설명|false|string||
|file_id|파일아이디|false|string||
|file_ord|파일 순번|false|integer (int32)||
|file_titl|파일 제목|false|string||
|file_typ_cd|파일 유형 코드|false|string||
|mime_typ|마임 유형|false|string||
|yh_artcl_id|연합 기사 아이디|false|string||
|yh_url|연합 url|false|string||


### YonhapList Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|action|콘텐츠 처리 유형|false|string||
|agcy_cd|통신사코드|false|string||
|agcy_nm|통신사명|false|string||
|artcl_ctt|기사내용|false|string||
|artcl_titl|기사제목|false|string||
|artclqnty|기사량|false|integer (int32)||
|cont_id|콘텐트아이디|false|string||
|credit|저작권소유기관|false|string||
|imprt|중요도|false|string||
|input_dtm|입력일시|false|string||
|svc_typ|서비스유형|false|string||
|trnsf_dtm|기사전송일시|false|string||
|yh_artcl_id|연합기사아이디|false|string||


### YonhapPhoto Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|action|콘텐츠 처리 유형|false|string||
|artcl_cate_cd|기사분야코드|false|string||
|artcl_cate_nm|기사분야명|false|string||
|artcl_ctt|기사내용|false|string||
|artcl_smltitl|소제목|false|string||
|artcl_titl|제목|false|string||
|cont_id|콘텐트아이디|false|string||
|credit|저작권소유기관|false|string||
|ctt_class_add_cd|내용분류추가코드|false|string||
|ctt_class_add_nm|내용분류추가명|false|string||
|ctt_class_cd|내용분류코드|false|string||
|ctt_class_nm|내용분류명|false|string||
|files|파일|false|AttachFile Entry array||
|imprt|중요도|false|string||
|input_dtm|입력일시|false|string||
|photo_url|포토URL|false|string||
|region_cd|지역코드|false|string||
|region_nm|지역명|false|string||
|source|출처|false|string||
|svc_typ|서비스유형|false|string||
|tot_cnt|토탈카운트|false|string||
|trnsf_dtm|기사전송일시|false|string||
|yh_artcl_id|연합기사아이디|false|string||
|yh_photo_div_cd|연합포토구분코드|false|string||
|yh_photo_div_nm|연합포토구분명|false|string||
|yh_publ_no|연합발행번호|false|string||


### YonhapPressData Entry
|Name|Description|Required|Schema|Default|
|----|----|----|----|----|
|action|콘텐츠 처리 유형|false|string||
|artcl_ctt|기사내용|false|string||
|artcl_fld_cd||false|string||
|artcl_fld_nm||false|string||
|artcl_titl|기사제목|false|string||
|attc_file_yn|첨부파일여부|false|string||
|cont_id|콘텐트아이디|false|string||
|credit|저작권소유기관|false|string||
|ctt_class_cd|내용 분류 코드|false|string||
|files|파일|false|AttachFile Entry array||
|imprt|중요도|false|string||
|input_dtm|입력일시|false|string||
|inst_cd|기관코드|false|string||
|inst_nm|기관명|false|string||
|rel_cont_id|관련콘텐트아이디|false|string||
|source|기사출처|false|string||
|svc_typ|서비스유형|false|string||
|trnsf_dtm|기사전송일시|false|string||
|yh_artcl_id|연합기사아이디|false|string||


