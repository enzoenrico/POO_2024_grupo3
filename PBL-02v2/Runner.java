import java.util.ArrayList;
import java.util.Scanner;

/**
 * The `Runner` class in Java manages a list of players, allows users to add
 * players, see scores,
 * update scores, or quit the program based on user input.
 */
class Runner {
    public static ArrayList<Player> users;

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

    // quickSort(users, 0, players.size() - 1);

    /**
     * The function `quickSort` recursively sorts an ArrayList of Player objects
     * using the quicksort
     * algorithm.
     * 
     * @param players An ArrayList of Player objects that you want to sort using the
     *                quickSort
     *                algorithm.
     * @param low     The `low` parameter represents the lowest index of the
     *                subarray to be sorted in the
     *                `players` ArrayList.
     * @param high    The `high` parameter in the `quickSort` method represents the
     *                index of the highest
     *                element in the sublist of `players` that we want to sort. It
     *                is used to determine the range of
     *                elements that need to be sorted within the `players` list.
     */
    public static void quickSort(ArrayList<Player> players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
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
     * @param players An ArrayList of Player objects representing a list of players.
     * @param low     The `low` parameter represents the starting index of the
     *                subarray within the
     *                `players` ArrayList that needs to be partitioned.
     * @param high    The `high` parameter in the `partition` method represents the
     *                index of the last
     *                element in the subarray that needs to be partitioned. It
     *                indicates the upper bound of the array
     *                or subarray being considered for partitioning.
     * @return The partition method returns the index of the pivot element after
     *         rearranging the
     *         elements in the ArrayList such that all elements with points greater
     *         than or equal to the pivot
     *         element are on its left, and all elements with points less than the
     *         pivot element are on its
     *         right.
     */
    public static int partition(ArrayList<Player> players, int low, int high) {
        int pivot = players.get(high).points;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).points >= pivot) {
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    /**
     * The `swap` function takes an ArrayList of Player objects and two indices, and
     * swaps the elements
     * at those indices in the ArrayList.
     * 
     * @param players An ArrayList of Player objects.
     * @param i       The parameter `i` in the `swap` method represents the index of
     *                the first player in the
     *                `players` ArrayList that you want to swap with another player.
     * @param j       The parameter `j` in the `swap` method represents the index of
     *                the second player in the
     *                `ArrayList<Player> players` that you want to swap with the
     *                player at index `i`.
     */
    public static void swap(ArrayList<Player> players, int i, int j) {
        Player temp = players.get(i);
        players.set(i, players.get(j));
        players.set(j, temp);
    }

    /**
     * The `listPlayers` function sorts a list of players and then displays their
     * ID, username, and
     * points to the user.
     */
    public static void listPlayers() {
        ArrayList<Player> data = users;

        // sorts the data before displaying it to the user
        quickSort(data, 0, data.size() - 1);

        for (Player i : data) {
            System.out.printf("[>]User ID: %s\n", i.getId());
            System.out.printf("\t[>]Username: %s\n", i.username);
            System.out.printf("\t[>]Points: %s\n", i.points);
            System.out.println(" ");
        }
    }

    /**
     * The function `processInput` takes a command and user input, then performs
     * various actions based
     * on the command such as adding a new player, listing players, updating player
     * points, or quitting
     * the program.
     * 
     * @param command The `command` parameter in the `processInput` method is a
     *                string that represents
     *                the user's input command. The method processes different
     *                commands based on the user's input,
     *                such as creating a new player, listing players, updating
     *                player points, or quitting the program.
     *                The commands are represented by single
     * @param input   The `input` parameter in the `processInput` method is of type
     *                `Scanner`. This
     *                parameter is used to read input from the user, such as player
     *                names, user IDs, and points to
     *                assign to users. The `Scanner` class in Java is used for
     *                obtaining input of primitive types like
     */
    static void processInput(String command, Scanner input) {

        if (command.strip() == null) {
            System.out.println("[!]Write a valid string!!!!");
            return;
        }
        clearScreen();

        // logic for processing menu commands
        // not the best code but it works ㄟ( ▔, ▔ )ㄏ
        switch (command.toUpperCase()) {
            case "N": {
                System.out.println("[+]Insert player's name");
                String newUsername = input.nextLine();
                // created player here
                try {
                    Player thispl = new Player(newUsername);
                    users.add(thispl);

                    System.out.printf("[+]Added player %s...\nPoints: %d\n", thispl.username, thispl.points);

                    listPlayers();

                    return;

                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            case "S": {
                listPlayers();
                break;
            }

            case "A": {
                System.out.println("[+]Select a user ID from the list below to update it's points");
                listPlayers();
                Integer userInput = input.nextInt();
                Player selected = null;
                for (Player s : users) {
                    if (s.getId() == userInput) {
                        selected = s;
                        break;
                    }
                }
                if (selected != null) {
                    System.out.printf("[Selected] ->[UserID %d] - %s | Points: %d\n", selected.getId(),
                            selected.username,
                            selected.points);
                }
                System.out.println("[+]Select new amount of point to assign to user");
                userInput = input.nextInt();
                ArrayList<Integer> h = selected.appendHistory(userInput);
                selected.points = userInput;
                System.out.printf("[User %d 's history of points] \n", selected.getId());
                for (Integer i : h) {
                    System.out.printf("[Score]: %d", i);
                }
                break;
            }

            case "Q": {
                playing = false;
                break;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}