package adam.dev.parser.ast.parser;

import adam.dev.parser.ast.ASTNode;
import adam.dev.parser.ast.parser.clause.ClauseParser;
import adam.dev.parser.ast.parser.clause.Keyword;

import java.util.List;

public class ASTNodeParser {

    public ASTNode parse(List<String> tokens) {
        ClauseParser<?> parser = Keyword.fromString(tokens.get(0)).getClauseParser();
        ASTNode astNode = parser.parse(tokens.subList(1, tokens.size()));

        return astNode;
    }

}
