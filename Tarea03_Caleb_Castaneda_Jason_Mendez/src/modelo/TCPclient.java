package modelo;
import java.io.*;

import java.net.*;
import java.security.cert.CertPathValidator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

import vista.Interfaz;

import java.util.LinkedList;
public class TCPclient {
	
	   private static String dato;
	   
	   private static String respuesta ="";
	   
	   private static String nombreprecio;
	   
	   private static String total;
	   
	   private static int actualizarCarrito;
	   
	   public static void setActualizarCarrito(int n) {
		   actualizarCarrito =n ;
	   }
	   
	   public static int  getActualizarCarrito() {
		   return actualizarCarrito;
	   }
	   
	   
	   public static void setTotal(String total1) {
		   total = total1;
		}

		public static String gettotal() {
			return total;
		}
	   public static void setnombreprecio(String nombreprecio1) {
		   nombreprecio = nombreprecio1;
		}

		public static String getnombreprecio() {
			return nombreprecio;
		}
	   public static void setRespuesta(String respuesta1) {
			respuesta = respuesta1;
		}

		public static String getRespuesta() {
			return respuesta;
		}

		public static void setDato(String dato1) {
			dato = dato1;
			}

			public static String getDato() {
				return dato;
				}
		
		@SuppressWarnings("deprecation")
		public static void main(String argv[]) throws Exception{
		
		
		
		LinkedList <String> lista = new LinkedList<String>();
		
		
		String line; //ALMACENA LO DIGITADO
					//CONCATENACION DE OBJETOS ADAPTADORES PARA LA LECTURA
					//SIMPLE DE TECLADO
		String input;	
		String resumenLista="";
		
			
			
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
				
	
			
		while(true){
			
		
			Thread.sleep(25);
			
			if(TCPclient.getDato()!=null) {
				
				
				
				String inFromUser = TCPclient.getDato();
				

				//BufferedReader inFromUser = new BufferedReader(new InputStreamReader(null, dato));	//SOCKET EN EL CLIENTE PARA ENVIAR DATOS AL SERVIDOR	
				
				
				BufferedReader inFromServer =new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				
				
				
			
				if(lista.isEmpty()&&inFromUser.equalsIgnoreCase("saberTotal")) {
					
				TCPclient.setDato(null);
				Thread.sleep(25);
					
				}else {
					
					
				
					
				
					
					outToServer.writeBytes(TCPclient.getDato() +"\n");
					
					input = inFromServer.readLine();
				
					if(input.contains("end")) {
						clientSocket.close();
						Thread.currentThread().stop();
						
					}
					
					if(input.contains("nada")) {
						TCPclient.setRespuesta("");
						lista.clear();
						System.out.println(lista.size());
						
					}else {
						System.out.println(lista.size());
					}
					
					
					
					
				
				if(input.length()>0&&!input.contains("total")&&!input.contains("nada")){
				
					lista.add(input);
					
					TCPclient.setnombreprecio(input);
					
					String recopilador= "";
					
					for (int i = 0; i < lista.size(); i++) {
						
						recopilador += lista.get(i).toString()+ "\n";//ACA ERROR
						
						
					}
					
					resumenLista = recopilador;
					
					
					TCPclient.setDato(null);
					input = null;
					
			
					
					TCPclient.setRespuesta(resumenLista);
					
					
					
				}else 
					if (input.contains("total")) {
					
						
					TCPclient.setTotal(input);
					//lista.add(input);
					
					resumenLista="";
					String recopilador= "";
					
					
					for (int i = 0; i < lista.size(); i++) {
						
						recopilador += lista.get(i).toString()+"\n";//ACA ERROR
						
						
					}
					
					resumenLista = recopilador;
					
					
					TCPclient.setDato(null);
				
					System.out.println(input);
					
					TCPclient.setRespuesta(resumenLista  + TCPclient.gettotal());
					input=null;
					resumenLista="";
					
					
				
					
				}
				else if(input.contains("nada")){
					
					TCPclient.setDato(null);
					input=null;
				}
				
				
				
				
				
				}

				
				
				}
			
			
			}
		}
		}

			
	

			
	

