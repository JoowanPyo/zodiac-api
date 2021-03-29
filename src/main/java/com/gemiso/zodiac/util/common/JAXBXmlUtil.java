package com.gemiso.zodiac.util.common;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBXmlUtil {

	/*
	 * 
	 * 1. 메소드명: beanMarshal2XML
	 * 2. 클래스명: JAXBXmlUtil
	 * 3. 작성자명: SORA
	 * 4. 작성시간: 2017. 7. 3. 오후 3:08:31
	 */
	/**
	 * <PRE>
	 * 1. BeanClass를 XML로 마샬링 합니다..
	 *		
	 * 2. 사용법
	 *		
	 * </PRE>
	 *   @return String	
	 *   @param obj
	 *   @param beanClass
	 *   @return
	 */
	public static String marshal(Object obj, Class<?> instanceClass) {
		String rval = null;
		JAXBContext jaxbContext = null;
		Marshaller jaxbMarshaller = null;
		StringWriter writer = new StringWriter();
		try {
			jaxbContext = JAXBContext.newInstance(instanceClass);
			jaxbMarshaller = jaxbContext.createMarshaller();  
			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");  
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbMarshaller.marshal(obj, writer);
			
			rval = writer.toString();
		
		}catch (Exception e) {
			// TODO: handle exceptione
			e.printStackTrace();
		}		
		return rval;
	}

	/*
	 * 
	 * 1. 메소드명: unmarshal2Bean
	 * 2. 클래스명: JAXBXmlUtil
	 * 3. 작성자명: SORA
	 * 4. 작성시간: 2017. 7. 3. 오후 3:09:04
	 */
	/**
	 * <PRE>
	 * 1. XML을 BeanClass로 언마샬링합니다..
	 *		
	 * 2. 사용법
	 *		
	 * </PRE>
	 *   @return Object	
	 *   @param xml
	 *   @param beanClass
	 *   @return
	 */
	public static Object unmarshal(String xml, Class<?> instanceClass) {
		Object obj = null;
		try{
			StringReader reader = new StringReader(xml);
			JAXBContext jaxbContext = JAXBContext.newInstance(instanceClass);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			obj = (Object) jaxbUnmarshaller.unmarshal(reader);
			
		}catch (Exception e) {
			// TODO: handle exceptione
			e.printStackTrace();
		}		
		return obj;
	}
	
}
