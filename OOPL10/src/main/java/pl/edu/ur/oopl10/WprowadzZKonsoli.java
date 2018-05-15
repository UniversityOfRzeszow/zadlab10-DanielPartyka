
package lab10;
import java.util.*;


public class WprowadzZKonsoli {

    
    
    
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
         int tab[] = {1,2,3,4,5};
         int index = -1;
          System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
	  index = p.nextInt();       
   try {
        
       System.out.println("Podaj jakas zmienna: ");
       int zmienna = p.nextInt(); 
       System.out.println("Liczba musi byc typu int");
    } catch (IllegalArgumentException a)
    {
        System.out.println("Typ musi byc typu int");
    
    
    } catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Poprawny rozmiar tablicy to "+tab.length+"Opis bledu "+e);
    }
}
}