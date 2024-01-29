import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> title = new ArrayList<>();
    static ArrayList<String> description = new ArrayList<>();
    static ArrayList<String> time = new ArrayList<>();

    public static void Create() {

        System.out.println("Enter The Title:");
        String Title = input.nextLine();
        System.out.println("Enter The Description:");
        String Description = input.nextLine();
        System.out.println("Enter The Time:");
        String Time = input.nextLine();

        //added to Array.
        title.add(Title);
        description.add(Description);
        time.add(Time);
        System.out.println("Task added successfully.");
    }

    public static void Read() {
        for (int i = 0; i < title.size(); i++) {
            System.out.println("Title:\n" + title.get(i) + "\nDescription\n" + description.get(i) + "\nTime\n" + time.get(i));
        }
    }

    public static void Update() {

        System.out.println("Enter The id:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter The Title:");
        String Title = input.nextLine();
        System.out.println("Enter The Description:");
        String Description = input.nextLine();
        System.out.println("Enter The Time:");
        String Time = input.nextLine();

        //Update to Array.
        title.set(id, Title);
        description.set(id, Description);
        time.set(id, Time);
        System.out.println("Task updated successfully.");

    }


    public static void Delete() {
        System.out.println("Enter The id:");
        int id = input.nextInt();
        title.remove(id);
        description.remove(id);
        time.remove(id);
        System.out.println("Task deleted successfully.");
    }

    static void mainMenu() {
        System.out.println("\t---- Todo List ------\n");
        System.out.println("1- Create Todo");
        System.out.println("2- Update Todo");
        System.out.println("3- Delete Todo");
        System.out.println("4- Display Todo");
        System.out.println("5- Exit Todo");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        while (true) {
            mainMenu();
            char choice = input.nextLine().charAt(0);
            switch (choice) {

                case '1':
                    Create();
                    break;

                case '2':
                    Update();
                    break;
                case '3':
                    Delete();
                    break;
                case '4':
                    Read();
                    break;
                case '5':
            System.exit(-1);
                    break;
                default:
                    System.out.println("wring input!");
                    break;
            }
        }

    }
}