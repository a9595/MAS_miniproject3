package main.PunishmentTools.multiAspect.Attempt2;

import main.PunishmentTools.PunishmentTool;
import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public abstract class IcePunishmentTool extends PunishmentTool {
    private Double minTemperature;

    public IcePunishmentTool(String name, int damage, TortureDepartment tortureDepartment, Double minTemperature) {
        super(name, damage, tortureDepartment);
        setMinTemperature(minTemperature);
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        if (minTemperature != null) {
            this.minTemperature = minTemperature;
        } else throw new IllegalArgumentException("minTemperature is NULL");
    }
}
