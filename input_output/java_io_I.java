import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class java_io_I
{
  public static void main(String[] args)throws IOException
    // throw the Exception class object for input-output exceptions ie. IOException
  {
    InputStreamReader Isr = new InputStreamReader (System.in);
    BufferedReader Br = new BufferedReader (Isr);
    
    // all inputs are taken as Strings
    // also the entire line is taken as input
    // Now just parse the String into whichever data type required.
    
    String input;
    int input_i;
    long input_l;
    float input_f;
    double input_d;
    char input_c;
    
    input = Br.readLine(); // Taking input as a String
    System.out.println(input); // String Input
    
    input = Br.readLine(); // Taking input as a String
    input_i = Integer.parseInt (input); // parsing input
    System.out.println(input_i);
    
    input = Br.readLine(); // Taking input as a String
    input_l = Long.parseLong (input); // parsing input
    System.out.println(input_l);
    
    input = Br.readLine(); // Taking input as a String
    input_f = Float.parseFloat (input); // parsing input
    System.out.println(input_f);
    
    input = Br.readLine(); // Taking input as a String
    input_d = Double.parseDouble (input); // parsing input
    System.out.println(input_d);
    
    input_c = (char) Br.read(); // Taking input as a character
    Br = new BufferedReader (Isr); // flush the junk characters (of newline or carriage return) from the input buffer
    System.out.println(input_c);
  }
}
