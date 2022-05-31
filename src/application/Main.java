package application;

import services.MedicineService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MedicineService service = new MedicineService();


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Substância");

        String name = sc.nextLine();

        service.getByName(name);
    }
}
