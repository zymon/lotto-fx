package com.esolutions.lotto;

import java.util.Scanner;

public class TempApp {

    public static void main(String[] args) {
        new TempApp().run();
    }

    public void run() {
        final String menu = prepareMenu();
        do {
            System.out.println(menu);
            Scanner scanner = new Scanner(System.in);
            String option = scanner.next();

            handleOption(option);
        } while(true);
    }

    private void handleOption(String option) {
        switch(option.toUpperCase()) {
            case "R": readJson(); break;
            case "S": saveJson(); break;
            case "X": synchronizeWithCsv(); break;
            case "P": printStats(); break;
            case "Q": quit(); break;
            case "1": drawChartOne(); break;
            default:
                System.out.println("\n\n");
                break;
        }
    }

    private void drawChartOne() {
        System.out.println("Drawing chart 1");
    }

    private void quit() {
        System.out.println("Are you sure to quit? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        final String option = scanner.next();
        if (option.equalsIgnoreCase("Y")) {
            System.exit(0);
        }
    }

    private void printStats() {
        System.out.println("Stats:");
    }

    private void synchronizeWithCsv() {
        System.out.println("Sync with csv");
    }

    private void saveJson() {
        System.out.println("Saved json to: ...");
    }

    private void readJson() {
        System.out.println("Read json from: ...");
    }

    private String prepareMenu() {
        StringBuilder sb = new StringBuilder("\nMenu:\n");
        sb.append("  [R] - read from json \n")
          .append("  [S] - save to json \n")
          .append("  [X] - synchronize json with csv \n")
          .append("  [P] - print statistics \n")
          .append("  [Q] - quit \n")
          .append("  [1] - draw a chart 1");

        return sb.toString();
    }

}
