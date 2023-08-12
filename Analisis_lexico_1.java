/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisis_lexico_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Analisis_lexico_1 {

    
    
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Central\\USPG\\VI Semestre\\Compiladores\\prubatokens.txt"));
            String line;
            List<String> keywords = Arrays.asList("while", "if", "return", "cout", "cin");
            List<String> operators = Arrays.asList("*", "+", "-", "/", "%");
            List<String> logicalOperators = Arrays.asList("&&", "||", ">", "<", "==", "<>");
            List<String> specialSymbols = Arrays.asList("(", ")", "[", "]", "{", "}");

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("[\\s;(){}\\[\\]]+");

                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        System.out.print("Token: " + token + " -> ");

                        if (keywords.contains(token)) {
                            System.out.println("Keyword");
                        } else if (operators.contains(token)) {
                            System.out.println("Operator");
                        } else if (logicalOperators.contains(token)) {
                            System.out.println("Logical Operator");
                        } else if (specialSymbols.contains(token)) {
                            System.out.println("Special Symbol");
                        } else {
                            if (Character.isLetter(token.charAt(0)) || token.charAt(0) == '_') {
                                System.out.println("Identifier");
                            } else {
                                System.out.println("Unknown Token");
                            }
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
