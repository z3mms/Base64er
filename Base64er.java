/*
* Simple Java-based base64 encoder/decoder
* by TZ
*/

import java.util.Base64;
import java.io.*;

public class Base64er {
	public static void main(String[] args) {
		
		switch(args[0]) {
			case "-encode": 
			System.out.println(encode(args[1]));
			break;
			
			case "-decode": 
			System.out.println(decode(args[1]));
			break;
			
			default:
			System.out.println("java Base64er [-encode/-decode] [string]");
		}
	}
	
	static String encode(String raw) {
		return Base64.getEncoder().encodeToString(raw.getBytes());
	}
	
	static String decode(String enc) {
		byte[] decodedBytes = Base64.getDecoder().decode(enc);
		String decoded = new String(decodedBytes);
		return decoded;
	}
}