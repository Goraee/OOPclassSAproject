package Bus;

public class Bus {

    int maxPassenger;     // 승객 수
    int currentPassenger; // 현재 승객 수
    int money; // 요금
    int busNumber; // 버스 번호
    int gasMount; // 주유량
    int speed; // 현재 속도
    int status;// 상태


    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 승객이 버스에 탈 때
    public void take(int money) {
        this.money += money;      // 버스 요금 (매개변수 money)만큼 버스 수입이 증가
        passengerCount++;         // 승객 수 증가
    }

    public void changeSpeed(int speed) {
        this.speed += speed;
        speedCount++;
    }


    // 버스의 현재 정보 출력
    public void status() {
        System.out.println("버스 "+busNumber+"번의 버스는 "+passengerCount+"명이고, 속도는"+ speed+"입니다.");
    }
}

