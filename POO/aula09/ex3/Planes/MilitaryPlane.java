package aula09.ex3.Planes;

import java.util.Objects;

public class MilitaryPlane extends Plane {
    private int numMissiles;
    public MilitaryPlane(String id, String fabricante, String modelo, int anoProducao, int maxPassageiros, int maxVel, int numMissiles) {
        super(id, fabricante, modelo, anoProducao, maxPassageiros, maxVel);
        this.numMissiles = numMissiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return numMissiles == that.numMissiles;
    }

    public String getPlaneType() {
        return "Military Plane";
    }

    @Override
    public int hashCode() {
        return Objects.hash(numMissiles);
    }

    public int getNumMissiles() {
        return numMissiles;
    }

    public void setNumMissiles(int numMissiles) {
        this.numMissiles = numMissiles;
    }

    @Override
    public String toString() {
        return "MilitaryPlane " + id +
                "\n fabricante= " + fabricante +
                "\n modelo= " + modelo +
                "\n anoProducao= " + anoProducao +
                "\n maxPassageiros= " + maxPassageiros +
                "\n maxVel= " + maxVel +
                "\n numOfCrewMembers= " + numMissiles +
                "\n--------------------------\n";
    }
}