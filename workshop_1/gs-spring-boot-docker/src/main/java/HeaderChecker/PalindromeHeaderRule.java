package HeaderChecker;

public class PalindromeHeaderRule implements HeaderCheckerRule<String>{
    @Override
    public void validate(String header) {
        int leftIndex, rightIndex;
        leftIndex = 0;
        rightIndex = header.length() - 1;
        while (leftIndex < rightIndex){
            if (header.charAt(leftIndex) != header.charAt(rightIndex)){
                throw new IllegalArgumentException("Header must be palindrome.");
            }
            else{
                leftIndex++;
                rightIndex--;
            }
        }
    }
}