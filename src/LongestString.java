import java.util.*;
import java.util.stream.Collectors;

public class LongestString {

    public static void main(String[] args) {

        Integer test = lengthOfLongestSubstring("bbbbbb");
        System.out.println(test);

        Integer test1 = lengthOfLongestSubstring("pwwkew");
        System.out.println(test1);
    }

    public static int lengthOfLongestSubstring(String s) {

        List<Character> charList = s.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
        int numChar = s.length();
        int j =0;
        List<Integer> counter = new ArrayList<>();
        while (j < numChar) {
            Integer result = 0;

            Map<Character, Integer> count = new HashMap<>();
            int ext = extracted(charList, result, counter, count);
            j++;
            charList = charList.subList(1,charList.size());


        }
        return Collections.max(counter);
    }

    private static int  extracted(List<Character> charList, Integer result, List<Integer> counter, Map<Character, Integer> count) {
        for ( Character c : charList){

            if (count.containsKey(c)){

                counter.add(result);
                break;
            }
            else {
                count.put(c,1);
                result++;
            }
        }
        return result;
    }
}
