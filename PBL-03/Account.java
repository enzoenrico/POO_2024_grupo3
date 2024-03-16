import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

/**
 * The `Account` class represents a basic account with functionalities for
 * managing balance,
 * transaction history, and deposit/withdraw operations.
 */
class Account {
    private int id;
    public String name;
    private int balance;
    private ArrayList<Integer> history;

    public Account(String name) {
        this.id = ThreadLocalRandom.current().nextInt(1, 1000);
        this.name = name;
        this.balance = 0;
        this.history = new ArrayList<Integer>(0);
        this.history.add(this.balance);
    }

    /**
     * The function getId() returns the id of an object.
     * 
     * @return The method `getId()` is returning the value of the `id` field of the
     *         current object.
     */
    public int getId() {
        return this.id;
    }

    /**
     * The `getBalance` function in Java returns the current balance value.
     * 
     * @return The method `getBalance` is returning the value of the `balance`
     *         attribute of the current
     *         object.
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * The function `getHistory` returns an ArrayList of integers representing the
     * history.
     * 
     * @return An ArrayList of Integer values representing the history.
     */
    public ArrayList<Integer> getHistory() {
        return this.history;
    }

    /**
     * The function `appendHistory` adds a score to an ArrayList and returns the
     * updated list.
     * 
     * @param score The `score` parameter is an integer value representing a score
     *              that you want to
     *              append to the history list.
     * @return The `history` ArrayList containing the updated scores after appending
     *         the new score is
     *         being returned.
     */
    public ArrayList<Integer> appendHistory(int score) {
        this.history.add(score);
        return history;
    }

    /**
     * The deposit function adds the specified amount to the balance.
     * 
     * @param amount The `amount` parameter in the `deposit` method represents the
     *               amount of money that
     *               is being deposited into an account.
     * @return The `deposit` method is returning an `int` value. However, the method
     *         signature
     *         indicates that it should return an `int`, but the implementation is
     *         returning a `boolean` value
     *         (`true`). To fix this, you should update the return type of the
     *         method to match what is actually
     *         being returned.
     */
    public boolean deposit(int amount) {
        this.balance += amount;
        return true;
    }
    /**
     * The function `withdraw` in Java checks if the amount to be withdrawn is less than or equal to
     * the balance and updates the balance accordingly, returning true if successful and false
     * otherwise.
     * 
     * @param amount Amount is the parameter representing the amount of money that a user wants to
     * withdraw from their account.
     * @return The method `withdraw` returns a boolean value. It returns `true` if the withdrawal was
     * successful (i.e., if the amount is less than or equal to the balance), and it returns `false` if
     * the withdrawal was not successful (i.e., if the amount is greater than the balance).
     */
    public boolean withdraw(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            return false;
        }
        return true;
    }

}