package adam.dev.parser.runner;

import adam.dev.parser.io.CmdIOHandler;
import adam.dev.parser.lexer.SqlLexer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ParserRunner implements CommandLineRunner {

    private final CmdIOHandler ioHandler;

    private final SqlLexer lexer;

    @Override
    public void run(String... args) {
        ioHandler.print("enter your sql query:");
        String input = ioHandler.getInput();
        List<String> sqlTokens = lexer.tokenize(input);
        System.out.println(sqlTokens);

        //end
        System.exit(0);
    }

}
