
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.*;

public class PersonReader{

    public static void main(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        int fileName = chooser.showOpenDialog(null);

        try {
            if (fileName == JFileChooser.APPROVE_OPTION) {

                File newFile = chooser.getSelectedFile();
                Scanner input = new Scanner(new FileReader(newFile));
                String header = input.nextLine();

                String formatHeader = formatHead(header);
                System.out.print(formatHeader);

                String div = "***********************************************************";
                System.out.println(div);

                ArrayList<Person> ppl = rows(input);

                System.out.println(ppl);
            }

        } catch (FileNotFoundException e) {
            var message = "The file was not found. Error!";
            System.out.println(message);
        }
    }

    public static ArrayList<Person> rows(Scanner input) {
        ArrayList<Person> peopleList = new ArrayList<>();
        try{

            do{
                String people = input.nextLine();
                String[] person = people.split(",");
                Person _person = new Person(person[0],person[1],person[2],person[3],Integer.parseInt(person[4]));
                peopleList.add(_person);

            }while (input.hasNextLine());

        }
        catch (Exception e) {
            System.out.println("Error! Try again.");
            e.printStackTrace();
        }
        return peopleList;
    }

    public static String formatHead (String columnHeader){
        columnHeader = columnHeader.replace("_", "");
        String capitalWord = "";
        String[] values = columnHeader.split(",");

        for (String value: values){
            String firstVal = value.substring(0,1);
            String secVal = value.substring(1);
            capitalWord += firstVal.toUpperCase() + secVal + " ";
        }

        String[] formatted = capitalWord.split(" ");
        String formatHeader = String.format("%-10s %-10s %-10s %-10s\n", formatted[0], formatted[1], formatted[2], formatted[3]);

        return formatHeader;
    }
}
