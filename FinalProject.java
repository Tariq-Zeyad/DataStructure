package FinalProjectOfDS;

import java.util.Scanner;

public class FinalProject {

    public static Queue<Customer> waitingQueue = new Queue<>();
    public static ArrayBag<User> users = new ArrayBag<>();
    public static AdminBinaryTree serviceTree = new AdminBinaryTree();

    public static String[][] adminReport = new String[100][6];
    public static int reportCount = 0;

    public static void main(String[] args) {

        users.add(new User("Hasan", 123, false, true));
        users.add(new User("Kamal", 123, true, true));
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to JAWWAL,");
            System.out.println("Press Enter to get your waiting ID.");
            System.out.println("If you are a registered employee, enter your user name.");

            String input = sc.nextLine();

            if (input.isEmpty()) {
                Customer customer = new Customer();
                waitingQueue.enqueue(customer);
                System.out.println("Your waiting ID is " + customer.getWaitingId());
            } 
            else {
                User loggedUser = null;

                for (int i = 0; i < users.size(); i++) {
                    User user = users.get(i);
                    if (user.getUsername().equalsIgnoreCase(input)) {
                        System.out.println("Hi " + user.getUsername() + ", now enter your password:");
                        int pw = sc.nextInt();
                        sc.nextLine();
                        if (user.getPassword() == pw && user.isActive()) {
                            loggedUser = user;
                        }
                        break;
                    }
                }

                if (loggedUser == null) {
                    System.out.println("Invalid login!");
                    continue;
                }

                if (loggedUser.isAdmin()) {
                    adminMenu(sc, loggedUser);
                } else {
                    employeeMenu(sc, loggedUser);
                }
            }
        }
    }

    public static void employeeMenu(Scanner key, User emp) {

        while (true) {
            System.out.println("\nWelcome " + emp.getUsername());
            System.out.println("1- Serve the next customer");
            System.out.println("2- Check last served customer");
            System.out.println("3- View all served customers");
            System.out.println("4- View a served customer issue by ID OR Name");
            System.out.println("5- Logout");

            int choice = key.nextInt();
            key.nextLine();

            if (choice == 1) {
                if (waitingQueue.isEmpty()) {
                    System.out.println("No customers in queue.");
                    continue;
                }

                Customer customer = waitingQueue.dequeue();
                System.out.println("Serving customer by  " + customer.getWaitingId());

                System.out.print("Enter customers name: ");
                String name = key.nextLine();
                System.out.print("Enter National ID: ");
                String nid = key.nextLine();
                System.out.print("Enter customer address : ");
                String address = key.nextLine();
                System.out.print("Issue description: ");
                String issue = key.nextLine();
                System.out.print("Is it solved? (1:yes, 0:no): ");
                int solved = key.nextInt();
                key.nextLine();

                customer.setData(name, nid, address, issue, solved == 1, emp.getUsername());
                emp.getServedStack().push(customer);
                emp.addReport(customer);
                serviceTree.insert(emp.getUsername());

                adminReport[reportCount][0] = customer.getWaitingId();
                adminReport[reportCount][1] = name;
                adminReport[reportCount][2] = nid;
                adminReport[reportCount][3] = address;
                adminReport[reportCount][4] = issue;
                adminReport[reportCount][5] = emp.getUsername();
                reportCount++;
            } else if (choice == 2) {
                Customer last = emp.getServedStack().peek();
                if (last == null) {
                    System.out.println("No served customers yet.");
                } else {
                    System.out.println("You served " + last.getName() + " with ID number " + last.getWaitingId());
                    System.out.println(last);
                }
            } else if (choice == 3) {
                System.out.println("You served customers:");
                emp.getServedStack().display();
            } else if (choice == 4) {
                System.out.print("Enter ID or Name: ");
                String x = key.nextLine();
                boolean found = false;

                for (int i = 0; i < reportCount; i++) {
                    if (adminReport[i][0].equalsIgnoreCase(x)
                            || adminReport[i][1].equalsIgnoreCase(x)) {
                        System.out.println(
                                adminReport[i][1] + "\nID: " + adminReport[i][2]
                                + "\nAddress: " + adminReport[i][3]
                                + "\nIssue: " + adminReport[i][4]
                                + "\nServed By: " + adminReport[i][5]);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Customer not found.");
                }
            } else {
                return;
            }
        }
    }

    public static void adminMenu(Scanner key, User admin) {

        while (true) {
            System.out.println("\nWelcome " + admin.getUsername() + ",");
            System.out.println("1- View customers queue");
            System.out.println("2- Check last served customer and by him");
            System.out.println("3- View all customers issues");
            System.out.println("4- Manage employees");
            System.out.println("5- View Customer Service Tree");
            System.out.println("6- Logout");

            int choice = key.nextInt();
            key.nextLine();

            if (choice == 1) {
                waitingQueue.display();
            } else if (choice == 2) {
                if (reportCount == 0) {
                    System.out.println("No served customers yet.");
                } else {
                    System.out.println("Last served customer was "
                            + adminReport[reportCount - 1][1]
                            + ". " + adminReport[reportCount - 1][5] + " served him.");
                }
            } else if (choice == 3) {
                System.out.println("We served " + reportCount + " customers today:");
                for (int i = 0; i < reportCount; i++) {
                    System.out.println(adminReport[i][1] + ", "
                            + adminReport[i][2] + ", "
                            + adminReport[i][3] + ", Served By: "
                            + adminReport[i][5]);
                }
            } else if (choice == 4) {
                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + "- " + users.get(i).getUsername());
                }
                System.out.print("Select employee: ");
                int index = key.nextInt();
                key.nextLine();

                User user = users.get(index - 1);
                System.out.println("1- Disable/Enable user");
                System.out.println("2- Change Name");
                int active = key.nextInt();
                key.nextLine();

                if (active==1) {
                    user.setActive(!user.isActive());
                } else if (active == 2) {
                    System.out.print("Enter new name: ");
                    user.setUsername(key.nextLine());
                }
            } else if (choice == 5) {
                serviceTree.inOrder();
            } else {
                return;
            }
        }
    }
}
