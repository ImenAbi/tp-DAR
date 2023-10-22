package ServerPackage;
 import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAct3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(234);
		System.out.println("je suis un seveur connecté");
		Socket s=ss.accept();
		System.out.print("je suis un client connecté");
		InputStream in = s.getInputStream();
		int a = in .read();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bf  = new BufferedReader(isr);
		String op = bf.readLine();
		int res = 0;
		switch(op){
		case"+":res = a+5;
		      break;
		case"-":res = a-5;
	      break;
		case"/":res = a/5;
	      break;
		case"*":res = a*5;
	      break;
		}
		System.out.println("le resultat retourné est"+res);
		OutputStream out = s.getOutputStream();
		out.write(res);
		s.close();
		ss.close();
		
	 
	 
	 
		}
		
		
		

	

}
