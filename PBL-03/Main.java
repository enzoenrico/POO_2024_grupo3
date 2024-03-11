import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        while (true) {
            System.out.println("[+]Type 1 for creating a new account");
            System.out.println("[+]Type 2 for listing all accounts");
            System.out.println("[+]Type 3 for logging in a account");

            switch (op) {
                case "1":
                    System.out.println("[+]Write your name for the account:\n");
                    name = op.nextLine();
                    Account created = new Account(name);
                    System.out.println("New account successfully created");
                    break;
                case "2":
                    Account[] data = Runner.listaccounts();
                    for (int i = 0; i < data.length; i++) {
                        System.out.printf("[+]User: %s \n \t[+]ID: %s\n\t[+]Balance: %s\n",
                                data[i].getId(),
                                data[i].name,
                                data[i].getBalance());
                    }
                    break;
                case "3":
                    System.out.println("[+]Write your name below:\n");
                    String name = inp.nextLine();
                    Login(name);
                    break;
            }

        }

    }
}