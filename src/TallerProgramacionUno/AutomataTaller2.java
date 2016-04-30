package TallerProgramacionUno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AutomataTaller2 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String cadena;
        int i = 0;
        boolean accepted = true;
        try {
            bw.write("Automata #2 // Escriba la cadena: ");
            bw.flush();
            cadena = br.readLine();
            while (i < cadena.length() && cadena.charAt(i) == 'a') {
                i++;
            }
            if (i < cadena.length() && cadena.charAt(i) == 'b') {
                i++;
                while (i < cadena.length()) {
                    if (i < cadena.length() && cadena.charAt(i) == 'b') {
                        i++;
                        while (i < cadena.length() && cadena.charAt(i) == 'a') {
                            i++;
                        }
                        if (i < cadena.length() && cadena.charAt(i) == 'b') {
                            i++;
                        } else {
                            accepted = false;
                            break;
                        }
                    } else if (i < cadena.length() && cadena.charAt(i) == 'a') {
                        i++;
                    }
                }
            } else {
                accepted = false;
            }
            if (i < cadena.length()) {
                accepted = false;
            }
            if (accepted) {
                bw.write("Cadena valida");
                bw.flush();
            } else {
                bw.write("Cadena NO valida");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
