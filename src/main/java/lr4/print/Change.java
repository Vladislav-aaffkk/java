package lr4.print;

class Change implements IConsole {

    @Override
    public Console createConsoleView() {
        return new Vies();
    }
}