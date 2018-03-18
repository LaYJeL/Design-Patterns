package StructuralPatterns.Bridge;

/**
 *
 * @author Yevhenii R
 *
 * @date March 18, 2018
 *
 */

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
