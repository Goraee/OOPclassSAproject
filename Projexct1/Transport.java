

public class transport {
    String maxPassenger;
    int busNumber;
    int gasMount;
    int speed;
    int changeSpeed;

    public transport(String maxPassenger, int busNumber, int gasMount, int speed, int changeSpeed) {
        this.maxPassenger = maxPassenger;
        this.busNumber = busNumber;
        this.gasMount = gasMount;
        this.speed = speed;
        this.changeSpeed = changeSpeed;
    }

    public void ride(String maxPassenger, int busNumber, int gasMount, int speed, int changeSpeed) {
        this.maxPassenger = maxPassenger;
        this.busNumber = busNumber;
        this.gasMount = gasMount;
        this.speed = speed;
        this.changeSpeed = changeSpeed;
    }


    public void showInfo() {
        System.out.println(this.getName()+" has "+this.getMoney());
    }
}
