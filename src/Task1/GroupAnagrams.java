package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] num = strs[i].toCharArray();
            Arrays.sort(num);

            String str = Arrays.toString(num);
            if (hashMap.containsKey(str)){
                hashMap.get(str).add(strs[i]);
            }else {
                hashMap.put(str,new ArrayList<>());
                hashMap.get(str).add(strs[i]);
            }

        }
        for (String item : hashMap.keySet()){
            list.add(hashMap.get(item));

        }
        return list;
    }
}
