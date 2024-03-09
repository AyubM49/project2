import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            ArrayList<Task> myTasks = new ArrayList<>();
            String choice = "";

            while (!(choice.equals("0"))) {
                System.out.println("\nPlease choose an option:\n" + "(1) Add a task.\n" + "(2) Remove a task.\n" + "(3) Update a task.\n" + "(4) List all the tasks.\n" +
                        "(5)\n" +
                        "(0) Exit.");
                choice = input.nextLine();

                if (choice.equals("1")) {
                    System.out.println("what task do you want to add?");
                    String taskName = input.nextLine();
                    System.out.println(("Can you give me a description of the task"));
                    String taskDescription = input.nextLine();
                    System.out.println("What is the priority for the task");
                    int priorityOfTask = input.nextInt();
                    input.nextLine();

                    Task newTask = new Task(taskName, taskDescription, priorityOfTask);
                    myTasks.add(newTask);

                } else if (choice.equals("2")) {
                    System.out.println("which task do you want to remove? ");
                    System.out.println(myTasks);
                    String removeTask = input.nextLine();
                    myTasks.remove(Integer.parseInt(removeTask));
                } else if (choice.equals("3")) {
                    System.out.println("which task would you like to update? ");
                    System.out.println(myTasks);
                    String removeTask = input.nextLine();
                    myTasks.remove(Integer.parseInt(removeTask));

                    System.out.println("What's the name of the new task? ");
                    String taskName = input.nextLine();
                    System.out.println(("What's the description of this new task? "));
                    String taskDescription = input.nextLine();
                    System.out.println("What's the priority of this new task?");
                    int priorityOfTask = input.nextInt();
                    input.nextLine();

                    Task newTask = new Task(taskName, taskDescription, priorityOfTask);
                    myTasks.add(newTask);

                } else if (choice.equals("4")) {
                    System.out.println(myTasks);
                } else if (choice.equals("5")) {
                    System.out.println("Which priority would you like? ");
                    int choice3 = input.nextInt();

                    for (int i = 0; i < myTasks.size(); i++) {
                        if (myTasks.get(i).getPriority() == choice3){
                            System.out.println(myTasks.get(i));
                        }
                    }
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("WRONGGGGGG TRY AGAIN!!!!!.");
        }
    }
}




