package main.PunishmentTools.multiAspect.Attempt2;

import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class IceExplosiveTool extends IcePunishmentTool implements IExplosiveTool {
    private int explosivePower;

    public IceExplosiveTool(String name, int damage, TortureDepartment tortureDepartment, Double minTemperature) {
        super(name, damage, tortureDepartment, minTemperature);
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
