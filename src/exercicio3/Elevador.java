package exercicio3;

public class Elevador {
    private int currentFloor;
    private int totalFloors;
    private int maxNumPeople;
    private int currentNumPeople;

    public void inicializa(int maxNumPeople, int totalFloors) {
        this.maxNumPeople = maxNumPeople;
        this.totalFloors = totalFloors;
        this.currentFloor = 0;
        this.currentNumPeople = 0;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getMaxNumPeople() {
        return maxNumPeople;
    }

    public void setMaxNumPeople(int maxNumPeople) {
        this.maxNumPeople = maxNumPeople;
    }

    public int getCurrentNumPeople() {
        return currentNumPeople;
    }

    public void setCurrentNumPeople(int currentNumPeople) {
        this.currentNumPeople = currentNumPeople;
    }

    public void entra() {
        if (currentNumPeople >= 0 && currentNumPeople <= maxNumPeople) {
            this.setCurrentNumPeople(currentNumPeople + 1);
            System.out.println("Elevador está com " + this.getCurrentNumPeople() + " pessoas");
        } else {
            System.out.println("Elevador lotado!");
        }
    }

    public void sai() {
        if (currentNumPeople > 0 && currentNumPeople <= maxNumPeople) {
            this.setCurrentNumPeople(currentNumPeople - 1);
            System.out.println("Elevador está com " + this.getCurrentNumPeople() + " pessoas");
        } else {
            System.out.println("Elevador já está vazio!");
        }
    }

    public void sobe() {
        if(currentFloor >= 0 && currentFloor <= totalFloors){
            this.setCurrentFloor(currentFloor + 1);
            System.out.println("Elevador está no andar " + this.getCurrentFloor());
        } else {
            System.out.println("Elevador já está no último andar!");
        }
    }

    public void desce() {
        if(currentFloor > 0 && currentFloor <= totalFloors){
            this.setCurrentFloor(currentFloor - 1);
            System.out.println("Elevador está no andar " + this.getCurrentFloor());
        } else {
            System.out.println("Elevador já está no térreo");
        }
    }
}
