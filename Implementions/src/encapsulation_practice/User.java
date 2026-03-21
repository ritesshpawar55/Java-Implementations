package encapsulation_practice;

class User {
    private String password;

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Password too short");
        }
    }

    public static void main(String[] args) {
        User u = new User();
        u.setPassword("123");        // invalid
        u.setPassword("strongPass"); // valid
    }
}
