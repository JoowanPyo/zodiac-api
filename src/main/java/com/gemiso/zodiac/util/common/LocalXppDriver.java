package com.gemiso.zodiac.util.common;

import java.io.Writer;

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver; 

/* * XStream(http://xstream.codehaus.org/)을 사용하는 확장 XppDriver클래스
 * CDATA 처리를 위한 Class 
 * 동시에 @XStreamAlias에서 _ (underscore) 로 선언한 필드가 __ 로 두개의 underscore로 표시되는 XStream 버그도 같이 처리함 * 
*/ 

public class LocalXppDriver extends XppDriver { 
	
	public static XmlFriendlyNameCoder nameCoder = new XmlFriendlyNameCoder("$","_"); 
	
	public LocalXppDriver() { 
		super(nameCoder); 
	} 
	public HierarchicalStreamWriter createWriter(Writer out) {
		return new LocalPrettyPrintWriter(out, nameCoder); 
	} 
}
