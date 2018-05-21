/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie45;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Galan
 */
public class Zapis1 {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
         try { 
          PrintWriter zapis = new PrintWriter("plik.txt");
	  System.out.println("Podaj tekst co chcesz wpisac do pliku, tylko typ string");
          Scanner p = new Scanner(System.in);
          String g = p.nextLine();
          zapis.println("Tekst wpisany do pliku to: "+g);
          zapis.close();
        }  catch (IllegalArgumentException a)
        {
            System.out.println("Do pliku musisz wpisac tekst");
        }
    } 
}
