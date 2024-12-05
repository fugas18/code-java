/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author 6487
 */
public class UtilClass {

    private void guardaTema(int tema) {
        try {
            PrintWriter writer = new PrintWriter("tema.txt");
            writer.println(tema);
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public int obtemTema(){
        int tema=0;
        
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("tema.txt"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            tema = Integer.parseInt(line);

        }

        return tema;
        
    }

}
