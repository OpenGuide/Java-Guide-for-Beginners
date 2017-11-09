import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maps_I
{
    public static void main(String[] args)
    {
        Map<Integer, String> my_map = new HashMap<Integer, String>();
        Scanner Sc = new Scanner(System.in);
        int choice;
        String St; int key;
        do {
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    // check
                    key = Sc.nextInt();
                    System.out.println(my_map.containsKey(key));
                    St = Sc.next();
                    System.out.println(my_map.containsValue(St));
                    break;
                case 2:
                    // insert
                    // if key-value pair exists,
                    // then it replaces the existing pair with the new pair !
                    key = Sc.nextInt();
                    St = Sc.next();
                    my_map.put(key, St);
                    break;
                case 3:
                    // get value
                    key = Sc.nextInt();
                    System.out.println(my_map.get(key));
                    break;
                case 4:
                    // size
                    System.out.println(my_map.size());
                    break;
                case 5:
                    // clear the map
                    my_map.clear();
                    break;
                case 6:
                    // remove an element
                    key = Sc.nextInt();
                    System.out.println("Removed :- " + my_map.get(key));
                    my_map.remove(key);
                    break;
                case 7:
                    System.out.println(my_map);
                    System.out.println(my_map.keySet());
                    System.out.println(my_map.entrySet());
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try Again");
            }
        } while (true);
    }
}
