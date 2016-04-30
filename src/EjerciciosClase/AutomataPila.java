package EjerciciosClase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class AutomataPila {

	public static void main(String args[]) {

		String[][] tablaDeTransiciones = {
				// Simbolo
				{ "a", "b", "a", "b", "b", "" },
				// Estado Actual
				{ "q0", "q1", "q1", "q2", "q3", "q3" },
				// Estado siguiente
				{ "q1", "q1", "q2", "q3", "q3", "q4" },
				// Tope actual
				{ "Z0", "A", "A", "A", "A", "Z0" },
				// Tope pila
				{ "AAZ0", "AAA", "", "", "", "Z0" } };

		// El estado actual siempre sera q0
		String estadoActual = "q0";

		// El estado actual siempre sera q0
		String simboloActual = "";

		// Se crea la pila
		Stack<String> pila = new Stack<String>();

		// Se inicializa la pila con Z0
		pila.push("Z0");

		boolean aceptada = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			bw.write("Automata de Pila #1 // Escriba la cadena: ");
            bw.flush();
			String cadena = br.readLine();

			for (int i = 0; i < cadena.length(); i++) {

				String tope = pila.pop();
				pila.push(tope);
				simboloActual = cadena.charAt(i) + "";
				for (int j = 0; j < tablaDeTransiciones.length; j++) {

					if (estadoActual.equals(tablaDeTransiciones[1][j])) {

						if (simboloActual.equals(tablaDeTransiciones[0][j])) {

							if (tope.equals(tablaDeTransiciones[3][j])) {

								estadoActual = tablaDeTransiciones[2][j];
								pila.push(tablaDeTransiciones[4][j]);
								break;
							}
						}
					}
					
					if (j >= tablaDeTransiciones.length) {
						break;
					}
				}

			}

			if (pila.pop().equals("Z0")) {
				aceptada = true;
			}

			if (aceptada) {
				bw.write("Cadena aceptada");
			} else {
				bw.write("Cadena rechazada");
			}
			bw.flush();

		} catch (IOException e) {
		}

	}
}
