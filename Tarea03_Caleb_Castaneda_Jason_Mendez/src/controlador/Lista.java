package controlador;


import java.util.LinkedList;

import javax.swing.JOptionPane;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import modelo.TCPclient;






public class Lista {
	
	LinkedList<String> ordenes = new LinkedList<String>();	//NO SE REQUIERE GUARDAR UN TIPO DE DATO ESPECIAL,"OBJETO", ES POR ESA LA RAZON QUE GUARDAN CADENAS DE CARACTERRES/STRING PARA EFECTOS PRACITOS DE LA IDEA.		
	
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			int size=0;
			
			
			public void insertar(String string) {//SE IRAN AGREGANDO LAS SOLICITUDES EN EL REGISTRO DEL SEGURO
				ordenes.add(string);
				size++;
				
			}
			
		
		
			
			public void eliminarLista() {//SE ELIMINA DE FORMA TOTAL EL REGISTRO DE SOLICITUDES,
				
				
				if(ordenes.isEmpty()) {
					
					
					mensajeTemporizado("TODAVIA NO HAY ORDENES PARA ELIMINAR", 2000);//si esta vacia se hace uso del metodo correspondiente y se devuelve este mensaje
					
					
				}else {
					
					ordenes.removeAll(ordenes);
					mensajeTemporizado("Registro Eliminado", 1400);
			
				}
							
				
				
			}
			
				
			
			
			public String mostrar() {//EL ASEGURADO PODRA VER EL TOTAL DE SUS SOLICITUDES JUNTO AL DETALLE DE LAS MISMAS
				
				
				
				String mensaje="";
				if(ordenes.isEmpty()) {
					
					
					mensajeTemporizado("TODAVIA NO HAY ORDENES PARA MOSTRAR", 2000);//si esta vacia se hace uso del metodo correspondiente y se devuelve este mensaje
					
					
				}else {
					
					
					//DATOS PARA QUE SEAN MOSTRADOS EN LA GUI
				
					for (int i = 0; i < ordenes.size(); i++) {
					mensaje+=ordenes.get(i)+ "\n\n";
					
					}
					
					
					
					
				}
				return mensaje;
			}
			
			public boolean elementosLista() {// PARA VER SI HAY ELEMENTOS EN LISTA 
				
				boolean hayElementos= false;
				
				if (ordenes.isEmpty()==true) {
					 hayElementos = false; // si vacia, no hay elementos en lista
					
					
				}else {// de lo contrario, contiene elementos
					hayElementos = true;
				}
				
				
				return hayElementos;
			}
			
			
			public boolean existeElemento(int d) {
				
				
				//la variable "d" se utiliza para recibir el dato del JTxtField
				boolean existe= false;
				
					
					try {
						if(ordenes.isEmpty()) {///Si esta vacia se despliega el mensaje
							mensajeTemporizado("NO EXISTEN SOLICITUDES", 1500);
						}else {
							existe = true;
							
						}
						}catch (Exception e) {
							mensajeTemporizado("NO EXISTEN SOLICITUDES", 1500);
							existe = false;
						}
					return existe;
					
			}
			
			
		
	
				
			public void mensajeTemporizado(String s, int t) {//METODO PARA HACER MENSAJES TEMPORIZADOS, ES MUY UTIL PARA LA GUI Y ADEMAS FACIL DE USAR
				JOptionPane opt = new JOptionPane(s, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
				  final JDialog dlg = opt.createDialog("Aviso");
				  new Thread(new Runnable()
				        {
				          public void run()
				          {
				            try
				            {
				              Thread.sleep(t);//Duracion de un segundo para que el mensaje desaparezca
				              dlg.dispose();

				            }
				            catch ( Throwable th )
				            {
				          
				            }
				          }
				        }).start();
				  dlg.setVisible(true);
			}
		}

		
		

