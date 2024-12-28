package internship.org.dayfive;

public class StringSubSequence {
    public static boolean isSubSequence(String subString, String source) {
        int sizeSub = subString.length();
        int sizeSource = source.length();
        int indexSub = 0; // For index of A
        // Traverse B and A, and compare current characters of B and A.
        // If current character of B matches with current character of A, move ahead in A.
        for (int indexSource = 0; indexSource < sizeSource && indexSub < sizeSub; indexSource++) {
            if (subString.charAt(indexSub) == source.charAt(indexSource)) {
                indexSub++;
            }
        }
        // If all characters of A were found in B in order
        return (indexSub == sizeSub);
    }

    public static void main(String[] args) {
        String phrase = "AXY";
        String source = "YADXCP";
        System.out.println(isSubSequence(phrase, source) ? 1 : 0);

        phrase = "gksrek";
        source = "geeksforgeeks";
        System.out.println(isSubSequence(phrase, source) ? 1 : 0);

        phrase = "ztc";
        source = "zealoustechcorp";
        System.out.println(isSubSequence(phrase, source) ? 1 : 0);

        phrase = "zact";
        source = "zealoustechcorp";
        System.out.println(isSubSequence(phrase, source) ? 1 : 0);
    }

}
