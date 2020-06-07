package com.explore.pattern.composite;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/8 0:20
 **/
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("John","CEO",30000);
        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println("--------正常循环----------");
        Long startTime = System.currentTimeMillis();
        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()){
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("用时： "+ (endTime - startTime) );

        System.out.println("--------递归----------");
        startTime = System.currentTimeMillis();
        printChildEmployee(ceo);
        endTime = System.currentTimeMillis();
        System.out.println("用时： "+ (endTime - startTime) );
    }

    private static void printChildEmployee(Employee employee){
        System.out.println(employee);
        for (Employee childEmployee : employee.getSubordinates()){
            printChildEmployee(childEmployee);
        }
    }

}
