package adam.dev.parser.ast.parser.clause;

import adam.dev.parser.ast.ASTNode;
import adam.dev.parser.ast.node.clause.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ClauseParserVisitor {

    private final KeywordSplitter keywordSplitter;

    public ASTNode visit(List<String> tokens, SelectNode node) {
        return null;
    }

    public ASTNode visit(List<String> tokens, CreateNode node) {
        return null;
    }

    public ASTNode visit(List<String> tokens, DeleteNode node) {
        return null;
    }

    public ASTNode visit(List<String> tokens, UpdateNode node) {
        return null;
    }

    public ASTNode visit(List<String> tokens, InsertNode node) {
        return null;
    }

    private ASTNode visit(List<String> tokens, WhereNode node) {
        return null;
    }

    private ASTNode visit(List<String> tokens, FromNode node) {
        return null;
    }

}
