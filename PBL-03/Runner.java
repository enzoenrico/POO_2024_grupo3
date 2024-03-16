import java.util.ArrayList;
import java.util.Scanner;

/**
 * The `Runner` class in Java manages a list of accounts, allows users to add
 * accounts, see scores,
 * update scores, or quit the program based on user input.
 */
class Runner {
    public static ArrayList<Account> users;

    public static boolean playing = true;

    public static void main() {
        users = new ArrayList<Player>();
        Scanner input = new Scanner(System.in);
        while (playing) {
            System.out.println(
                    "[!]To add a player type N\n[+]To see scores type S\n[+]To update a user score type A\n[+]Type Q to quit");
            String command = input.nextLine();
            processInput(command, input);
        }
        input.close();
    }

    // quickSort(users, 0, accounts.size() - 1);

    /**
     * The function `quickSort` recursively sorts an ArrayList of Player objects
     * using the quicksort
     * algorithm.
     * 
     * @param accounts An ArrayList of Player objects that you want to sort using
     *                 the
     *                 quickSort
     *                 algorithm.
     * @param low      The `low` parameter represents the lowest index of the
     *                 subarray to be sorted in the
     *                 `accounts` ArrayList.
     * @param high     The `high` parameter in the `quickSort` method represents the
     *                 index of the highest
     *                 element in the sublist of `accounts` that we want to sort. It
     *                 is used to determine the range of
     *                 elements that need to be sorted within the `accounts` list.
     */
    public static void quickSort(ArrayList<Player> accounts, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(accounts, low, high);
            quickSort(accounts, low, pivotIndex - 1);
            quickSort(accounts, pivotIndex + 1, high);
        }
    }

    /**
     * The partition function takes an ArrayList of Player objects, selects a pivot
     * element based on
     * points, and rearranges the elements such that all elements greater than or
     * equal to the pivot
     * are on the right side and all elements less than the pivot are on the left
     * side.
     * 
     * @param accounts An ArrayList of Player objects representing a list of
     *                 accounts.
     * @param low      The `low` parameter represents the starting index of the
     *                 subarray within the
     *                 `accounts` ArrayList that needs to be partitioned.
     * @param high     The `high` parameter in the `partition` method represents the
     *                 index of the last
     *                 element in the subarray that needs to be partitioned. It
     *                 indicates the upper bound of the array
     *                 or subarray being considered for partitioning.
     * @return The partition method returns the index of the pivot element after
     *         rearranging the
     *         elements in the ArrayList such that all elements with points greater
     *         than or equal to the pivot
     *         element are on its left, and all elements with points less than the
     *         pivot element are on its
     *         right.
     */
    public static int partition(ArrayList<Player> accounts, int low, int high) {
        int pivot = accounts.get(high).points;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (accounts.get(j).points >= pivot) {
                i++;
                swap(accounts, i, j);
            }
        }

        swap(accounts, i + 1, high);
        return i + 1;
    }

    /**
     * The `swap` function takes an ArrayList of Player objects and two indices, and
     * swaps the elements
     * at those indices in the ArrayList.
     * 
     * @param accounts An ArrayList of Player objects.
     * @param i        The parameter `i` in the `swap` method represents the index
     *                 of
     *                 the first player in the
     *                 `accounts` ArrayList that you want to swap with another
     *                 player.
     * @param j        The parameter `j` in the `swap` method represents the index
     *                 of
     *                 the second player in the
     *                 `ArrayList<Player> accounts` that you want to swap with the
     *                 player at index `i`.
     */
    public static void swap(ArrayList<Player> accounts, int i, int j) {
        Player temp = accounts.get(i);
        accounts.set(i, accounts.get(j));
        accounts.set(j, temp);
    }

    /**
     * The `listaccounts` function sorts a list of accounts and then displays their
     * ID, username, and
     * balance to the user.
     */
    public static ArrayList<Account> listaccounts() {
        ArrayList<Account> data = users;
        // sorts the data before displaying it to the user
        quickSort(data, 0, data.size() - 1);
        return data;
    }

    public static int userCount() {
        return users.size();
    }

    public static void actions(Account userId) {
        Scanner action = new Scanner(System.in);
        System.out.println("[+]Type 1 to deposit");
        System.out.println("[+]Type 2 to withdraw\n");
        String choice = action.nextLine();

        switch (choice) {
            case "1": {
                System.out.println("[+]Write the amount you want to deposit:\n");
                amount = action.nextInt();
                boolean ok = Account.deposit(amount);
                if (ok) {
                    System.out.println("[+]Deposit successful");
                } else {
                    System.out.println("[-]Deposit not successful, try again");
                }
            }
            case "2": {
                System.out.println("[+]Write the amount you want to withdraw:\n");
                amount = action.nextInt();
                boolean ok = Account.withdraw(amount);
                if (ok) {
                    System.out.println("[+]Withdraw successful");
                } else {
                    System.out.println("[-]Withdraw not successful, try again");
                }
            }
        }
    }
}