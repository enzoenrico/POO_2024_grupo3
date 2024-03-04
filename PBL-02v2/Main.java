import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

class Player {
    private int id;
    public String username;
    public int points;
    private ArrayList<Integer> history;

    public Player(String name) {
        this.id = ThreadLocalRandom.current().nextInt(1, 1000);
        this.username = name;
        this.points = 0;
        this.history = new ArrayList<Integer>(0);
        this.history.add(this.points);
    }

    /**
     * The function getId() returns the id of an object.
     * 
     * @return The method `getId()` is returning the value of the `id` field of the current object.
     */
    public int getId() {
        return this.id;
    }

    /**
     * The function `getHistory` returns an ArrayList of integers representing the history.
     * 
     * @return An ArrayList of Integer values representing the history.
     */
    public ArrayList<Integer> getHistory(){
        return this.history;
    }

    /**
     * The function `appendHistory` adds a score to an ArrayList and returns the updated list.
     * 
     * @param score The `score` parameter is an integer value representing a score that you want to
     * append to the history list.
     * @return The `history` ArrayList containing the updated scores after appending the new score is
     * being returned.
     */
    public ArrayList<Integer> appendHistory(int score){
        this.history.add(score);
        return history;
    }
}

class Main {
    public static void main(String[] args) {
       // yes i wrote a whole separate file for something i could've made in a single class
       // `(*>﹏<*)′
       Runner.main();
    }
}