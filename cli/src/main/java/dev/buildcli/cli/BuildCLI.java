package dev.buildcli.cli;

import dev.buildcli.cli.commands.AboutCommand;
import dev.buildcli.cli.commands.AutocompleteCommand;
import dev.buildcli.cli.commands.ChangelogCommand;
import dev.buildcli.cli.commands.ConfigCommand;
import dev.buildcli.cli.commands.DoctorCommand;
import dev.buildcli.cli.commands.ProjectCommand;
import dev.buildcli.cli.commands.RunCommand;
import dev.buildcli.cli.commands.VersionCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "buildcli", mixinStandardHelpOptions = true,
    version = "BuildCLI 0.0.14",
    description = "BuildCLI - A CLI for Java Project Management",
    subcommands = {
        AboutCommand.class, AutocompleteCommand.class, ChangelogCommand.class, ConfigCommand.class,
        DoctorCommand.class, ProjectCommand.class, RunCommand.class, VersionCommand.class, CommandLine.HelpCommand.class,
    }
)
public class BuildCLI {

}
