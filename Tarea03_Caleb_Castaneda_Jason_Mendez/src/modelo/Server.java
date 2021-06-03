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
			
			
			do{
				
				Thread.sleep(25);
				line = inFromClient.readLine();
				
			
				
				
				//SE CREARON LAS SIGUIENTES CONDICIONES PARA PODER AGREGAR A LA LISTA EL FRUTO QUE CORRESPONDE EN RELACION A LO INGRESADO POR EL USUARIO.
				//PD: ESTO DE LA CREACION DE LISTA EN SEGUNDO PLANO ES AJENA AL USER, DEPENDERÁ DE ÉL ADICIONAR AL CARRITO LO CONSULTADO SI ASI LO QUE QUISIERA.
				
				
				
				
				
				
				if(line.equalsIgnoreCase("Manzana")) {
					p = new Producto();
					p.setNombre("Manzana");
					p.setPrecio(500);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre() + "||Precio: "+ Integer.toString(p.getPrecio())+"\n";

					outToClient.writeBytes(outline); //SE COPIA LA INFO DE FOMRA LINEAR. PARA QUE LO RECIBA EL READLINE();
		
				}
				
		
				
				if(line.equalsIgnoreCase("Banano")) {
					p = new Producto();
					p.setNombre("Banano");
					p.setPrecio(250);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
					
					
				}
				
				
				
				if(line.equalsIgnoreCase("Uva")){
					p = new Producto();
					p.setNombre("Uva");
					p.setPrecio(2200);
					total += p.getPrecio();	
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
					
				}
				
				
				
				if(line.equalsIgnoreCase("Chile dulce")){
					p.setNombre("Chile dulce");
					p.setPrecio(1600);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				
				
				
				if(line.equalsIgnoreCase("Aguacate")){
					p = new Producto();
					p.setNombre("Aguacate");
					p.setPrecio(4500);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				
				
				
				if(line.equalsIgnoreCase("Tomate")){
					p = new Producto();
					p.setNombre("Aguacate");
					p.setPrecio(950);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				
				
				if(line.equalsIgnoreCase("Cebolla")){
					p = new Producto();
					p.setNombre("Cebolla");
					p.setPrecio(1300);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				
				
				if(line.equalsIgnoreCase("Yuca")){
					p = new Producto();
					p.setNombre("Yuca");
					p.setPrecio(600);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				
				
				
				if(line.equalsIgnoreCase("Papa")){
					p = new Producto();
					p.setNombre("Papa");
					p.setPrecio(1200);
					total += p.getPrecio();
					outline = "Kg: "+p.getNombre()+ "||Precio: "+ Integer.toString(p.getPrecio())+"\n";
					outToClient.writeBytes(outline);
						
				}
				
				
				if(line.equalsIgnoreCase("saberTotal")) {
					String totalS;
					//System.out.println(total);
					totalS = "total de la compra: "+String.valueOf(total)+ "\n";
					outToClient.writeBytes(totalS);
					
				}
				
				
				
				if(line.equalsIgnoreCase("quit")) {
					
					outToClient.writeBytes("end");
					//Thread.sleep(100);
					connectionSocket.close();
					welcomeSocket.close();
					Thread.currentThread().stop();
				}
				
				
				if(line.equalsIgnoreCase("carrito")) {
					total =0;
					outToClient.writeBytes("nada" + "\n");
				}
				
		
				
			}while(!line.equalsIgnoreCase("quit"));//CERRAMOS AMBOS SOCKETS
			
			
			
	}
}
