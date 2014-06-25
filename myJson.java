/*
  Name:
  Student ID:F74004038
  Save the data from data.json to JSONArray json.
  Accroding to arg[1],arg[2],arg[3]'s requirement,find out the mean of the needed trade price.
*/


import java.net.*;
import java.io.*;
import org.json.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class myJson{

        public myJson(String filename,String arg1,String arg2,String arg3) throws Exception{
                JSONArray json = new JSONArray(new JSONTokener(new FileReader(new File(filename))));
		JSONObject jo;
		String a1,a2,a3;
		int temp,money=0,time=0;
		for (int i = 0 ; i < json.length(); i++){
			jo = json.getJSONObject(i);
			a1=jo.getString("");
			a2=jo.getString("");
			temp=jo.getInt("");
			a3=Integer.toString(temp);
			Pattern p1 = Pattern.compile(arg1);
			Pattern p2 = Pattern.compile(".*"+arg1+".*"+arg2+".*");
			Pattern p3 = Pattern.compile(".*"+arg3+".*");	
			Matcher m1 = p1.matcher(a1);
			Matcher m2 = p2.matcher(a2);
			Matcher m3 = p3.matcher(a3);
			while (m1.find() && m2.find() && m3.find()){
				//System.out.println("="+jo.getInt(""));
				money=money+jo.getInt("");
				time++;
			}
		}
		System.out.println(money/time);
	}
}