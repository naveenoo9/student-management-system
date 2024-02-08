package com.practice.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to your Student Management System!");
        System.out.println("Please enter your choice from below operations:");
        System.out.println("1 --> List all existing Students\n2 --> Add New Student");
        scanner.close();
    }
}