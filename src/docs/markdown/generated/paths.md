## Paths
### HeartBeat Check
```
PUT /MosClientService/Heartbeat
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-client-service-controller

### CG 프리뷰
```
PUT /MosClientService/PutCapLiveRender
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_item_cap_id|큐시트 아이템 자막 아이디|true|string||
|QueryParameter|cap_tmplt_id|자막 템플릿 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-client-service-controller

### CG 프리뷰-속보자막
```
PUT /MosClientService/PutCapLiveRenderSpot
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cap_ctt|큐시트 아이템 자막 아이디|true|string||
|QueryParameter|cap_tmplt_id|자막 템플릿 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-client-service-controller

### SB 입력
```
PUT /MosClientService/PutRoElementActionInsesrt
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_id|큐시트 아이디|true|string|20170117161742CS00064|
|QueryParameter|cue_item_id|큐시트 아이템 아이디|true|string|20170206195349CI00115|


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-client-service-controller

### 큐시트 아이템 수정
```
PUT /MosClientService/PutRoElementActionReplace
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_id|큐시트 아이디|true|string|20170117161742CS00064|
|QueryParameter|cue_item_id|큐시트 아이템 아이디|true|string|20170206195349CI00115|
|QueryParameter|action_type|변경 항목|true|string|20170206195349CI00115|


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-client-service-controller

### 큐시트 상태 변경
```
PUT /MosClientService/PutRoElementStat
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_id|큐시트 아이디|true|string|20170117161742CS00064|
|QueryParameter|status|큐시트 상태|true|string|00|


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-client-service-controller

### HeartBeat Check
```
PUT /MosService/Heartbeat
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|xml|xml|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml

#### Tags

* mos-service-controller

### 아이템 이동
```
PUT /MosService/RoElementAction
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|xml|xml|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-service-controller

### 큐시트 방송상태 정보 갱신
```
PUT /MosService/RoElementStat
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|xml|xml|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-service-controller

### 큐시트 정보 조회
```
PUT /MosService/RoReq
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|xml|xml|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-service-controller

### 프로그램 조회
```
PUT /MosService/RoReqAll
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|xml|xml|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-service-controller

### 프로그램 목록 정보
```
PUT /MosService/getProgramList
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/xml

#### Produces

* application/xml;charset=UTF-8

#### Tags

* mos-service-controller

