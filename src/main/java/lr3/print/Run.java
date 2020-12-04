package lr3.print;

public class Run {

    public static void main(String[] args) {
        Change change = new Change();
        Console console = change.createConsoleView();

        console.createTypicalUniversity();
    }
}

