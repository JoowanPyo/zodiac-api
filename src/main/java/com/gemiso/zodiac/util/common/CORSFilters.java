package com.gemiso.zodiac.util.common;


import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

public class CORSFilters extends CorsFilter {

	public CORSFilters() {
		super(configurationSource());
	}

	private static UrlBasedCorsConfigurationSource configurationSource() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		
		/* Add Custom Header */
		config.addExposedHeader("cue_ver");
		config.addExposedHeader("cue_ord_ver");
		config.addExposedHeader("originator");
		config.addExposedHeader("cue_tmplt_id");
		config.addExposedHeader("reload_yn");
		config.addExposedHeader("cue_artcl_cap_st_cd");
		config.addExposedHeader("cue_artcl_cap_chg_yn");
		config.addExposedHeader("anc_ment_chg_yn");
		config.addExposedHeader("anc_ment_st_cd");
		config.addExposedHeader("user_id");
		config.addExposedHeader("pwd");
		config.addExposedHeader("startPosition");
		config.addExposedHeader("returnCount");
		config.addExposedHeader("totalCount");
		config.addExposedHeader("currentPage");
		config.addExposedHeader("rowCount");
		config.addExposedHeader("count");
		
	    /*
	    config.addAllowedMethod("OPTIONS");
	    config.addAllowedMethod("HEAD");
	    config.addAllowedMethod("GET");
	    config.addAllowedMethod("PUT");
	    config.addAllowedMethod("POST");
	    config.addAllowedMethod("DELETE");
	    config.addAllowedMethod("PATCH");
	    */
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
}
