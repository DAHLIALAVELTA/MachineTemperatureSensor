
package test;

import measurement.Printer;

public class TestRunner {
    public static void main (String[] args) {
        
        Printer printer = new Printer();
       
        printer.printAllMachineTemperatures(new double[] {35, 27.4, 43.5, 54.8});//test case 1
        System.out.println("====================");
        printer.printAllMachineTemperatures(new double[] {41.5, 40.4, 24.7, 39.1, 35.2, 53.4, 43});//test case 2
        System.out.println("====================");
        printer.printAllMachineTemperatures(new double[] {22.6, 55, 49.4, 40.6, 45.2, 19.6, 54});//test case 3 
        System.out.println("====================");
        printer.printAllMachineTemperatures(new double[] {26.8, 41.8, 47.3, 20.9,34.7});//test case 4
        System.out.println("====================");
        printer.printAllMachineTemperatures(new double[] {19.6, 39.8, 49.7, 31.1, 55.2, 45.2, 41.5});//test case 5
    }

}
