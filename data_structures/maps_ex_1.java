import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * java.util.HashMap is unordered.
 * This class makes no guarantees as to the order of the map,
 * in particular, it does not guarantee that the order will remain constant over time.
 *
 * java.util.LinkedHashMap uses insertion-order.
 * This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries.
 * This linked list defines the iteration ordering,
 * which is normally the order in which keys were inserted into the map (insertion-order).
 *
 * java.util.TreeMap, a SortedMap, uses either natural or custom ordering of the keys.
 * The map is sorted according to the natural ordering of its keys,
 * or by a Comparator provided at map creation time, depending on which constructor is used.
 */
public class maps_ex_1
{
    public static void main(String[] args)
    {
        String St; Integer key;
        int t;
        Scanner Sc = new Scanner(System.in);
        Map<String, Integer> my_map = new LinkedHashMap<String, Integer>();
        for (t = Sc.nextInt(); t > 0; --t) {
            St = Sc.next();
            key = my_map.get(St);
            my_map.put(St, (key == null) ? 1 : key + 1);
        }
        System.out.println(my_map.size());
        System.out.println(my_map);
    }
}
