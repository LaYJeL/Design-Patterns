package StructuralPatterns.Bridge;

/**
 *
 * @author Yevhenii R
 *
 * @date March 18, 2018
 *
 */

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program:programs) {
            program.developProgram();
        }
    }
}
