import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Family famInsurance = new Family(4, 28, false, "Lviv", 6000, PropertyType.House);
        Corporate corpInsurance = new Corporate("SoftServe", 12, false, "Lviv", 1000000, PropertyType.Fire);
        Personal persInsurance = new Personal(false, 45, true, "Rivne", 12000, PropertyType.Life);
        Personal myInsurance = new Personal(false, 45, true, "Rivne", 1200, PropertyType.Life);
        Corporate mycorpInsurance = new Corporate("Epam", 15, true, "Lviv", 1900000, PropertyType.Catastrofe);
        Family familyInsurance = new Family(3, 45, true, "Lviv", 78000, PropertyType.Health);

        List<Insurance> list = new ArrayList<>();

        list.add(famInsurance);
        list.add(persInsurance);
        list.add(corpInsurance);
        list.add(myInsurance);
        list.add(mycorpInsurance);
        list.add(familyInsurance);

        InsuranceManager manager = new InsuranceManager(list);

//        InsuranceWriter insuranceWriter = new InsuranceWriter();
//        insuranceWriter.writeToFile(list);


        boolean menu = true;

        do {
            System.out.println("Menu");
            System.out.println(" 1 - Print list of insurances;");
            System.out.println(" 2 - Search by type of insurance;");
            System.out.println(" 3 - Search by status;");
            System.out.println(" 4 - Exit;");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num) {
                case 1: {
//                    manager.printList();
                    break;
                }
                case 2: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the type: ");
                    String type = scanner.nextLine();
                    System.out.println(manager.findByType(list, StatusType.Poor));
                    break;
                }
                case 3: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the income: ");
                    int income = scanner.nextInt();
                    System.out.println(manager.findByStatus(list, income));

                    break;
                }
                case 4:
                default: {
                    System.out.println("Exited programm");
                    menu = false;
                    break;
                }
            }
        } while (menu);

    }


//    public void func(List<String> names, List<String> lastnames) {
//
//    }
//
//    func(name,lastName);
//
//    List<String> name = new ArrayList<>();
//    List<String> lastName = new ArrayList<>();

}