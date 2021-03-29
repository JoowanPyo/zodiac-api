package com.gemiso.zodiac.util.common;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

public class DtoDiff {

	public static <T> boolean diff(T target1, T target2, Class<T> targetClass) {
		
		boolean isNotEqualValue = true;
		
		try {
			for (PropertyDescriptor pd : Introspector.getBeanInfo(targetClass, Object.class).getPropertyDescriptors()) {
				Object value1 = pd.getReadMethod().invoke(target1);
				Object value2 = pd.getReadMethod().invoke(target2);

				if(value1 != null || value2 != null ) {
				
					//boolean isNotEqualValue = (value1 == value2) || (value1 != null && value1.equals(value2));
					
					
					
					if (value1 instanceof Integer) {
						System.out.println("Integer");
						isNotEqualValue = (int) value1 == (int) value2;
					} else if (value1 instanceof String) {
						System.out.println("String");
						isNotEqualValue = (value1 != null ? value1 : "").toString().equals(value2 != null ? value2 : "");
					} else if (value1 instanceof Boolean) {
						System.out.println("boolean");
						isNotEqualValue = ((boolean) value1 == (boolean) value2);
					}
					
					if (!isNotEqualValue) {
						System.out.println(String.format("%s의 값이 다름. value1 : %s, value2 : %s", pd.getName(), value1, value2));
						break;
					}
				}
			}
		} catch (IntrospectionException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return isNotEqualValue;
	}

}
