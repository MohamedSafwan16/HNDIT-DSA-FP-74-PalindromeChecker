public class PalindromeChecker {
    public static boolean isPalindrome(String sentence) {
        String cleanedSentence = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanedSentence.length() - 1;
        
        while (left < right) {
            if (cleanedSentence.charAt(left) != cleanedSentence.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String[] testSentences = {"madam"};
        
        for (String sentence : testSentences) {
            System.out.println("Sentence: \"" + sentence + "\"");
            System.out.println("Is Palindrome? " + isPalindrome(sentence));
            System.out.println();
        }
    }
}