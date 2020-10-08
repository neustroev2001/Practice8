import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FurnitureShop shop = new FurnitureShop();
        System.out.println("What would you like to buy? 1 - Chair, 2 - Table, 3 - All goods");
        int a = in.nextInt();
        switch (a){
            case(1):
                System.out.println("Price, " + "Material: ");
                shop.add_furn( new Chair(3600,"Oak tree"));
                shop.output();
                break;
            case(2):
                System.out.println("Price, " + "Material: ");
                shop.add_furn(new Table(5600,"Linden tree"));
                shop.output();
                break;
            case(3):
                System.out.println("Price, " + "Material: ");
                shop.add_furn( new Chair(3600,"Oak tree"));
                shop.add_furn(new Table(5600,"Linden tree"));
                shop.output();
                break;
        }
    }

}
