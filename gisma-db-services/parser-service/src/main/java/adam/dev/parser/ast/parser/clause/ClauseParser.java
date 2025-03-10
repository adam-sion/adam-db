package adam.dev.parser.ast.parser.clause;

import adam.dev.parser.ast.ASTNode;

import java.util.List;

public interface ClauseParser<T extends ASTNode> {

    T parse(List<String> tokens);

}
