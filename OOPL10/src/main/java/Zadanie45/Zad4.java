/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie45;
import java.util.*;
/**
 *
 * @author Galan
 */
public class Zad4 {
   
    public static void main(String[] args)
    {
       
        try{ 
        int n;
            
        Random r = new Random(11);
        int[] tab = new int[1000000];
        int[] tab1 = new int[1000000];
        for (int i=0;i<tab.length;i++)
        {
            for (int j=0;j<tab1.length;j++)
            {
                tab[i] = r.nextInt();
                tab[j] = r.nextInt();
                double podziel = tab[i]/tab[j];
                System.out.println("Nie mozna dzielic przez 0");
            }
        }
            
    }   catch (ArithmeticException e)
{
    System.out.println("Nie mozna dzielic przez 0");
    int n=0;
    n++;
}

}
}
    