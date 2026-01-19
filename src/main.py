class Main:
    @staticmethod
    def main():
        a = 100
        b = 0
        result = a / b  # ZeroDivisionError (same as Java ArithmeticException)

        input_value = None
        print(len(input_value))  # TypeError (similar to NullPointerException)

        user_role = "ADMIN"
        if user_role == "ADMIN":  # In Python, this usually works, but == is correct
            print("Admin access granted")

        Main.print_user(None)

        Main.insecure_password_check("admin", "password123")

    @staticmethod
    def print_user(user):
        print(user.lower())  # AttributeError if user is None

    @staticmethod
    def insecure_password_check(username, password):
        if username == "admin" and password == "password123":
            return True
        return False


if __name__ == "__main__":
    Main.main()

