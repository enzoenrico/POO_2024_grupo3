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
    public int deposit(int amount) {
        this.balance += amount;
        return true;
    }

    /**
     * This function deducts a specified amount from the balance if sufficient funds
     * are available
     * and returns true, otherwise it returns false.
     * 
     * @param amount It looks like there is a typo in the code. The parameter name
     *               is misspelled as
     *               "ammount" instead of "amount". To fix this, you should correct
     *               the spelling of the parameter in
     *               the if statement.
     * @return The method `getMoney` returns a boolean value. It returns `true` if
     *         the specified amount
     *         can be deducted from the balance (assuming `balance` is a class
     *         variable accessible to the
     *         method) and `false` if the amount is greater than the balance.
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