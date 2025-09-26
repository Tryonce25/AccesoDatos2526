package uno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class ConvierteTarjetas {

	public static void main(String[] args) {
		ArrayList<String> personas = new ArrayList<String>();
		File tarjetas = new File("tarjetas.txt");
		File datos = new File("datos.txt");
		try {
			
			FileReader lector = new FileReader(datos);
			BufferedReader flujoEntrada = new BufferedReader(lector);
			String linea = flujoEntrada.readLine();
			
			while (linea != null) {
				personas.add(linea);
				linea = flujoEntrada.readLine();
			}
			
			flujoEntrada.close();
			lector.close();
			FileWriter escritor = new FileWriter(tarjetas, true);
			BufferedWriter flujoSalida = new BufferedWriter(escritor);
			
			for (String persona : personas) {
				
				String[] parts = persona.split(",");
				flujoSalida.write("Nombre : " + parts[0]);
				flujoSalida.newLine();
				flujoSalida.write("Apellidos : " + parts[1]);
				flujoSalida.newLine();
				flujoSalida.write("Telefono : " + parts[2]);
				flujoSalida.newLine();
				flujoSalida.write("Fecha de nacimiento : " + parts[3]);
				flujoSalida.newLine();
				flujoSalida.newLine();
			
			}
			
			flujoSalida.close();
			escritor.close();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
