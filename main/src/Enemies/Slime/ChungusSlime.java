package Enemies.Slime;

import Enemies.Enemies;

public class ChungusSlime implements Enemies {
    private final int[] hp = {146, 328, 573, 1021, 1770, 2290, 2946, 4177, 5390, 7186,
        9993, 12294, 16763, 19966, 26104, 29842, 37131, 40849, 48708, 55498, 73530};
    private final int[] attack =
        {18, 18, 19, 20, 21, 22, 23, 24, 25, 25, 26, 27, 28, 29, 30, 31, 32,
            33, 33, 34, 35};
    private final int[] level =
        {1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85,
            90, 95, 100};
    private final int currentLevel;

    public ChungusSlime(int currentLevel) {
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
        return 10;
    }

    @Override
    public int getPyroRes() {
        return 10;
    }

    @Override
    public int getCryoRes() {
        return 10;
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
        int level = getCurrentLevel();
        if(level>=60){
            String[] drops = {"Slime Condensate", "Slime Secretions", "Slime Concentrate"};
            return drops;
        }else if(level >= 40){
            String[] drops = {"Slime Condensate", "Slime Secretions"};
            return drops;
        }
        String[] drops = {"Slime Condensate"};
        return drops;
    }
}
