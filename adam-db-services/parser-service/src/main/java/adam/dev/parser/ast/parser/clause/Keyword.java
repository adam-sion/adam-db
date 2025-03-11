package adam.dev.parser.ast.parser.clause;

import adam.dev.parser.ast.ASTNode;
import adam.dev.parser.ast.node.clause.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

@AllArgsConstructor
@Getter
public enum Keyword {

    SELECT("SELECT", (visitor, tokens)-> visitor.visit(tokens, new SelectNode())),

    UPDATE("UPDATE", (visitor, tokens)-> visitor.visit(tokens, new UpdateNode())),

    INSERT("INSERT", (visitor, tokens)-> visitor.visit(tokens, new InsertNode())),

    DELETE("DELETE", (visitor, tokens)-> visitor.visit(tokens, new DeleteNode())),

    CREATE("CREATE", (visitor, tokens)-> visitor.visit(tokens, new CreateNode()));

    private final String name;

    public final BiFunction<ClauseParserVisitor, List<String>, ASTNode> accept;

    public static Keyword fromString(String name) {
    return Arrays.stream(Keyword.values()).filter(keyword -> keyword.getName().equalsIgnoreCase(name))
            .findFirst().orElseThrow(()-> new IllegalArgumentException("Invalid keyword " + name));
    }

}
