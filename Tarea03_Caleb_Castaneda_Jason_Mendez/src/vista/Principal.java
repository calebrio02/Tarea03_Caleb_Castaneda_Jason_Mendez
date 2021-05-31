package vista;

import java.awt.EventQueue;

import modelo.Server;
import modelo.TCPclient;
public class Principal {

	public static void main(String[] args) {
		
        
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		Thread interfazThread = new Thread() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        };
        
        interfazThread.start();
        
		 Thread serverThread = new Thread() {
	            public void run() {
	                try {
						Server.main(args);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        };
	        
	        
	        Thread clientThread = new Thread() {
	            public void run() {
	                try {
						TCPclient.main(args);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        };
        
	        serverThread.start();
	        
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        clientThread.start();
       
    
        
		
		

}

}