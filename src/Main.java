public class Main {

    public static void main(String[] args) {
        int divisionResult = divide(100, 10);
        printDivisionResult(divisionResult);

        String input = "Hello World";
        printInputLength(input);

        String userRole = "ADMIN";
        checkAdminAccess(userRole);

        printUser("JohnDoe");

        boolean login = insecurePasswordCheck("admin", "password123");
        printLoginStatus(login);
    }

    // New public methods
    public static int divide(int a, int b) {
        return a / b; // safe division
    }

    public static void printDivisionResult(int result) {
        System.out.println("Division result: " + result);
    }

    public static void printInputLength(String input) {
        if (input != null) {
            System.out.println("Input length: " + input.length());
        } else {
            System.out.println("Input is null");
        }
    }

    public static void checkAdminAccess(String role) {
        if ("ADMIN".equals(role)) {
            System.out.println("Admin access granted");
        }
    }

    public static void printUser(String user) {
        if (user != null) {
            System.out.println("User: " + user.toLowerCase());
        } else {
            System.out.println("User is null");
        }
    }

    public static boolean insecurePasswordCheck(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }

    public static void printLoginStatus(boolean login) {
        if (login) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
