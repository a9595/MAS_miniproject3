package main.Sinners;

/**
 * Created by tieorange on 26/04/16.
 */
public interface ILiar {
    public void setAmountOfLies(int amountOfLies);

    public int getAmountOfLies();

    // TODO: add Sinner as a param
    public void tryToLie();
}
