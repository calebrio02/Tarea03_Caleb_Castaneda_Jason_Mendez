package modelo;
import java.io.*;
import java.net.*;
public class Server {
	
	public static void main(String argv[]) throws Exception {
		String line; // Almacena lo recibido
		/*
		int n=0;
		
		if(argv.length>0) {
			try {
                n = Integer.parseInt(argv[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + argv[0] + " must be an integer.");

                // Program ends
                System.exit(1);
            }
		}
		
		*/
		
		
		ServerSocket welcomeSocket = new ServerSocket(6789); //welcomeSocket es el socker servidor que acepta la conexión
		
			 // connectionSocket es aquel que atiende a un cliente específico
			
			Socket connectionSocket = welcomeSocket.accept(); // Esta concatenación de objetos adaptadores permite la lectura simple de datos desde el socket para ese cliente.
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); // Recibe datos y los envia a pantalla.
			
			
			while (true){
				
				line = inFromClient.readLine();
				
				if(line.equalsIgnoreCase("hola")) {
					System.out.println("Holis");
				}
				
				if(line.equalsIgnoreCase("todo bien")) {
					System.out.println("mjmmmmm");
				}
				
				if(line.equalsIgnoreCase("ok")){
						System.out.println("cHAO");	
						
						if(line.equalsIgnoreCase("quit")) {
							connectionSocket.close();
							welcomeSocket.close();
						}
			}
				
			//	System.out.println(line);	
				
			}//while(!line.equalsIgnoreCase("quit"));//CERRAMOS AMBOS SOCKETS
			
			//System.out.println("holis");
			
			
	}
}
