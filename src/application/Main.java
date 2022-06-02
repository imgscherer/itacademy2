package application;


import services.MenuService;

public class Main {

    public static void main(String[] args) {
        MenuService service = new MenuService();

        service.menu();
    }
}
