package main.PunishmentTools.multiAspect.Attempt2;

import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class FlameExplosiveTool extends FlamePunishmentTool implements IExplosiveTool {
    private int explosivePower;

    public FlameExplosiveTool(String name, int damage, TortureDepartment tortureDepartment, Double maxTemperature) {
        super(name, damage, tortureDepartment, maxTemperature);
        setExplosivePower(explosivePower);
    }

    @Override
    public int getExplosivePower() {
        return explosivePower;
    }

    @Override
    public void setExplosivePower(Integer explosivePower) {
        if (explosivePower != null) {
            this.explosivePower = explosivePower;
        } else throw new IllegalArgumentException("explosivePower is NULL");
    }

    @Override
    public void explode() {
        System.out.println("explode");
    }
}
