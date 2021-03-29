package com.gemiso.zodiac.util.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class CgColorTextParser {

	private static final String EMPTY_STRING = "";
	//강조색 부호, 변경 하면, com.gemiso.zmos.mosservice.impl.RoListImpl.getRoListService(MosRequestReq mosRequestReq) 여기도 변경해 줘야함.
	private static final char[] openTags = new char[] { '<', '{', '[' };
	
	//public static Dictionary<Character, String> TagColorMap = null;
   // Map<String, String> map = new HashMap<String, String>();
	//public static Map<Character, String> TagColorMap = null;
	
	public static boolean IsOpenTag(char tag)
    {
    	return ArrayUtils.contains( openTags, tag );
    	// return openTags.Contains(tag);
    }

	public static boolean IsCloseTag(char tag) {
		char[] closeTags = new char[] { '>', '}', ']' };
		return ArrayUtils.contains(closeTags, tag);
		// return openTags.Contains(tag);

	}

	public static String GetColorByTag(char tag, String rgb1, String rgb2, String rgb3)
    {
		
		Map<Character, String> TagColorMap = null;
		
       /* if(TagColorMap == null)
        {*/
            //TagColorMap = new Dictionary<Character, String>();
        	/*TagColorMap.Add('{', "255 0 0");
            TagColorMap.Add('[', "0 255 0");
            TagColorMap.Add('<', "0 0 255");*/
        	TagColorMap = new HashMap<Character, String>();
        	TagColorMap.put(openTags[0], rgb1);
        	TagColorMap.put(openTags[1], rgb2);
        	TagColorMap.put(openTags[2], rgb3);
       // }
        
      //return TagColorMap[tag];
        return TagColorMap.get(tag);
    }

	public static CgColorData Parse(String cgColorText, String rgb1, String rgb2, String rgb3) {
        
		CgColorData cgColorData = new CgColorData();
        List<Character> cgCharactors = new ArrayList<Character>();
        //List<Character> cgCharactors = new List<char>();
        boolean IsTagOpen = false;
        CgColor cgColor = null;            
        
        for (char c : cgColorText.toCharArray())
        //foreach (char c in cgColorText)
        {
            if(IsOpenTag(c))
            {
                IsTagOpen = true;
                cgColor = new CgColor();
                cgColor.RGBString = GetColorByTag(c, rgb1, rgb2, rgb3);
                cgColor.Index = cgCharactors.size();
                //cgColor.Index = cgCharactors.Count;                   
            }
            else if(IsCloseTag(c))
            {
                IsTagOpen = false;
                cgColorData.CgColors.add(cgColor);
                /*if (IsTagOpen) {
					cgColorData.CgColors.add(cgColor);
				}*/
                //cgColorData.CgColors.Add(cgColor);
            }
            else
            {
            	cgCharactors.add(c);
                //cgCharactors.Add(c);
                if (IsTagOpen)
                {                        
                    cgColor.Count++;
                }                    
            }
        }        

        cgColorData.CgText = join(cgCharactors, EMPTY_STRING);
        //cgColorData.CgText = String.Join(EMPTY_STRING, Arrays.asList(cgCharactors));
        //cgColorData.CgText = string.Join(string.Empty, cgCharactors);
        return cgColorData;
    }

	public static CgColorData ParseTest(String cgColorText, String rgb1, String rgb2, String rgb3) {

		CgColorData cgColorData = new CgColorData();
		List<Character> cgCharactors = new ArrayList<Character>();

		boolean IsTagOpen = false;

		CgColor cgColor = new CgColor();

		int openCnt = 0;
		int closeCnt = 0;

		char _openTag = 0;

		HashMap<String, String> _tag_map = new HashMap<String, String>();
		_tag_map.put("<", ">");
		_tag_map.put("{", "}");
		_tag_map.put("[", "]");

		int i = 0;
		
		for (char c : cgColorText.toCharArray()) {
			
			if (IsOpenTag(c)) {

				if (openCnt == 0) {
					_openTag = c;
					IsTagOpen = true;
					
					cgColor = new CgColor();
					cgColor.RGBString = GetColorByTag(c, rgb1, rgb2, rgb3);
					cgColor.Index = cgCharactors.size();
					
					openCnt = 1;
					closeCnt = 0;

					if (!endValidParse(cgColorText, _openTag, _tag_map, i)) {
						cgCharactors.add(c);
						cgColor.Count++;
					}
					
				} else {
					cgCharactors.add(c);
					cgColor.Count++;
				}

			} else if (IsCloseTag(c)) {

				boolean match_flag = String.valueOf(c).equals(_tag_map.get(String.valueOf(_openTag))) ? true : false;

				if(!match_flag) {
					cgColor.Count++;
				}
				
				if (closeCnt == 0 && match_flag) {
					
					IsTagOpen = false;
					cgColorData.CgColors.add(cgColor);
					
					openCnt = 0;
					closeCnt = 1;
				
				} else {
					cgCharactors.add(c);
				}

			} else {
				cgCharactors.add(c);

				if (IsTagOpen) {
					cgColor.Count++;
				}
			}
			i++;
		}
		
		cgColorData.CgText = join(cgCharactors, EMPTY_STRING);
		return cgColorData;
	}
	
	public static String join(List<?> list, String delim) {
	    int len = list.size();
	    if (len == 0)
	        return "";
	    StringBuilder sb = new StringBuilder(list.get(0).toString());
	    for (int i = 1; i < len; i++) {
	        sb.append(delim);
	        sb.append(list.get(i).toString());
	    }
	    return sb.toString();
	}

	
	public static boolean validParse(String str) {
		boolean result = true;

		int i = 0;
		int j = 0;
		int k = 0;

		for (char c : str.toCharArray()) {

			char[] openTags = new char[] { '<' };
			boolean flag = ArrayUtils.contains(openTags, c);

			if (flag) {
				i++;
			}

			char[] openTags2 = new char[] { '{' };
			boolean flag2 = ArrayUtils.contains(openTags2, c);

			if (flag2) {
				j++;
			}

			char[] openTags3 = new char[] { '[' };
			boolean flag3 = ArrayUtils.contains(openTags3, c);

			if (flag3) {
				k++;
			}
		}

		int _i = 0;
		int _j = 0;
		int _k = 0;

		for (char c : str.toCharArray()) {

			char[] closeTags = new char[] { '>' };
			boolean flag = ArrayUtils.contains(closeTags, c);

			if (flag) {
				_i++;
			}

			char[] closeTags2 = new char[] { '}' };
			boolean flag2 = ArrayUtils.contains(closeTags2, c);

			if (flag2) {
				_j++;
			}

			char[] closeTags3 = new char[] { ']' };
			boolean flag3 = ArrayUtils.contains(closeTags3, c);

			if (flag3) {
				_k++;
			}
		}

		if (i == _i && j == _j && k == _k) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
	

	public static boolean endValidParse(String str, char _openTag, HashMap<String, String> tag_map, int index) {

		String _txt = str.substring(index, str.length());

		boolean _end_flag = false;
		String _end_tag = tag_map.get(String.valueOf(String.valueOf(_openTag)));
		for (char t : _txt.toCharArray()) {
			if (String.valueOf(t).equals(_end_tag)) {
				_end_flag = true;
				break;
			}
		}

		return _end_flag;
	}
	
}