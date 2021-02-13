package Enemies;

import java.util.ArrayList;

public interface Enemies {
    int[] getHp();

    int[] getAttack();

    int[] getLevel();

    int getCurrentLevel();

    int getPhysicalRes();

    int getPyroRes();

    int getCryoRes();

    int getHydroRes();

    int getElectroRes();

    int getAnemoRes();

    int getGeoRes();

    int getDendroRes();

    int getExp();

    int getMora();

   String[] getDrops();
}
