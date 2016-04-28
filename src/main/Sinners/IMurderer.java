package main.Sinners;

/**
 * Created by tieorange on 26/04/16.
 */
public interface IMurderer {
    public void setAmountOfVictims(Integer amountOfVictims);

    public int getAmountOfVictims();

    // TODO: add Sinner as a parameter
    public void tryKill();
}
