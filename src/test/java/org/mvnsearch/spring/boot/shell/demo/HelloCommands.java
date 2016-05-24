package org.mvnsearch.spring.boot.shell.demo;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.stereotype.Component;

/**
 * hello commands
 * @author linux_china
 */
@Component
public class HelloCommands implements CommandMarker {
    @CliCommand(value = "hello", help = "CMS ")
    public String hello() {
        return "hello";
    }
}
