package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int seconds = input % 60;
        int minutes = input / 60 % 60;
        int hours = input / 3600 % 24;

        System.out.printf("%d:%02d:%02d",hours, minutes, seconds);
    }
}
