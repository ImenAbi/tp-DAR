package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import java.util.Scanner;

public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			
		
		
		System.out.print(" je suis un client pas encore connecté...");
		Socket s = new Socket  ("localhost",1234);
		
		System.out.print("je suis un client connecté.. ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("entre un entier");
		int a = sc.nextInt();
		OutputStream out = s.getOutputStream();
		out.write(a);
		InputStream in = s.getInputStream();
		int res = in.read();
		System.out.print("lle resultat :"+res);
		s.close();
		
		
		}
	
    catch(IOException e){
    	e.printStackTrace();
    	
    }
 }
}