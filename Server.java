package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;





public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1�r etape
		ServerSocket ss=new ServerSocket(1234);
		System.out.println("server  connect�");
		//2�me etape
		Socket s=ss.accept();
		
		System.out.println("un client est  connect�");
		//3�me etape
		InputStream in =s.getInputStream();
		int a = in.read();
		int res =a*5;
		System.out.println("le resultat retourn� au server est "+res);
		OutputStream out = s.getOutputStream();
		out.write(res);
		s.close();
		ss.close();
		

	}

}
