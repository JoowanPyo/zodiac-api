package com.gemiso.zodiac.util.common;

import java.util.ArrayList;
import java.util.List;

public class CgColorData {

	public List<CgColor> CgColors = new ArrayList<CgColor>();
	public String CgText;

	public List<CgColor> getCgColors() {
		return CgColors;
	}

	public void setCgColors(List<CgColor> cgColors) {
		CgColors = cgColors;
	}

	public String getCgText() {
		return CgText;
	}

	public void setCgText(String cgText) {
		CgText = cgText;
	}

}
