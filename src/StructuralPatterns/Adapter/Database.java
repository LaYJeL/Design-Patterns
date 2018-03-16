package StructuralPatterns.Adapter;

/**
 *
 * @author Yevhenii R
 *
 * @date March 16, 2018
 *
 */

public interface Database {
    public void insert();

    public void update();

    public void select();

    public void remove();
}
