package tres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;


public class ConvierteTarjetas {

	public static void main(String[] args) {

		File tarjetasArchivo = new File("tarjetas.dat");
		String tarjetaRuta = "tarjetas.dat";
		File datos = new File("datos.txt");
		
		try {
			
			FileReader lector = new FileReader(datos);
			BufferedReader flujoEntrada = new BufferedReader(lector);
			String linea = flujoEntrada.readLine();
			FileOutputStream tarjetas = new FileOutputStream(tarjetaRuta);
			ObjectOutputStream escritor = new ObjectOutputStream(tarjetas);
			
			linea = flujoEntrada.readLine();
			
			while (linea != null) {
				
				String[] parts = linea.split(",");
				
				Persona persona = new Persona (parts[0]+ " " + parts[1] , parts [2] , parts [3] , parts [4]);
				escritor.writeObject(persona);
				
				linea = flujoEntrada.readLine();
				
			}
			
			flujoEntrada.close();
			lector.close();
			
			System.out.println("Datos de datos.txt pasados a tarjetas.dat");
			
			// - Fin de 1º Parte
			
			

			
		}
		
		catch (EOFException o) {
			System.out.println("Terminado");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
