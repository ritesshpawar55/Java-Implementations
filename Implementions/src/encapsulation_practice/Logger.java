package encapsulation_practice;

class Logger {
    private String message;

    public void setMessage(String msg) {
        this.message = msg;
        System.out.println("Logged: " + msg); // action happens here
    }

    public static void main(String[] args) {
        Logger log = new Logger();
        log.setMessage("System started");
    }
}
