package modelo;
import java.io.*;
import java.net.*;
public class Server {
	
	public static void main(String argv[]) throws Exception {
		
		Producto p = new Producto();
		String line; // Almacena lo recibido
		String outline;
		String mensaje;
		int total =0;
		
		
		
		ServerSocket welcomeSocket = new ServerSocket(6789); //welcomeSocket es el socker servidor que acepta la conexión
		
			 // connectionSocket es aquel que atiende a un cliente específico
			
			Socket connectionSocket = welcomeSocket.accept(); // Esta concatenación de objetos adaptadores permite la lectura simple de datos desde el socket para ese cliente.
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); // Recibe datos y los envia a pantalla.
			DataOutputStream outToClient =new DataOutputStream(connectionSocket.getOutputStream());
			
			
			
			
			while (true){
				
				line = inFromClient.readLine();
				
			
				
				if(line.equalsIgnoreCase("Manzana")) {
					p = new Producto();
					p.setNombre("Manzana");
					p.setPrecio(500);
					total += p.getPrecio();
					outline = "Kilo de: "+p.getNombre() + "|| Precio: "+ Integer.toString(p.getPrecio())+"\n";

					outToClient.writeBytes(outline); //SE COPIA LA INFO DE FOMRA LINEAR. PARA QUE LO RECIBA EL READLINE();
				
									
				}
				if(line.equalsIgnoreCase("Banano")) {
					p = new Producto();
					p.setNombre("Banano");
					p.setPrecio(250);
					total += p.getPrecio();
					outline = "Kilo de: "+p.getNombre()+ "|| Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
					
					
				}
				if(line.equalsIgnoreCase("Uva")){
					p = new Producto();
					p.setNombre("Uva");
					p.setPrecio(2200);
					total += p.getPrecio();	
					outline = "Kilo de: "+p.getNombre()+ "|| Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
					
				}
				if(line.equalsIgnoreCase("Chile dulce")){
					p.setNombre("Chile dulce");
					p.setPrecio(1000);
					total += p.getPrecio();
					outline = "Kilo de: "+p.getNombre()+ "|| Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				if(line.equalsIgnoreCase("Aguacate")){
					p = new Producto();
					p.setNombre("Aguacate");
					p.setPrecio(2500);
					total += p.getPrecio();
					outline = "Kilo de: "+p.getNombre()+ "|| Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				if(line.equalsIgnoreCase("Carrito")) {
					connectionSocket.close();
					welcomeSocket.close();
				}
				
			//	System.out.println(line);	
				
			}//while(!line.equalsIgnoreCase("quit"));//CERRAMOS AMBOS SOCKETS
			
			//System.out.println("holis");
			
			
	}
}
