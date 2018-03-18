package StructuralPatterns.Bridge;

/**
 *
 * @author Yevhenii R
 *
 * @date March 18, 2018
 *
 */

public class BankSystem extends Program{

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();

    }
}
