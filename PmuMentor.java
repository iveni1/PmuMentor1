import java.util.Scanner;

public class PmuMentor {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the User Management System");
            System.out.println("--------------------------------------");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Update Profile");
            System.out.println("4. Delete Account");
            System.out.println("5. View All Users");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Create Account");
                    System.out.println("----------------");
                    System.out.print("Enter Username: ");
                    String newUsername = scanner.next();
                    System.out.print("Enter Password: ");
                    String newPassword = scanner.next();
                    System.out.print("Enter Email: ");
                    String newEmail = scanner.next();
                    userService.createUser(newUsername, newPassword, newEmail);
                    System.out.println("Account created successfully!");
                }
                case 2 -> {
                    System.out.println("Login");
                    System.out.println("-----");
                    System.out.print("Enter Username: ");
                    String username = scanner.next();
                    System.out.print("Enter Password: ");
                    String password = scanner.next();
                    if (userService.login(username, password)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid credentials. Please try again.");
                    }
                }
                case 3 -> {
                    System.out.println("Update Profile");
                    System.out.println("--------------");
                    System.out.print("Enter Username: ");
                    String userToUpdate = scanner.next();
                    System.out.print("Enter New Email: ");
                    String newEmailUpdate = scanner.next();
                    userService.updateProfile(userToUpdate, newEmailUpdate);
                    System.out.println("Profile updated successfully!");
                }
                case 4 -> {
                    System.out.println("Delete Account");
                    System.out.println("--------------");
                    System.out.print("Enter Username to delete: ");
                    String userToDelete = scanner.next();
                    userService.deleteUser(userToDelete);
                    System.out.println("Account deleted successfully!");
                }
                case 5 -> {
                    System.out.println("View All Users");
                    System.out.println("--------------");
                    userService.getAllUsers().forEach(System.out::println);
                }
                case 6 -> {
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
