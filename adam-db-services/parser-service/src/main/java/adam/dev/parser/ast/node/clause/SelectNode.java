package adam.dev.parser.ast.node.clause;

import adam.dev.parser.ast.ASTNode;
import adam.dev.parser.ast.node.schema.Column;

import java.util.List;

public class SelectNode extends ASTNode {

    private List<Column> columns;

    private FromNode from;

}
