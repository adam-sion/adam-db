package adam.dev.parser.ast.parser.clause;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Keyword {

    SELECT("SELECT", new SelectParser()),

    UPDATE("UPDATE", new UpdateParser()),

    INSERT("INSERT", new InsertParser()),

    DELETE("DELETE", new DeleteParser()),

    CREATE("CREATE", new CreateParser());

    private final String name;

    private final ClauseParser<?> clauseParser;

    public static Keyword fromString(String name) {
    return Arrays.stream(Keyword.values()).filter(keyword -> keyword.getName().equalsIgnoreCase(name))
            .findFirst().orElseThrow(()-> new IllegalArgumentException("Invalid keyword " + name));
    }

}
