package listMap;

import java.util.*;

public class list1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String str : list) {
            System.out.println(str);
        }

        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }


    }
}
