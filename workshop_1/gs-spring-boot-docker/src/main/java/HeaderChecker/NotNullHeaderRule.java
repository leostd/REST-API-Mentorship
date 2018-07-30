package HeaderChecker;

public class NotNullHeaderRule implements HeaderCheckerRule<String>{
    @Override
    public void validate(String header) {
        if (header == null){
            throw new IllegalArgumentException("Header must be not null.");
        }
    }
}