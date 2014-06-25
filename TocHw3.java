/*
  Name:鍾明芬
  Student ID:F74004038
  Run read1 to get dara from the URL.
  Run myJson to get the 


*/

import java.net.*;
import java.io.*;
import org.json.*;
 
public class TocHw3{
    public static void main(String[] arg) throws Exception {
	String web1 = arg[0];/*"http://www.datagarage.io/api/5365dee31bc6e9d9463a0057"*///UTF-8           
	String file = "data.json";
	read1 read = new read1(web1);
	myJson j = new myJson(file,arg[1],arg[2],arg[3]);
    }
}