package main.aplication;

import main.entities.Task;
import main.resources.Database;
import picocli.CommandLine;

import java.util.ArrayList;

public class RemoveTask implements Runnable {
    @CommandLine.Parameters(index = "0")
    private static int id;

    public static void main(String[] args) {
        new CommandLine(new RemoveTask()).execute(args);
    }

    @Override
    public void run() {
        Database.deleteTask(id);
    }
}
