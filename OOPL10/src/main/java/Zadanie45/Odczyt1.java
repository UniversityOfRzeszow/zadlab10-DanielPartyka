
package Zadanie45;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Galan
 */
public class Odczyt1 {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("zzz.txt");
        BufferedReader br = new BufferedReader(fr);
        String[] stringRead = new String[10000];
        int i=0;
        while (stringRead != null) {
            stringRead[i] = br.readLine();
            i++;
        }
        br.close();
    }
    
}
