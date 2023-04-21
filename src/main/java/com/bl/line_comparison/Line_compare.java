package com.bl.line_comparison;
import java.util.Scanner;
import java.util.Objects;
public class Line_compare
{
    private double x1;
        private double x2;
        private double y1;
        private double y2;
        private double length;
        private double length2;

        public void getDataLine1(double p, double q, double r, double s) {
            this.x1 = p;
            this.x2 = q;
            this.y1 = r;
            this.y2 = s;
        }

        public void calcLine1() {
            double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("The length of the line segment AB is " + length);
        }

        public void getDataLine2(double p, double q, double r, double s) {
            this.x1 = p;
            this.x2 = q;
            this.y1 = r;
            this.y2 = s;
        }

        public void calcLine2() {
            double length2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("The length of the line segment CD is " + length2);
        }

        public void checkLength() {
            if (Objects.equals(length, length2)) {
                System.out.println("Line 1 is equal to line 2.");
            } else {
                System.out.println("Line 1 is not equal to line 2.");
            }
        }

        public void showLineComparison() {
            String line1 = String.valueOf(length);
            String line2 = String.valueOf(length2);
            int comparison = line1.compareTo(line2);
            if (comparison == 0) {
                System.out.println("Line 1 is equal to line 2.");
            } else if (comparison > 0) {
                System.out.println("Line 1 is greater than line 2.");
            } else {
                System.out.println("Line 1 is less than line 2.");
            }
        }

        public static void main(String[] args) {
            System.out.printf("Welcome to Line Comparison Computation Program");
            Scanner sc = new Scanner(System.in);
            Line_compare lc = new Line_compare();
            System.out.println("Enter coordinates for point A: ");
            System.out.print("x1 = ");
            double x1 = sc.nextDouble();
            System.out.print("y1 = ");
            double y1 = sc.nextDouble();
            System.out.println("Enter coordinates for point B: ");
            System.out.print("x2 = ");
            double x2 = sc.nextDouble();
            System.out.print("y2 = ");
            double y2 = sc.nextDouble();

            System.out.println("Enter coordinates for point C: ");
            System.out.print("p1 = ");
            double p1 = sc.nextDouble();
            System.out.print("q1 = ");
            double q1 = sc.nextDouble();
            System.out.println("Enter coordinates for point D: ");
            System.out.print("p2 = ");
            double p2 = sc.nextDouble();
            System.out.print("q2 = ");
            double q2 = sc.nextDouble();

            lc.getDataLine1(x1, x2, y1, y2);
            lc.getDataLine2(x1, x2, y1, y2);
            lc.calcLine1();
            lc.calcLine2();
            lc.checkLength();
            lc.showLineComparison();
        }
}

