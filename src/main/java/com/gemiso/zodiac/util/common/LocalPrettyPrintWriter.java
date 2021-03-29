package com.gemiso.zodiac.util.common;

import java.io.Writer;
import com.thoughtworks.xstream.core.util.QuickWriter; 
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter; 
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder; 
/*  XStream(http://xstream.codehaus.org/)을 사용하는 확장 PrettyPrintWriter클래스
 *  CDATA 처리를 위한 Class 
 *  
*/ 
public class LocalPrettyPrintWriter extends PrettyPrintWriter {
	/* private static final char[] AMP = "&amp;".toCharArray(); private static final char[] LT = "<".toCharArray(); private static final char[] GT = ">".toCharArray(); private static final char[] SLASH_R = " ".toCharArray(); private static final char[] QUOT = "&quot;".toCharArray(); private static final char[] APOS = "&apos;".toCharArray(); */ 
	private static final char[] AMP = "&".toCharArray(); 
	private static final char[] LT = "<".toCharArray(); 
	private static final char[] GT = ">".toCharArray(); 
	private static final char[] SLASH_R = " ".toCharArray(); 
	private static final char[] QUOT = "\"".toCharArray(); 
	private static final char[] APOS = "'".toCharArray(); 
	public LocalPrettyPrintWriter(Writer writer, XmlFriendlyNameCoder localNameCoder) { 
		super(writer, localNameCoder);
	} 
	/** 
	 * 실제 text값을 xml태그를 통해 표현하는 메소드이다.
	 * 상위 클래스인 PrettyPrintWriter의 다른 기능을 그대로 사용하되 CDATA처리를 위해 오버라이딩했다. . */ 
	protected void writeText(QuickWriter writer, String text) { 
		/** * 
		 * 값이 없을 경우 <태그 /> 형태로 그냥 반환해버린다. * 
		 * 차후 값이 없더라도 CDATA로 싸서 공백을 반환해야 하는 경우 아래 조건을 없애면 된다. */ 
		if( text.trim().length() < 1 ){ 
			super.writeText(writer, text); 
			return; 
		} 
		String CDATAPrefix = "<![CDATA["; 
		String CDATASuffix = "]]>"; 
		if(text.startsWith(CDATAPrefix)) { // 만일 CDATA로 이미 씌워져 있는 정보인 경우 그냥 통과시킨다. 
			super.writeText(writer, text); 
			System.out.println("cdata");
			return; 
		} 
		
		boolean resultFinal = determineOrModifySixChar(false,text,writer); // 다 돌고 왔는데 cdataTarget가 true라면 CDATA를 씌워준다. 
		
		if(resultFinal) { 
			writer.write(CDATAPrefix); 
			determineOrModifySixChar(true,text,writer); 
			writer.write(CDATASuffix); 
		} else { 
			determineOrModifySixChar(true,text,writer); 
		} 
	} 
	
	private boolean determineOrModifySixChar(boolean checkFlag, String text, QuickWriter writer) { 
		int length = text.length(); 
		boolean cdataTarget = false; 
		for (int i = 0; i < length; i++) { 
			char c = text.charAt(i); 
			switch (c) { 
			case '&': 
				if(checkFlag) writer.write(AMP); 
				cdataTarget = true; 
				break; 
			case '<': 
				if(checkFlag) writer.write(LT); 
				cdataTarget = true; 
				break; 
			case '>': 
				if(checkFlag) writer.write(GT); 
				cdataTarget = true; 
				break; 
			case '"': 
				if(checkFlag) writer.write(QUOT); 
				cdataTarget = true; 
				break; 
			case '\'': 
				if(checkFlag) writer.write(APOS); 
				cdataTarget = true; 
				break; 
			case '\r': 
				if(checkFlag) writer.write(SLASH_R); 
				cdataTarget = true; 
				break; 
			default: 
				if(checkFlag) writer.write(c); 
				} 
			} 
		return cdataTarget; 
		} 
	}

