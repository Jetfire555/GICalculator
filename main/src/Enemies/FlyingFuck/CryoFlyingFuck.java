package Enemies.FlyingFuck;

import Enemies.Enemies;

import java.util.ArrayList;

public class CryoFlyingFuck implements Enemies {
    private final int[] hp = {36, 82, 143, 255, 443, 573, 736, 1044, 1347, 1797,
        2498, 3073, 4191, 4991, 6526, 7460, 9283, 10212, 12177, 13874, 18383};
    private final int[] attack =
        {10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18,
            19, 19, 20, 20};
    private final int[] level =
        {1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85,
            90, 95, 100};
    private final int currentLevel;

    public CryoFlyingFuck(int currentLevel){
        this.currentLevel = currentLevel;
    }

    @Override
    public int[] getHp() {
        return hp;
    }

    @Override
    public int[] getAttack() {
        return attack;
    }

    @Override
    public int[] getLevel() {
        return level;
    }

    @Override
    public int getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public int getPhysicalRes() {
        return -50;
    }

    @Override
    public int getPyroRes() {
        return 10;
    }

    @Override
    public int getCryoRes() {
        return 50;
    }

    @Override
    public int getHydroRes() {
        return 10;
    }

    @Override
    public int getElectroRes() {
        return 10;
    }

    @Override
    public int getAnemoRes() {
        return 10;
    }

    @Override
    public int getGeoRes() {
        return 10;
    }

    @Override
    public int getDendroRes() {
        return 10;
    }

    @Override
    public int getExp() {
        return 0;
    }

    @Override
    public int getMora() {
        return 0;
    }

    @Override
    public String[] getDrops() {
        return null;
    }
}
