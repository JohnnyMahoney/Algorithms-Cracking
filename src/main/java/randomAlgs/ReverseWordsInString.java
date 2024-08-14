package randomAlgs;

public class ReverseWordsInString {
    public static String reverseWords(String sentence) {

        StringBuilder reverse = new StringBuilder();
        reverse.append(sentence);
        reverse.reverse();
        sentence = String.valueOf(reverse);
        sentence = sentence.trim().replaceAll("\\s+", " ");
        System.out.println(sentence);

        char[] charArray = sentence.toCharArray();

        int start = 0;
        int end = 0;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == ' ' || i == charArray.length - 1) {
                end = (i == charArray.length - 1) ? i : i - 1;
                while (start < end) {
                    char sym = charArray[start];
                    charArray[start] = charArray[end];
                    charArray[end] = sym;
                    start++;
                    end--;
                }
                start = i + 1;
            }

        }
        String sentenceBack = new String(charArray);
        return sentenceBack;
    }

    public static void main(String[] args) {

        String toReverse = "Hello World";
        System.out.println(reverseWords(toReverse));
    }
}
