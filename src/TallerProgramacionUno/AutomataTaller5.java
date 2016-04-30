package TallerProgramacionUno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AutomataTaller5 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String cadena;
        int i = 0;
        boolean accepted = true;
        try {
            bw.write("Automata #5 // Escriba la cadena: ");
            bw.flush();
            cadena = br.readLine();
            if (i < cadena.length() && cadena.charAt(i) == 'b') {
                i++;
                while (i < cadena.length() && cadena.charAt(i) == 'b') {
                    i++;
                }
                if (i < cadena.length() && cadena.charAt(i) == 'a') {
                    i++;
                    while (i < cadena.length() && cadena.charAt(i) == 'a') {
                        i++;
                    }
                } else {
                    accepted = false;
                }
            } else {
                accepted = false;
            }
            while (i < cadena.length()) {
                if (i < cadena.length() && cadena.charAt(i) == 'b') {
                    i++;
                    while (i < cadena.length() && cadena.charAt(i) == 'b') {
                        i++;
                    }
                    if (i < cadena.length() && cadena.charAt(i) == 'a') {
                        i++;
                        while (i < cadena.length() && cadena.charAt(i) == 'a') {
                            i++;
                        }
                    } else {
                        accepted = false;
                    }
                } else {
                    accepted = false;
                    break;
                }
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
