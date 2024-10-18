package randomAlgs.Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    public static String encode(List<String> strs) {
        String result = "";
        for (String value : strs) {
            String res = result + value.length() + "#" + value;
            result = res;
            System.out.println(res);
        }
        return result;
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            String val = str.substring(i, i + length);
            result.add(val);
            i += length;
        }


        return result;
    }

    public static void main(String[] args) {
        List<String> code = new ArrayList<>();
        code.add("we");
        code.add("say");
        code.add(":");
        code.add("yes");
        code.add(",");
        code.add("!@#$%^&*()");

        String result = encode(code);
        System.out.println(result);
        List<String> resultList = decode(result);
        for (String str : resultList) {
            System.out.println(str);
        }
    }
}