### 기사 목록 조회
```
GET /article
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일(yyyyMMdd)|false|string||
|QueryParameter|edate|검색종료일(yyyyMMdd)|false|string||
|QueryParameter|rcv_dt|수신일자(yyyyMMdd)|false|string||
|QueryParameter|relse_dt|출고일자(yyyyMMdd)|false|string||
|QueryParameter|artcl_div_cd|기사구분코드|false|string||
|QueryParameter|dept_id|부서아이디|false|string||
|QueryParameter|rptr_id|기자코드|false|string||
|QueryParameter|brdc_pgm_id|방송프로그램아이디|false|string||
|QueryParameter|search_div_cd|검색구분코드<br>01 - 기사제목<br>02 - 기자명|false|string||
|QueryParameter|search_word|검색키워드|false|string||
|QueryParameter|artcl_class_cd|기사분류코드<br>01 - 송고<br>02 - 출고<br>03 - 엠바고|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ArticleList Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 등록
```
POST /article
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|artcl_vo|필수값<br>기사제목	artcl_titl<br>기사내용	artcl_ctts|true|Article Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 이력 목록 조회
```
GET /article/history
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|artcl_id|기사아이디|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article History Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사이력 상세정보 조회
```
GET /article/history/{artcl_hist_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_hist_id|기사이력아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article History Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 삭제
```
DELETE /article/{artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 상세정보 조회
```
GET /article/{artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 수정
```
PUT /article/{artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|artcl_vo|Update article object|true|Article Entry||
|PathParameter|artcl_id|기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 앵커멘트 상세정보 조회
```
GET /article/{artcl_id}/anchor_ment
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|AnchorMent Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 앵커멘트 수정
```
PUT /article/{artcl_id}/anchor_ment
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||
|BodyParameter|anc_ment_vo|AnchorMent object|true|AnchorMent Entry||
|QueryParameter|ment_ctts|멘트내용|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|AnchorMent Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 자막 출고
```
PUT /article/{artcl_id}/caption_release
```

#### Description

▶cap_st_cd (string, optional): 자막상태코드<br>01: 송고<br>02: 출고

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||
|BodyParameter|artcl_vo|Article object|true|Article Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 평가
```
PUT /article/{artcl_id}/evaluation
```

#### Description

evaltin_score_cd (string, optional): 평가점수코드

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||
|BodyParameter|artcl_vo|Article object|true|Article Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 LOCK
```
PUT /article/{artcl_id}/lock
```

#### Description

lck_yn : Y or N

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||
|BodyParameter|artcl_vo|Article object|true|Article Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사 출고
```
PUT /article/{artcl_id}/release
```

#### Description

▶artcl_st_cd (string, optional): 기사상태코드<br>01: 송고<br>02: 출고

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||
|BodyParameter|artcl_vo|Article object|true|Article Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-controller

### 기사아이템 목록 조회
```
GET /articleitem
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|brdc_pgm_id|방송프로그램아이디|true|string||
|QueryParameter|brdc_dt|방송일자|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ArticleItem Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-item-controller

### 기사아이템 등록
```
POST /articleitem
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|artcl_item_vo|Created Article Item object|true|ArticleItemContent Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ArticleItemContent Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-item-controller

### 기사아이템 큐시트 전송
```
PUT /articleitem/{artcl_item_grp_id}/transmit
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_item_grp_id|기사아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-item-controller

### 기사아이템 삭제
```
DELETE /articleitem/{artcl_item_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_item_id|기사아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-item-controller

### 기사아이템 수정
```
PUT /articleitem/{artcl_item_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|artcl_item_ctt_vo|Created Article Item object|true|ArticleItemContent Entry||
|PathParameter|artcl_item_id|기사아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ArticleItemContent Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-item-controller

### 기사아이템 순서변경
```
PUT /articleitem/{artcl_item_id}/changeorder
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|artcl_item_vo|Created Article Item object|true|ArticleItemContent Entry||
|PathParameter|artcl_item_id|기사아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* article-item-controller

### 게시판 목록
```
GET /board
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|BulletinboardDomain Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* bulletinboard-controller

### 게시판 등록
```
POST /board
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|bb_vo|bb_vo|true|BulletinboardDomain Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|BulletinboardDomain Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* bulletinboard-controller

### 게시판 등록
```
POST /board/test
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|bb_vo_list|bb_vo_list|true|BulletinboardDomain Entry array||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|BulletinboardDomain Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* bulletinboard-controller

### 게시판 삭제
```
DELETE /board/{bb_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|bb_id|게시판 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|BulletinboardDomain Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* bulletinboard-controller

### 게시판 정보
```
GET /board/{bb_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|bb_id|게시판 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|BulletinboardDomain Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* bulletinboard-controller

### 게시판 수정
```
PUT /board/{bb_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|bb_vo|Update board object|true|BulletinboardDomain Entry||
|PathParameter|bb_id|게시판 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|BulletinboardDomain Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* bulletinboard-controller

### 템플릿조회
```
GET /captiontemplate
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|brdc_pgm_id|방송프로그램아이디|false|string||
|QueryParameter|cap_class_cd|자막유형코드(CD2017050200286)|false|string||
|QueryParameter|cap_div_cd|자막구분코드<br>01:기사자막<br>02:큐시트자막|false|string||
|QueryParameter|use_yn|사용여부|false|string||
|QueryParameter|search_word|검색어|false|string||
|QueryParameter|curpage|페이지|false|string||
|QueryParameter|rowcount|로우카운트|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CaptionTemplate Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* caption-template-controller

### 템플릿 등록
```
POST /captiontemplate
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cap_tmplt_vo|cap_tmplt_vo|true|CaptionTemplate Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CaptionTemplate Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* caption-template-controller

### 속보자막 이미지
```
GET /captiontemplate/breakingnews
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cap_ctt|자막내용|false|string||
|QueryParameter|cap_tmplt_id|자막템플릿아이디|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemCaption Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* caption-template-controller

### 템플릿 삭제
```
DELETE /captiontemplate/{cap_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cap_tmplt_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* caption-template-controller

### 템플릿 상세 조회
```
GET /captiontemplate/{cap_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cap_tmplt_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CaptionTemplate Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* caption-template-controller

### 템플릿 수정
```
PUT /captiontemplate/{cap_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cap_tmplt_vo|cap_tmplt_vo|true|CaptionTemplate Entry||
|PathParameter|cap_tmplt_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CaptionTemplate Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* caption-template-controller

### CG의뢰 목록
```
GET /cgasking
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|시작일|false|string||
|QueryParameter|edate|종료일|false|string||
|QueryParameter|ask_st_cd|의뢰상태코드|false|string||
|QueryParameter|ask_typ_cd|의뢰타입코드|false|string||
|QueryParameter|search_word|검색어|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Cg Asking Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cg-asking-controller

### CG의뢰 등록
```
POST /cgasking
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cg_ask_vo|cg_ask_vo|true|Cg Asking Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Cg Asking Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cg-asking-controller

### CG의뢰 삭제
```
DELETE /cgasking/{cg_ask_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cg_ask_id|CG의뢰아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|TemplateGroup Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cg-asking-controller

### CG의뢰 상세 조회
```
GET /cgasking/{cg_ask_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cg_ask_id|cg의뢰아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Cg Asking Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cg-asking-controller

### CG의뢰 수정
```
PUT /cgasking/{cg_ask_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cg_ask_vo|cg_ask_vo|true|Cg Asking Entry||
|PathParameter|cg_ask_id|CG의뢰아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Cg Asking Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cg-asking-controller

### 코드 목록 조회
```
GET /code
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|use_yn|사용여부|false|string||
|QueryParameter|hrnk_cd_ids|상위코드아이디(String [ ] )|false|string||
|QueryParameter|extra_01|기사(cap_a), 큐시트(cap_c)|false|string||
|QueryParameter|search_word|검색어 )|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Code Entry array|
|204|No Content|Code Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* code-controller

### 코드 등록
```
POST /code
```

#### Description

▶ 상위코드아이디(hrnk_cd_id) <br>값이 없으면 상위코드 등록<br> 값이 있으면 하위코드 등록

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cd_vo|필수값<br>cd_nm : 코드명<br>cd_val : 코드값|true|Code Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|201|Created|Code Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|409|CONFLICT|No Content|
|500|INTERNAL_SERVER_ERROR|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* code-controller

### 코드 순번 변경
```
PATCH /code/{cd_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cd_vo|필수값<br>cd_nm : 코드명<br>cd_val : 코드값|true|Code Entry||
|PathParameter|cd_id|코드아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Code Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* code-controller

### 코드 삭제
```
DELETE /code/{cd_id}
```

#### Description

코드 삭제

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cd_id|코드아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* code-controller

### 코드 상세정보 조회
```
GET /code/{cd_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cd_id|코드아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Code Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* code-controller

### 코드 수정
```
PUT /code/{cd_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cd_vo|필수값<br>cd_nm : 코드명<br>cd_val : 코드값|true|Code Entry||
|PathParameter|cd_id|코드아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Code Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* code-controller

### 큐시트 목록 조회
```
GET /cuesheet
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일자|true|string||
|QueryParameter|edate|검색종료일자|true|string||
|QueryParameter|brdc_pgm_div_cd|프로그램구분코드|false|string||
|QueryParameter|brdc_pgm_id|프로그램아이디|false|string||
|QueryParameter|brdc_pgm_nm|프로그램명|false|string||
|QueryParameter|search_word|검색어|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheet Entry array|
|204|No Content|CueSheet Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트 등록
```
POST /cuesheet
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_vo|필수값<br>brdc_dt : 방송일자<br>brdc_clk : 방송시각<br>brdc_pgm_id : 프로그램아이디|true|CueSheet Entry||
|QueryParameter|ent_flag|무시여부|true|boolean|false|


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|201|Created|CueSheet Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|409|Conflict|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트 삭제
```
DELETE /cuesheet/{cue_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트 조회
```
GET /cuesheet/{cue_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheet Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트 수정
```
PUT /cuesheet/{cue_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_vo|필수값<br>brdc_dt : 방송일자<br>brdc_clk : 방송시각<br>brdc_pgm_id : 프로그램아이디|true|CueSheet Entry||
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheet Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트 확정
```
PUT /cuesheet/{cue_id}/confirm
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|BodyParameter|cue_vo|cfrm_yn<br>Y(확정), N(확정취소)|true|CueSheet Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheet Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 목록 조회
```
GET /cuesheet/{cue_id}/item
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemList Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 등록
```
POST /cuesheet/{cue_id}/item
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_item_list_vo|Cue Sheet object|true|CueSheetItemList Entry||
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|201|Created|CueSheetItemList Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 목록 저장
```
POST /cuesheet/{cue_id}/item/bulk
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_item_list_vo|Cue Sheet object|true|CueSheetItemList Entry array||
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 순번 수정
```
PATCH /cuesheet/{cue_id}/item/change_order
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_item_list_vo_list|Cue Sheet Item object|true|CueSheetItemList Entry array||
|PathParameter|cue_id|큐시트아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemList Entry array|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 수정
```
PATCH /cuesheet/{cue_id}/item/{cue_item_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_item_list_vo|Cue Sheet Item object|true|CueSheetItemList Entry||
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemList Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 삭제
```
DELETE /cuesheet/{cue_id}/item/{cue_item_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 상세정보 조회
```
GET /cuesheet/{cue_id}/item/{cue_item_id}
```

#### Description

▶앵커멘트<br> - 큐시트에 작성된 앵커멘트 없으면 기사 앵커멘트, 있으면 큐시트 앵커멘트 보여준다<br>▶자막<br> - 큐시트 자막있으며 큐시트 자막, 없으면 기사의 자막이 출고상태면 보여주고 아니면 안보여준다

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItem Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 수정
```
PUT /cuesheet/{cue_id}/item/{cue_item_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_item_list_vo|Cue Sheet Item object|true|CueSheetItemList Entry||
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemList Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 앵커멘트 조회
```
GET /cuesheet/{cue_id}/item/{cue_item_id}/anchor_ment
```

#### Description

Cue Sheet Item Anchor Ment

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|AnchorMent Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 앵커멘트 등록
```
POST /cuesheet/{cue_id}/item/{cue_item_id}/anchor_ment
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|BodyParameter|anc_ment_vo|Insert Anc Ment object|true|AnchorMent Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|AnchorMent Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 앵커멘트 수정
```
PUT /cuesheet/{cue_id}/item/{cue_item_id}/anchor_ment
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|BodyParameter|anc_ment_vo|Update Anc Ment object|true|AnchorMent Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|AnchorMent Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 자막 조회
```
GET /cuesheet/{cue_id}/item/{cue_item_id}/caption
```

#### Description

자막구분코드 - 01 : 기사자막, 02 : 좌상단, 03 : 하단복대

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|QueryParameter|cue_item_cap_div_cd|자막구분코드|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemCaption Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 자막 등록
```
POST /cuesheet/{cue_id}/item/{cue_item_id}/caption
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|BodyParameter|cue_item_cap_vo|Insert Caption object|true|CueSheetItemCaption Entry array||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemCaption Entry array|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 자막 상세정보 조회
```
GET /cuesheet/{cue_id}/item/{cue_item_id}/caption/{cue_item_cap_id}
```

#### Description

자막구분코드 - 01 : 기사자막, 02 : 좌상단, 03 : 하단복대

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|PathParameter|cue_item_cap_id|자막아이디|true|string||
|QueryParameter|cue_item_cap_div_cd|자막구분코드|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemCaption Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 자막 수정
```
PUT /cuesheet/{cue_id}/item/{cue_item_id}/caption/{cue_item_cap_id}
```

#### Description

Cue Sheet Item Caption Update

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|PathParameter|cue_item_cap_id|자막아이디|true|string||
|BodyParameter|ad|Update Caption object|true|CueSheetItemCaption Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemCaption Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 자막 이미지생성
```
PUT /cuesheet/{cue_id}/item/{cue_item_id}/caption/{cue_item_cap_id}/rendering
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||
|PathParameter|cue_item_cap_id|자막아이디|true|string||
|BodyParameter|cue_item_cap_vo|Update Caption object|true|CueSheetItemCaption Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemCaption Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트아이템 순번 코드 수정
```
PATCH /cuesheet/{cue_id}/item/{cue_item_id}/change_order_code
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_item_list_vo_list|Cue Sheet Item object|true|CueSheetItemList Entry||
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemList Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-controller

### 큐시트 미디어 목록 조회
```
GET /cuesheetmedia
```

#### Description

▶

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemMedia Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-media-controller

### 큐시트 미디어 등록
```
POST /cuesheetmedia
```

#### Description

<br>1. 큐시트에서 PD가 큐시트아이템에 매칭될 빈칸을 만든다 -> 빈칸에 영상편집 데스크가 영상편집자 배정 -> 배정된 영상편집자가 편집된 영상 매칭<br>2. NRCS 큐시트에서 바로 영상 매칭<br>▶미디어 매칭후 같은 그룹으로 미디어 매칭시 그룹아이디에 같은 값을 넣어주면 됩니다<br><br>{<br>brdc_use_yn : N,<br>cue_item_id : 큐시트아이템아이디,<br>mam_cont_id : 영상콘텐트아이디,<br>media_durtn : 1:20(재생길이),<br>media_grp_id : 영상그룹아이디,<br>media_grp_ord : 순번,<br>media_grp_titl : 미디어그룹제목(영상설명),<br>trnsf_st_cd : 01(대기)<br>}

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_media_vo|필수값<br>cue_item_id|true|CueSheetItemMedia Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemMedia Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-media-controller

### 큐시트 미디어 삭제
```
DELETE /cuesheetmedia/{cue_media_id}
```

#### Description

큐시트 미디어 삭제

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_media_id|cue_media_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-media-controller

### 큐시트 미디어 상세정보 조회
```
GET /cuesheetmedia/{cue_media_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_media_id|큐시트미디어아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemMedia Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-media-controller

### 큐시트 미디어 수정
```
PUT /cuesheetmedia/{cue_media_id}
```

#### Description

▶

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_media_vo|필수값<br>cue_item_id|true|CueSheetItemMedia Entry||
|PathParameter|cue_media_id|cue_media_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemMedia Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-media-controller

### 큐시트템플릿 목록 조회
```
GET /cuesheettemplate
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|news_div_cd|뉴스구분코드|false|string||
|QueryParameter|brdc_pgm_id|프로그램아이디|false|string||
|QueryParameter|brdc_pgm_nm|프로그램명|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetTemplate Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-template-controller

### 큐시트템플릿 등록
```
POST /cuesheettemplate
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_tmplt_vo|필수값<br>프로그램아이디	brdc_pgm_id|true|CueSheetTemplate Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetTemplate Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-template-controller

### 큐시트템플릿 삭제
```
DELETE /cuesheettemplate/{cue_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_tmplt_id|큐시트템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-template-controller

### 큐시트템플릿 상세정보 조회
```
GET /cuesheettemplate/{cue_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_tmplt_id|큐시트템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetTemplate Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-template-controller

### 큐시트템플릿 수정
```
PUT /cuesheettemplate/{cue_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_tmplt_vo|필수값<br>프로그램아이디	brdc_pgm_id|true|CueSheetTemplate Entry||
|PathParameter|cue_tmplt_id|큐시트템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetTemplate Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* cue-sheet-template-controller

### 부서 목록 조회
```
GET /department
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|hrnk_dept_id|상위부서아이디|false|string||
|QueryParameter|dept_nm|부서명|false|string||
|QueryParameter|mng_yn|부서관리여부|false|string||
|QueryParameter|nshift_dept_yn|야근부서여부|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Department Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* department-controller

### 부서 등록
```
POST /department
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|dept_vo|dept_vo|true|Department Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Department Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* department-controller

### 부서 순번 변경
```
PATCH /department/{dept_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|dept_vo|dept_vo|true|Department Entry||
|PathParameter|dept_id|부서아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Department Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|500|Internal Server Error|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* department-controller

### 부서 삭제
```
DELETE /department/{dept_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|dept_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* department-controller

### 부서 상세 조회
```
GET /department/{dept_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|dept_id|부서아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Department Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* department-controller

### 부서 수정
```
PUT /department/{dept_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|dept_vo|dept_vo|true|Department Entry||
|PathParameter|dept_id|부서아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Department Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* department-controller

### 파일 업로드
```
POST /file
```

#### Description

파일구분코드로 메뉴별 첨부파일 업로드

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|FormDataParameter|file|file|false|file||
|QueryParameter|file_div_cd|01: 출입처보도자료<br>02: 출입처정보<br>03: 게시글<br>04: 제보<br>05: 제보사례<br>06: 연합포토<br>07: 연합국문<br>08: CG의뢰<br>09: 약물<br>10: 뉴미디어기사<br>11: 인물정보|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeFileDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* multipart/form-data

#### Produces

* application/json

#### Tags

* attach-file-controller

### 파일 다운로드
```
GET /file/{file_id}
```

#### Description

▶ 영상파일은 swagger 테스트 하면 안됩니다.

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|file_id|파일아이디|true|string||
|QueryParameter|file_div_cd|파일구분코드|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Response|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* attach-file-controller

### 그룹 목록 조회
```
GET /group
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|user_grp_nm|그룹명|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Group Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* group-controller

### 그룹 등록
```
POST /group
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|grp_vo|Created Group object|true|Group Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* group-controller

### 그룹 삭제
```
DELETE /group/{user_grp_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_grp_id|user_grp_id|true|string||
|QueryParameter|del_yn|삭제여부|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* group-controller

### 그룹 상세정보 조회
```
GET /group/{user_grp_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_grp_id|사용자그룹아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Group Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* group-controller

### 그룹 수정
```
PUT /group/{user_grp_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|grp_vo|Update Group object|true|Group Entry||
|PathParameter|user_grp_id|user_grp_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* group-controller

### 로그인
```
GET /login
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|user_id|사용자아이디|false|string||
|QueryParameter|pwd|비밀번호|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|LoginDomain|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* login-controller

### 큐시트 목록 조회
```
GET /mam/cuesheet
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일자|false|string||
|QueryParameter|edate|검색종료일자|false|string||
|QueryParameter|brdc_pgm_id|프로그램아이디|false|string||
|QueryParameter|brdc_pgm_nm|프로그램명|false|string||
|QueryParameter|brdc_dt|방송일자|false|string||
|QueryParameter|brdc_clk|방송시각|false|string||
|QueryParameter|direction|direction<br>forward,backward|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheet Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### 큐시트아이템 상세정보 조회
```
GET /mam/cuesheet/{cue_id}/item/{cue_item_id}
```

#### Description

▶앵커멘트<br> - 큐시트에 작성된 앵커멘트 없으면 기사 앵커멘트, 있으면 큐시트 앵커멘트 보여준다<br>▶자막<br> - 큐시트 자막있으며 큐시트 자막, 없으면 기사의 자막이 출고상태면 보여주고 아니면 안보여준다

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|cue_id|큐시트아이디|true|string||
|PathParameter|cue_item_id|큐시트아이템아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItem Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### 큐시트 미디어 목록 조회
```
GET /mam/cuesheetmedia
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_item_id|큐시트아이템아이디|true|string||
|QueryParameter|media_grp_id|미디어그룹아이디|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemMedia Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### 큐시트아이템 미디어 배정 목록
```
GET /mam/cuesheetmedia/assign
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|cue_id|큐시트아이디|false|string||
|QueryParameter|brdc_dt|방송일자(yyyyMMdd)|false|string||
|QueryParameter|brdc_clk|방송시각(hhmm)|false|string||
|QueryParameter|direction|direction<br>forward,backward|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|CueSheetItemMediaMamDomain Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### 큐시트 미디어 수정
```
PUT /mam/cuesheetmedia/{cue_media_id}
```

#### Description

▶

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|cue_media_vo|필수값<br>cue_item_id|true|CueSheetItemMedia Entry||
|PathParameter|cue_media_id|cue_media_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### patchTest
```
PATCH /mam/patch
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### patchTest2
```
PATCH /mam/patch2
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* mam-controller

### 전송상태수정
```
PUT /mam/playout/{playout_id}/transmission
```

#### Description

▶

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|playout_id|playout_id|true|string||
|QueryParameter|content_id|콘텐트아이디|true|string||
|QueryParameter|trnsf_st_cd|전송상태코드|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* mam-controller

### 내기사 목록 조회
```
GET /myarticle
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일|true|string||
|QueryParameter|edate|검색종료일|true|string||
|QueryParameter|artcl_typ_cd|기사유형코드|false|string||
|QueryParameter|embg_yn|엠바고여부|false|string|N|
|QueryParameter|search_word|검색어|false|string||
|QueryParameter|rptr_id|기자아이디|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|MyArticleList Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* my-article-controller

### 내기사 등록
```
POST /myarticle
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|my_artcl_vo|Created article object|true|MyArticle Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|MyArticle Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* my-article-controller

### 내기사 삭제
```
DELETE /myarticle/{my_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|my_artcl_id|내기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* my-article-controller

### 내기사 상세정보 조회
```
GET /myarticle/{my_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|my_artcl_id|내기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|MyArticle Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* my-article-controller

### 내기사 수정
```
PUT /myarticle/{my_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|my_artcl_vo|Update article object|true|MyArticle Entry||
|PathParameter|my_artcl_id|내기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|MyArticle Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* my-article-controller

### 내기사 송고
```
PUT /myarticle/{my_artcl_id}/transfer
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|my_artcl_id|내기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* my-article-controller

### 프로그램 목록 조회
```
GET /program
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|use_yn|사용여부|false|string||
|QueryParameter|brdc_pgm_div_cd|프로그램구분코드(CD2017021600161)|false|string||
|QueryParameter|brdc_pgm_nm|프로그램명|false|string||
|QueryParameter|artcl_item_use_yn|기사아이템사용여부|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Program Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* program-controller

### 프로그램 등록
```
POST /program
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|pgm_vo|Created program object|true|Program Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Program Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* program-controller

### 테스트용
```
POST /program/test
```

#### Description

건들지마세요

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|ad|Created program object|true|Program Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Program Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* program-controller

### 프로그램 삭제
```
DELETE /program/{pgm_id}
```

#### Description

프로그램 삭제

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|pgm_id|pgm_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* program-controller

### 프로그램 상세정보 조회
```
GET /program/{pgm_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|pgm_id|프로그램아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Program Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* program-controller

### 프로그램 수정
```
PUT /program/{pgm_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|pgm_vo|update program object|true|Program Entry||
|PathParameter|pgm_id|프로그램아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Program Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* program-controller

### 약물 목록 조회
```
GET /symbol
```

#### Description

▶ 프로그램, 약물명 검색

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|use_yn|사용여부|false|string||
|QueryParameter|brdc_pgm_id|프로그램아이디|false|string||
|QueryParameter|symbol_nm|약물명|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Symbol Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* symbol-controller

### 약물 등록
```
POST /symbol
```

#### Description

▶ 필수값<br>1. symbol_nm - 약물명<br>2. brdc_pgm_id - 프로그램아이디<br> ▶ 약물 과 약물 첨부파일은 1:1

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|symbol_vo|Created Symbol object|true|Symbol Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Symbol Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* symbol-controller

### 약물 삭제
```
DELETE /symbol/{symbol_id}
```

#### Description

약물 삭제

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|symbol_id|symbol_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* symbol-controller

### 약물 상세정보 조회
```
GET /symbol/{symbol_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|symbol_id|약물아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Symbol Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* symbol-controller

### 약물 수정
```
PUT /symbol/{symbol_id}
```

#### Description

▶ 필수값<br>1. symbol_nm - 약물명<br>2. brdc_pgm_id - 프로그램아이디<br>▶ 약물 과 약물 첨부파일은 1:1<br>▶ 파일아이디 있으면 비교후 업데이트, 없으면 삭제

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|symbol_vo|Update Symbol object|true|Symbol Entry||
|PathParameter|symbol_id|symbol_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Symbol Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* symbol-controller

### 템플릿그룹 목록
```
GET /templategroup
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|search_word|검색어|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|TemplateGroup Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿그룹 등록
```
POST /templategroup
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|tmplt_grp_vo|tmplt_grp_vo|true|TemplateGroup Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|TemplateGroup Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿그룹 삭제
```
DELETE /templategroup/{tmplt_grp_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|TemplateGroup Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿그룹 상세 조회
```
GET /templategroup/{tmplt_grp_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|TemplateGroup Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿그룹 수정
```
PUT /templategroup/{tmplt_grp_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|tmplt_grp_vo|tmplt_grp_vo|true|TemplateGroup Entry||
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|TemplateGroup Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿 목록
```
GET /templategroup/{tmplt_grp_id}/template
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||
|QueryParameter|brdc_pgm_id|방송프로그램아이디|false|string||
|QueryParameter|search_word|검색어|false|string||
|QueryParameter|curpage|패이지|false|string||
|QueryParameter|rowcount|로우카운트|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Template Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿 등록
```
POST /templategroup/{tmplt_grp_id}/template
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||
|BodyParameter|tmplt_vo|tmplt_vo|true|Template Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Template Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿 삭제
```
DELETE /templategroup/{tmplt_grp_id}/template/{cap_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||
|PathParameter|cap_tmplt_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Template Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿 상세 조회
```
GET /templategroup/{tmplt_grp_id}/template/{cap_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||
|PathParameter|cap_tmplt_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Template Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 템플릿 수정
```
PUT /templategroup/{tmplt_grp_id}/template/{cap_tmplt_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|tmplt_vo|tmplt_vo|true|Template Entry||
|PathParameter|tmplt_grp_id|템플릿그룹아이디|true|string||
|PathParameter|cap_tmplt_id|템플릿아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Template Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* template-group-controller

### 기사 상세정보 조회
```
GET /test/{artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|artcl_id|기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Article Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* test-controller

### 사용자 목록 조회
```
GET /user
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|user_nm|사용자명|false|string||
|QueryParameter|duty_div_cd|직무구분코드|false|string||
|QueryParameter|use_yn|사용여부|false|string||
|QueryParameter|dept_id|부서아이디|false|string||
|QueryParameter|user_grp_id|그룹아이디|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|User Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-controller

### 사용자 등록
```
POST /user
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|user_vo|Created User object|true|User Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|User Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-controller

### 사용자명 조회
```
GET /user/valid
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|user_nm|사용자명|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|User Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-controller

### 사용자 상세정보 조회
```
GET /user/{user_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_id|사용자아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|User Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-controller

### 사용자 수정
```
PUT /user/{user_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|user_vo|Update User object|true|User Entry||
|PathParameter|user_id|user_id|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|User Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-controller

### 사용자 폐기
```
PATCH /user/{user_id}/delete
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_id|사용자 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-controller

### 사용자설정 목록
```
GET /userset/{user_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_id|사용자 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|UserSet Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-set-controller

### 사용자설정 등록
```
POST /userset/{user_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|user_set_vo|user_set_vo|true|UserSet Entry||
|PathParameter|user_id|사용자 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|UserSet Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-set-controller

### 사용자설정 삭제
```
DELETE /userset/{user_id}/{user_set_key}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_id|사용자 아이디|true|string||
|PathParameter|user_set_key|사용자설정 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|UserSet Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-set-controller

### 사용자설정 정보
```
GET /userset/{user_id}/{user_set_key}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|user_id|사용자 아이디|true|string||
|PathParameter|user_set_key|사용자설정 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|UserSet Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-set-controller

### 사용자설정 수정
```
PUT /userset/{user_id}/{user_set_key}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|user_set_vo|User Set object|true|UserSet Entry||
|PathParameter|user_id|사용자 아이디|true|string||
|PathParameter|user_set_key|사용자설정 아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|UserSet Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* user-set-controller

### 영상취재의뢰 목록 조회
```
GET /videoreportask
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시자일자(yyyyMMdd)|true|string||
|QueryParameter|edate|검색종료일자(yyyyMMdd)|true|string||
|QueryParameter|brdc_pgm_id|프로그램아이디|false|string||
|QueryParameter|rpt_class_cd|취재분류코드(CD2017041700241)|false|string||
|QueryParameter|search_word|검색어|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|VideoReporterAsk Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* video-report-ask-controller

### 영상취재의뢰 등록
```
POST /videoreportask
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|video_rpt_ask_vo|video_rpt_ask_vo|true|VideoReporterAsk Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|VideoReporterAsk Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* video-report-ask-controller

### 영상취재의뢰 삭제
```
DELETE /videoreportask/{video_rpt_ask_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|video_rpt_ask_id|영상취재의뢰아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|VideoReporterAsk Entry|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* video-report-ask-controller

### 영상취재의뢰 상세 조회
```
GET /videoreportask/{video_rpt_ask_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|video_rpt_ask_id|영상취재의뢰아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|VideoReporterAsk Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* video-report-ask-controller

### 영상취재의뢰 수정
```
PUT /videoreportask/{video_rpt_ask_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|video_rpt_ask_vo|video_rpt_ask_vo|true|VideoReporterAsk Entry||
|PathParameter|video_rpt_ask_id|영상취재의뢰아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|VideoReporterAsk Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* video-report-ask-controller

### 연합국문 목록 조회
```
GET /yonhap
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일|true|string||
|QueryParameter|edate|검색종료일|true|string||
|QueryParameter|artcl_cate_cds|분류코드(CD2017010300048)|false|string||
|QueryParameter|region_cds|지역코드|false|string||
|QueryParameter|search_word|제목검색|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapList Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-controller

### 연합기사 등록
```
POST /yonhap
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|yh_vo|yh_vo|true|Yonhap Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Yonhap Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-controller

### 연합국문 상세정보 조회
```
GET /yonhap/{yh_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|yh_artcl_id|연합기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Yonhap Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-controller

### 연합뉴스 복사
```
POST /yonhap/{yh_artcl_id}/copy
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|yh_artcl_id|연합기사아이디|true|string||
|QueryParameter|copy_div_cd|복사구분<br>01:취재데스크<br>02:내기사|true|string||
|QueryParameter|input_dt|입력일자(yyyyMMdd)|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|StatusCodeDomain|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-controller

### 연합 파일 업로드
```
POST /yonhap/{yh_artcl_id}/upload
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|files|files|true|multi file array||
|FormDataParameter|yh_attc_file_vo_list|yh_attc_file_vo_list|true|multi Yonhap File Entry array||
|PathParameter|yh_artcl_id|연합기사아이디|true|string||
|BodyParameter|yh_div_cd|yh_div_cd|false|string||
|QueryParameter|file_div_cd|파일구분코드|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Yonhap File Entry array|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* multipart/form-data

#### Produces

* application/json

#### Tags

* yonhap-controller

### 연합외신 목록 조회
```
GET /yonhapInternational
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일|true|string||
|QueryParameter|edate|검색종료일|true|string||
|QueryParameter|agcy_cd|통신사코드|false|string||
|QueryParameter|search_word|검색어|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapList Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-international-controller

### 연합외신 등록
```
POST /yonhapInternational
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|wire_vo|wire_vo|true|YonhapList Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapList Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-international-controller

### 연합외신 상세정보 조회
```
GET /yonhapInternational/{yh_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|yh_artcl_id|연합기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapList Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-international-controller

### 연합포토 목록 조회
```
GET /yonhapPhoto
```

#### Description

FILE_TYP_CD   MIME_TYP   설명<br>FULL   image/jpeg   Full Size Image<br>P1   image/jpeg   Preview Image 1<br>P2   image/jpeg   Preview Image 2<br>T   image/jpeg   ThumbNail

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일|true|string||
|QueryParameter|edate|검색종료일|true|string||
|QueryParameter|cate_cd|분류코드(CD2017010300048)|false|string||
|QueryParameter|search_word|검색어|false|string||
|QueryParameter|yh_photo_div_cd|연합구분코드(CD2017050100026)|false|string||
|QueryParameter|curpage|패이지|false|string||
|QueryParameter|rowcount|로우카운트|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapPhoto Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-photo-controller

### 연합포토 등록
```
POST /yonhapPhoto
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|yh_photo_vo|yh_photo_vo|true|YonhapPhoto Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapPhoto Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-photo-controller

### 연합포토 상세정보 조회
```
GET /yonhapPhoto/{yh_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|yh_artcl_id|연합기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapPhoto Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-photo-controller

### 연합출입처 보도자료 목록 조회
```
GET /yonhapPressData
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|sdate|검색시작일|true|string||
|QueryParameter|edate|검색종료일|true|string||
|QueryParameter|class_cd|분류코드(CD2017051604315)|false|string||
|QueryParameter|region_cd|지역코드|false|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapPressData Entry array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-press-data-controller

### 연합출입처 보도자료 등록
```
POST /yonhapPressData
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|yh_press_data_vo|yh_press_data_vo|true|YonhapPressData Entry||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapPressData Entry|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-press-data-controller

### 연합출입처 보도자료 상세정보 조회
```
GET /yonhapPressData/{yonhap_artcl_id}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|yonhap_artcl_id|연합기사아이디|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|YonhapPressData Entry|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* yonhap-press-data-controller

