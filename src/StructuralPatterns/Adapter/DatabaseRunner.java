package StructuralPatterns.Adapter;

/**
 *
 * @author Yevhenii R
 *
 * @date March 16, 2018
 *
 */

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
