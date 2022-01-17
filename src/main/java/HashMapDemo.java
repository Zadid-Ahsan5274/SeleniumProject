import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        // HashMap contains data as Key-Value pairs.
        // Contains only unique keys
        // Not synchronized and No order
        // Java HashMap may have one null key and multiple null values

        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("qa", "http://qa.com");
        hm1.put("uat", "http://uat.com");
        hm1.put("preprod", "http://preprod.com");
        hm1.put("prod", "http://prod.com");
        System.out.println(hm1);
        hm1.remove("qa");
        System.out.println(hm1);
        hm1.remove("uat","test");
        System.out.println(hm1);

       // Set s = hm1.keySet();

        for(String key : hm1.keySet()){
            System.out.println("Key is : "+key+" Value is "+hm1.get(key));
        }

        Set s = hm1.keySet();
        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            String key = itr.next();
            System.out.println("Key is : "+key+" Value is "+hm1.get(key));
        }
    }

}
