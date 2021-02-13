package Weapons.Polearm;

import Weapons.Weapons;

public class StaffOfHoma implements Weapons {
    @Override
    public int[] getBaseAttack() {
        return new int[0];
    }

    @Override
    public int[] getSubstatNum() {
        return new int[0];
    }

    @Override
    public String getSubstat() {
        return null;
    }

    @Override
    public String passiveEffect() {
        return null;
    }

    @Override
    public int rarity() {
        return 0;
    }
}

