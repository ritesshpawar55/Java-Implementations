package encapsulation_practice;

class Config {
    private String data;

    public String getData() {
        if (data == null) {
            data = "Loaded from file"; // initialized only when needed
        }
        return data;
    }

    public static void main(String[] args) {
        Config c = new Config();

        System.out.println(c.getData()); // first call
        System.out.println(c.getData()); // reused
    }
}
