package main.PunishmentTools;

import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class IcePunishmentTool extends PunishmentTool{
    private Double minTemperature;

    public IcePunishmentTool(String name, int damage, TortureDepartment tortureDepartment) {
        super(name, damage, tortureDepartment);
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
