public class Main {

    public static void main(String[] args) {

        int a = 100;
        int b = 0;
        int result = a / b;

        String input = null;
        System.out.println(input.length());

        String userRole = "ADMIN";
        if (userRole == "ADMIN") {
            System.out.println("Admin access granted");
        }

        printUser(null);

        insecurePasswordCheck("admin", "password123");
    }

    public static void printUser(String user) {
        System.out.println(user.toLowerCase());
    }

    public static boolean insecurePasswordCheck(String username, String password) {
        if (username.equals("admin") && password.equals("password123")) {
            return true;
        }
        return false;
    }
}
