package day423;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber {
    static HashMap<Integer,String> mapKey = new HashMap<>();
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        mapKey.put(0,"");
        mapKey.put(1,"");
        mapKey.put(2,"abc");
        mapKey.put(3,"def");
        mapKey.put(4,"jhi");
        mapKey.put(5,"jkl");
        mapKey.put(6,"mno");
        mapKey.put(7,"pqrs");
        mapKey.put(8,"tuv");
        mapKey.put(9,"wxyz");
        String input = "23";
        helper(input,0,new StringBuilder());
        System.out.println(result.toString());


    }

    private static void helper(String input, int index, StringBuilder path) {
        if(path.length() == input.length()) {
            result.add(path.toString());
            return;
        }

        int num = input.charAt(index) - '0';
        String letters = mapKey.get(num);

        for (int i = 0; i < letters.length(); i ++){
            path.append(letters.charAt(i));
            helper(input, index + 1, path);
            path.deleteCharAt(path.length() -1);
        }
    }


}
