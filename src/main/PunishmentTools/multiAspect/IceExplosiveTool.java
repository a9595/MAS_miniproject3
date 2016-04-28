package main.PunishmentTools.multiAspect;

import main.PunishmentTools.IExplosiveTool;
import main.PunishmentTools.IcePunishmentTool;
import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class IceExplosiveTool extends IcePunishmentTool implements IExplosiveTool {
    // TODO:
    public IceExplosiveTool(String name, int damage, TortureDepartment tortureDepartment, Double minTemperature) {
        super(name, damage, tortureDepartment, minTemperature);
        // TODO:
    }

    @Override
    public int getExplosivePower() {
        return 0;// TODO:
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
