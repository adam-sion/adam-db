package adam.dev.parser.ast.parser.clause;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class KeywordSplitter {

    private final int INDEX_NOT_FOUND = -1;

    private Optional<List<String>> getTokensBetweenKeyWords(List<String> tokens, String firstKeyword, String secondKeyword) {
        int firstKeywordIndex = tokens.indexOf(firstKeyword);
        int secondKeywordIndex = tokens.indexOf(secondKeyword);
        boolean doReturnTokens = firstKeywordIndex != INDEX_NOT_FOUND && secondKeywordIndex != INDEX_NOT_FOUND
                && firstKeywordIndex < secondKeywordIndex;

        return doReturnTokens ? Optional.of(tokens.subList(firstKeywordIndex + 1, secondKeywordIndex - 1))
                : Optional.empty();
    }

    private Optional<List<String>> getTokensAfterKeyword(List<String> tokens, String keyword) {
        int keywordIndex = tokens.indexOf(keyword);
        boolean doReturnTokens = keywordIndex != INDEX_NOT_FOUND;

        return doReturnTokens ? Optional.of(tokens.subList(keywordIndex + 1, tokens.size()))
                : Optional.empty();
    }

    private int indexOfIgnoreCase(List<String> tokens, String keyword) {
        return tokens.stream()
                .map(String::toLowerCase)
                .toList()
                .indexOf(keyword.toLowerCase());
    }

}
