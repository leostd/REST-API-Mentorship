package HeaderChecker;

public interface HeaderCheckerRule<T> {
    void validate(T header);
}