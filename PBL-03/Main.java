import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static ArrayList<Account> listAccounts() {
        ArrayList<Account> data = users;

        for (Account i : data) {
            System.out.printf("[>]User ID: %s\n", i.getId());
            System.out.printf("\t[>]name: %s\n", i.name);
            System.out.printf("\t[>]Balance(): %s\n", i.getBalance());
            System.out.println(" ");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        while (true) {
            System.out.println("[+]Type 1 for creating a new account");
            System.out.println("[+]Type 2 for listing all accounts");
            System.out.println("[+]Type 3 for logging in a account");

            String inp = op.nextLine();

            switch (inp) {
                case "1":
                    System.out.println("[+]Write your name for the account:\n");
                    String name = op.nextLine();
                    Account created = new Account(name);
                    System.out.println("New account successfully created");
                    break;
                case "2":
                    ArrayList<Account> data = listAccounts();
                    for (int i = 0; i < data.size(); i++) {
                        System.out.printf("[+]User: %s \n \t[+]ID: %s\n\t[+]Balance: %s\n",
                                data.get(i).getId(),
                                data.get(i).name,
                                data.get(i).getBalance());
                    }
                    break;
                case "3":
                    System.out.println("[+]Write your name below:\n");
                    String name = op.nextLine();
                    //Login(name);
                    break;
            }

        }

    }
}