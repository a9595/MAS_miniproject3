package main.PunishmentTools.Attempt2;

import main.PunishmentTools.IcePunishmentTool;
import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class IceCuttingTool extends IcePunishmentTool implements ICuttingTool {
    private int cuttingPower;// TODO:

    public IceCuttingTool(String name, int damage, TortureDepartment tortureDepartment, Double minTemperature) {
        super(name, damage, tortureDepartment, minTemperature);
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
