/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager();

        salesManager.getAccommodationList().add(new Apartment(25, 3, 2, 100, 100, 44, 25, 67));
        salesManager.getAccommodationList().add(new Apartment(25, 5, 8, 150, 180, 22, 48, 12));
        salesManager.getAccommodationList().add(new Penthouse(25,true, 6, 225, 200, 22, 56, 43));
        salesManager.getAccommodationList().add(new Penthouse( 25, true, 7, 323, 185, 90, 18, 32));
        salesManager.getAccommodationList().add(new PersonalHome(25,  2, 5, 120, 190, 58, 12, 31));
        salesManager.getAccommodationList().add(new PersonalHome( 25,3, 8, 310, 148, 37, 23, 45));

        System.out.println("Menu: " +
                "\n1. Show all offers of accommodation" +
                "\n2. Show accommodation at a price" +
                "\n3. Show an apartment with a rental price less than $ 300" +
                "\n4. Show housing that is no more than 2 kilometers from the school");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice){

            case 1:
                System.out.println(salesManager.getAccommodationList());
                break;
            case 2:
                salesManager.sortAccomodationByPrice(salesManager.getAccommodationList());
                System.out.println(salesManager.getAccommodationList());
                break;
            case 3:
                System.out.println(salesManager.findByPrice(salesManager.getAccommodationList(), 300));
                break;
            case 4:
                System.out.println(salesManager.findByDistance(salesManager.getAccommodationList(),
                        ListLocationOfSIO.SCHOOL, 2));
                break;
        }
    }
} */
