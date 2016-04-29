package main.PunishmentTools.multiAspect.Attempt2;

import main.TortureDepartment;

/**
 * Created by tieorange on 28/04/16.
 */
public class IceCuttingTool extends IcePunishmentTool implements ICuttingTool {
    private int cuttingPower;

    public IceCuttingTool(String name, int damage, TortureDepartment tortureDepartment, Double minTemperature) {
        super(name, damage, tortureDepartment, minTemperature);
        setCuttingPower(cuttingPower);
    }

    @Override
    public int getCuttingPower() {
        return cuttingPower;
    }

    @Override
    public void setCuttingPower(Integer cuttingPower) {
        if (cuttingPower != null) {
            this.cuttingPower = cuttingPower;
        } else throw new IllegalArgumentException("cuttingPower is NULL");
    }


    @Override
    public void cut() {
        System.out.println("cutting");
    }
}
