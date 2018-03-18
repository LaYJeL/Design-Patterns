package StructuralPatterns.Bridge;

/**
 *
 * @author Yevhenii R
 *
 * @date March 18, 2018
 *
 */

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
