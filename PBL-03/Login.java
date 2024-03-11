import java.util.Scanner;

class Login {
    public Login(String name) {
        for (int i = 0; i < Runner.userCount(); i++) {
            if (Runner.listaccounts()[i].name == name) {
                Account obj = Runner.listaccounts()[i].id;
                System.out.println("[+]Login Successful!");
            }else{
                System.out.println("[-]Could not login, please try again!");
            }
        }

        Runner.actions(obj);
    }
}