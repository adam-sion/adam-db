package adam.dev.parser.io;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@NoArgsConstructor
public class CmdIOHandler {

    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        return scanner.nextLine();
    }

    public void print(String message) {
        System.out.println(message);
    }

}
