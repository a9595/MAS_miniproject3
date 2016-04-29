package main.PunishmentTools.multiAspect.Attempt2;

import main.PunishmentTools.PunishmentTool;
import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public abstract class FlamePunishmentTool extends PunishmentTool {
    private double maxTemperature;

    public FlamePunishmentTool(String name, int damage, TortureDepartment tortureDepartment, Double maxTemperature) {
        super(name, damage, tortureDepartment);
        setMaxTemperature(maxTemperature);
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        if (maxTemperature != null) {
            this.maxTemperature = maxTemperature;
        } else throw new IllegalArgumentException("maxTemperature is NULL");
    }
}
