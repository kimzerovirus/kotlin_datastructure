package me.kzv.swacademy;

import java.util.Scanner;

public class S1545거꾸로출력해보아요 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) System.out.print(i );
    }
}
