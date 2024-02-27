package aula09.ex3;

import aula09.ex3.Planes.Plane;

public class PlaneManager {
    private Plane[] planes;
    private int numPlanes, nextNum;
    ;


    public PlaneManager() {
        planes = new Plane[100];
        nextNum = 0;
    }

    public void addPlane(Plane plane) {
        numPlanes=nextNum;
        nextNum++;
        planes[numPlanes] = plane;
    }

    public boolean removePlane(String id) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getId().equals(id)) {
                planes[i] = null;
                return true;
            }
        }
        return false;
    }
    public Plane searchPlane(String id ) {
        for (Plane plane : planes) {
            if (plane == null) break;
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public void getMilitaryPlanes() {
        for (Plane plane : planes) {
            if (plane.getPlaneType().equals("Military Plane")) {
                System.out.println(plane.toString());
            }
        }
    }

    public void printAllPlanes() {
        for(Plane plane : planes){
            if (plane == null) break;
            System.out.println(plane.toString());
        }
    }

    public Plane printFastestPlane(){
        Plane fastplane = planes[0];
        for(Plane plane : planes){
            if (plane.getMaxVel()>fastplane.getMaxVel()){
                fastplane = plane;
            }
        }
        return fastplane;
    }

    public void getCommercialPlanes() {
        for (Plane plane : planes) {
            if (plane.getPlaneType().equals("Commercial Plane")) {
                System.out.println(plane.toString());
            }
        }

    }


}
