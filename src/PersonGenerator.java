import java.util.Scanner;

public class PersonGenerator {

    public static void main(String[] args) {

        String ID;
        String firstName;
        String lastName;
        String title;
        int YOB;
        String trash;

        Scanner in = new Scanner(System.in);
        Scanner inTwo = new Scanner(System.in);
        do {

            System.out.println("Enter your ID: ");
            ID = in.nextLine();

            System.out.println("Enter your first name: ");
            firstName = in.nextLine();

            System.out.println("Enter your last name: ");
            lastName = in.nextLine();

            System.out.println("Enter your title (Mr, Mrs, Ms, Miss, etc): ");
            title = in.nextLine();

            System.out.println("Enter YOB: ");
            YOB = in.nextInt();

            int age = Person.getAge(YOB);

            Person examplePerson = new Person(ID, firstName, lastName, title, YOB);

            System.out.println(examplePerson.toCSVDataRecord());

            trash = in.nextLine();

        } while(SafeInput.getYNConfirm(inTwo, "Would you like to enter another person?")==true);

    }
}
