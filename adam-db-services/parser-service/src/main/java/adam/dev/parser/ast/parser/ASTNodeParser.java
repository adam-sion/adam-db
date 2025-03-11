package adam.dev.parser.ast.parser;

import adam.dev.parser.ast.ASTNode;
import adam.dev.parser.ast.parser.clause.ClauseParserVisitor;
import adam.dev.parser.ast.parser.clause.Keyword;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ASTNodeParser {

    private final ClauseParserVisitor visitor;

    public ASTNode parse(List<String> tokens) {
        ASTNode astNode = Keyword.fromString(tokens.get(0)).getAccept()
                .apply(visitor, tokens);

        return astNode;
    }

}
