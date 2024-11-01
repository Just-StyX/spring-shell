package jsl.group.spring_shell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ProfileShellCommands {
    @ShellMethod("Display required space")
    public long minimumFreeSpace() {
        return 1_000_000;
    }

    @ShellMethod("Convert to lower case")
    public String convertToLowerCase(String expression) {
        return expression.toLowerCase();
    }
}
