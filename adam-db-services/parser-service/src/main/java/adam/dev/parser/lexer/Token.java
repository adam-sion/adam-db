package adam.dev.parser.lexer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public enum Token {

    IDENTIFIER("[a-zA-Z_][a-zA-Z0-9_]*"),

    NUMBER("\\b\\d+(\\.\\d+)?\\b"),

    STRING("'([^']*)'"),

    OPERATOR("[=<>!]+"),

    SYMBOL("[,;().*]");

    private final String value;

    public static String getCombinedTokens() {
       return Arrays.stream(values())
                .map(Token::getValue)
                .collect(Collectors.joining("|"));
    }

}
