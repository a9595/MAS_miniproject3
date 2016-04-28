package main.PunishmentTools.multiAspect;

import main.PunishmentTools.FlamePunishmentTool;
import main.PunishmentTools.IExplosiveTool;
import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class FlameExplosiveTool extends FlamePunishmentTool implements IExplosiveTool {
    private int explosivePower;

    public FlameExplosiveTool(String name, int damage, TortureDepartment tortureDepartment, Double maxTemperature) {
        super(name, damage, tortureDepartment, maxTemperature);
        // TODO:
    }

    @Override
    public int getExplosivePower() {
        return 0; // TODO:
    }

    @Override
    public void setExplosivePower(Integer explosivePower) {
// TODO:
    }

    @Override
    public void explode() {
// TODO:
    }
}
