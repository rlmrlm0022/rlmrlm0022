package com.rlmrlm0022.util;

// No copyright claimed 

import android.widget.TextView;

public class Util {

/**
A wrapper class for this method to write a String
or String array to a TextView widget.
**/

	public void appendText(TextView v, String...  s){
		if (v == null){
			return;
		}
		if ((s == null)||(s.length<1)){
			return;
		}
		for (String ss : s){
			v.append(ss + "\r\n");
		}
	}

}//end util class
