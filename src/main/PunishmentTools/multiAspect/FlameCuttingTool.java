package main.PunishmentTools.multiAspect;

import main.PunishmentTools.FlamePunishmentTool;
import main.PunishmentTools.ICuttingTool;
import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class FlameCuttingTool extends FlamePunishmentTool implements ICuttingTool {
    private int cuttingPower; // TODO:

    public FlameCuttingTool(String name, int damage, TortureDepartment tortureDepartment, Double maxTemperature) {
        super(name, damage, tortureDepartment, maxTemperature);
        // TODO:
    }

    @Override
    public Integer getCuttingPower() {
        return null; // TODO:
    }

    @Override
    public void setCuttingPower() {
// TODO:
    }

    @Override
    public void cut() {
// TODO:
    }
}
