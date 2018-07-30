package HeaderChecker;

public class NotEmptyHeaderRule implements HeaderCheckerRule<String>{
    @Override
    public void validate(String header) {
        if (header.isEmpty()){
            throw new IllegalArgumentException("Header can't be empty.");
        }
    }
}