package view;

import java.util.Scanner;

public class HomeView {
    public int selectMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Welcome to Assignment Application, please select mode.");
        System.out.println("1 for create assignment");
        System.out.println("2 for send assignment");
        System.out.println("other for exit");
        System.out.print("Mode: ");
        return scanner.nextInt();
    }
}
