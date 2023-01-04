import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConversionChallenge {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    String salary1 = JOptionPane
        .showInputDialog("Enter your first salary: ")
        .replace(",", ".");

    String salary2 = JOptionPane
        .showInputDialog("Enter your second salary: ")
        .replace(",", ".");
    ;
    String salary3 = JOptionPane
        .showInputDialog("Enter your third salary: ")
        .replace(",", ".");
    ;

    Double averageSalary = (Double.parseDouble(salary1) + Double.parseDouble(salary2) + Double.parseDouble(salary3))
        / 3;

    System.out.println("Your first salary is: " + salary1);
    System.out.println("Your second salary is: " + salary2);
    System.out.println("Your third salary is: " + salary3);

    System.out.println("Your average salary is: " + averageSalary);

    input.close();
  }
}
