package services;


import java.util.Scanner;

public class MenuService {

    public void printMenu(){
        System.out.println("\n\n\n\tPrograma IT Academy – Processo Seletivo – Edição #16 - Gabriel Scherer");
        System.out.println("\tMedicamentos no Brasil");
        System.out.println("1. Consultar Medicamento pelo Nome da Substância");
        System.out.println("2. Consultar Medicamento pelo Código EAN1");
        System.out.println("3. Comparativo da LISTA DE CONCESSÃO DE CRÉDITO TRIBUTÁRIO (PIS/COFINS)");
        System.out.println("4. Sair");
        System.out.println("Digite a opção desejada e aperte ENTER: ");
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        MedicineService service = new MedicineService();
        int option;

        do {
            printMenu();
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o Nome da Substância:");
                    String name = sc.nextLine().toUpperCase();
                    service.getByName(name);
                    break;

                case 2:
                    System.out.println("Digite o Código EAN1 do Medicamento:");
                    String code = sc.nextLine();
                    service.getByCode(code);
                    break;

                case 3:
                    System.out.println("Comparativo da LISTA DE CONCESSÃO DE CRÉDITO TRIBUTÁRIO (PIS/COFINS)");
                    service.compareTributaryCredit();
                    break;

                case 4:
                    System.out.println("Programa Encerrado. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 4);
        sc.close();
        scan.close();
    }
}
