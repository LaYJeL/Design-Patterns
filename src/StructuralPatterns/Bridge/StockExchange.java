package StructuralPatterns.Bridge;

/**
 *
 * @author Yevhenii R
 *
 * @date March 18, 2018
 *
 */

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
