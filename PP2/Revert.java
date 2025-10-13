package PP2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Revert {

    public static void main(String[] args) {
        MyStackCharacter stack = new MyStackCharacter();
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int c;
            while ((c = reader.read()) != -1) {
                stack.push((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de entrada: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            while (!stack.empty()) {
                writer.write(stack.pop());
            }
            System.out.println("El archivo ha sido invertido correctamente y guardado como " + outputFile);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de salida: " + e.getMessage());
        }
    }
}
    

