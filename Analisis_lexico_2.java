/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisis_lexico_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Analisis_lexico_2 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Central\\USPG\\VI Semestre\\Compiladores\\pruebatokens_2.txt"));
            String line;
            List<String> NUMERO_DECIMAL = Arrays.asList("4.456", "6.879");
            List<String> SIGO_MULTIPLICACION = Arrays.asList("*");
            List<String> PARENTESIS_IZQ = Arrays.asList("(");
            List<String> NUMERO_ENTERO = Arrays.asList("5");
            List<String> SIGO_SUMA = Arrays.asList("+");

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("[\\s;(){}\\[\\]]+");

                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        System.out.print("Token: " + token + " -> ");

                        if (NUMERO_DECIMAL.contains(token)) {
                            System.out.println("NUMERO_DECIMAL");
                        } else if (SIGO_MULTIPLICACION.contains(token)) {
                            System.out.println("SIGO_MULTIPLICACION");
                        } else if (PARENTESIS_IZQ.contains(token)) {
                            System.out.println("PARENTESIS_IZQ");
                        } else if (NUMERO_ENTERO.contains(token)) {
                            System.out.println("NUMERO_ENTERO");
                        } else {
                            System.out.println("Token Desconocido");
                        }
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
