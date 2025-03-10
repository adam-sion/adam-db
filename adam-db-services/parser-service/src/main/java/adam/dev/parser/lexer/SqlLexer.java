package adam.dev.parser.lexer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class SqlLexer {

    private final Pattern TOKEN_PATTERN = Pattern.compile(Token.getCombinedTokens());

    public List<String> tokenize(String input) {
        List<String> tokens = new ArrayList<>();
        Matcher matcher = TOKEN_PATTERN.matcher(input);

        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        return tokens;
    }

}
