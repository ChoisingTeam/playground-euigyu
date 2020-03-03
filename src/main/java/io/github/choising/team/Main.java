package io.github.choising.team;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차대수는몇대인가요?");
        int car = sc.nextInt();
        System.out.println("시도할횟수는몇회인가요?");
        int num = sc.nextInt();

        for (int i = 0; i < car; i++) {
            System.out.println();
            for (int j = 0; j < num; j++) {
                int randomValue = (int) (Math.random() * 9);
                if (randomValue >= 4) {
                    System.out.print("-");
                }
            }
        }
    }
}
