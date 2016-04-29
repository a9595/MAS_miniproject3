package UnitTests;

import main.PunishmentTools.ExplosivePunishmentTool;
import main.PunishmentTools.PunishmentTool;
import main.TortureDepartment;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tieorange on 26/04/16.
 */
public class PunishmentToolTest {
    public static final String Name = "Hummer";
    public static final int DAMAGE = 10;
    public static final TortureDepartment TORTURE_DEPARTMENT = new TortureDepartment("boiling Room");
    PunishmentTool punishmentTool;

    @org.junit.Before
    public void setUp() throws Exception {
        punishmentTool = new ExplosivePunishmentTool("bomb", 40, TORTURE_DEPARTMENT, 4.6, -10);
    }

    @Test
    public void getName() throws Exception {
        assertEquals(Name, punishmentTool.getName());
    }

    @org.junit.Test
    public void setName() throws Exception {
        String newName = "new hummer";
        punishmentTool.setName(newName);

        assertEquals(newName, punishmentTool.getName());
    }

    @org.junit.Test
    public void getDamage() throws Exception {

    }

    @org.junit.Test
    public void setDamage() throws Exception {

    }

    @org.junit.Test
    public void getTortureDepartment() throws Exception {

    }

    @org.junit.Test
    public void setTortureDepartment() throws Exception {

    }

}