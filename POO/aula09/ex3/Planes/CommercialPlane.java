package aula09.ex3.Planes;
import java.util.Objects;

public class CommercialPlane extends Plane {
    private int numOfCrewMembers;


    public CommercialPlane(String id, String fabricante, String modelo, int anoProducao, int maxPassageiros, int maxVel, int numOfCrewMembers) {
        super(id, fabricante, modelo, anoProducao, maxPassageiros, maxVel);
        this.numOfCrewMembers = numOfCrewMembers;
    }

    public int getNumOfCrewMembers() {
        return numOfCrewMembers;
    }
    public void setNumOfCrewMembers(int numOfCrewMembers) {
        this.numOfCrewMembers = numOfCrewMembers;
    }

    public String getPlaneType() {
        return "Commercial Plane";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialPlane that = (CommercialPlane) o;
        return numOfCrewMembers == that.numOfCrewMembers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfCrewMembers);
    }

    @Override
    public String toString() {
        return "CommercialPlane " + id +
                "\n fabricante= " + fabricante +
                "\n modelo= " + modelo +
                "\n anoProducao= " + anoProducao +
                "\n maxPassageiros= " + maxPassageiros +
                "\n maxVel= " + maxVel +
                "\n numOfCrewMembers= " + numOfCrewMembers +
                "\n--------------------------\n";
    }
}
