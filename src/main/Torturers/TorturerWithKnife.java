package main.Torturers;

import main.TortureDepartment;

/**
 * Created by tieorange on 26/04/16.
 */
public class TorturerWithKnife extends Torturer {
    // TODO: add knife

    public TorturerWithKnife(String name, TortureDepartment tortureDepartment) {
        super(name, tortureDepartment);
    }

    @Override
    public void punish() {
        System.out.println("Torturer punished..."); // TODO mock
    }
}
