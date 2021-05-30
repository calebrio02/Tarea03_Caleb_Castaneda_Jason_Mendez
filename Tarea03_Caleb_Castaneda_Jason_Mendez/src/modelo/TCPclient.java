package modelo;
import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class TCPclient {

	public static void main(String argv[]) throws Exception{
		String line; //ALMACENA LO DIGITADO
					//CONCATENACION DE OBJETOS ADAPTADORES PARA LA LECTURA
					//SIMPLE DE TECLADO
		String input;	
			
			
				InetAddress ip;
				String hostname="";
				try {
					ip = InetAddress.getLocalHost();
					hostname = ip.getHostName();
				//	System.out.println("Your current IP address : " + ip);
					System.out.println("Your current Hostname : " + hostname);
	 
				} catch (UnknownHostException e) {
	 
					e.printStackTrace();
				}
	

				
			
			
			Socket clientSocket = new Socket(hostname, 6789);	//CONCATENACION DE OBJETOS ADAPTADORES PARA LA ESCRITURA
																					//O ENVIO DE DATOS EN FORMA SIMPLE A TRAVES DEL SOCKET
		
			
			
			
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());//LECTURA DE TECLADO Y ENVIO DE DATOS AL SERVIDOR.
				
			do {
				//BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));	//SOCKET EN EL CLIENTE PARA ENVIAR DATOS AL SERVIDOR	
				
				String inFromUser = JOptionPane.showInputDialog("mensaje");
				BufferedReader inFromServer =new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				line= inFromUser;
				outToServer.writeBytes(line + '\n');
				input = inFromServer.readLine();
				JOptionPane.showMessageDialog(null, input);
				
				
			}while(!line.equalsIgnoreCase("quit")); //CERRAMOS EL SOCKET Y CON ELLO TAMBIEN LA CONEXION.
			clientSocket.close();
	}

}
