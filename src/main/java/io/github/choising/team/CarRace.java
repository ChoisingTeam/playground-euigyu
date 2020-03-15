package io.github.choising.team;


import java.util.*;
import java.io.*;


public class CarRace {
    public CarRace(){

    }

    public void inputRand(int count) {
        for (int i = 0; i < count; i++) {
            int rand = (int) (Math.random() * 10);
            race(rand);
        }
        System.out.println();
    }

    public void race(int num){
        if(num>=4){
            System.out.print("-");
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int car = sc.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = sc.nextInt();
        System.out.println();

        System.out.println("실행 결과");
        for(int i=0;i<car;i++){
            CarRace car_num = new CarRace();
            car_num.inputRand(count);
        }

    }


}
