import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buff {

    public static void main(String[] args)
        throws IOException{
            
    
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

            System.out.print("Enter an integer: ");

        int number = Integer.parseInt(reader.readLine());

        System.out.println("You entered: " + number);
    }
}