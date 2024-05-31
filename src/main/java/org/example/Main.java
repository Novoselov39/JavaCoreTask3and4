package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Employee[] employees = {
                new Employee("Ivan", "Igorevich",
                        "Ovchinnikov", "8(495)000-11-22",
                        "developer", 50000, 1985, "m".charAt(0)),
                new Employee("Andrey", "Viktorovich",
                        "Bezrukov", "8(495)111-22-33",
                        "fitter", 52000, 1973,"m".charAt(0)),
                new Employee("Evgeniy", "Viktorovich",
                        "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963,"m".charAt(0)),
                new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990,"f".charAt(0)),
                new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983,"f".charAt(0))
                };
            for (int i = 0; i < employees.length; i++) {
                increaser(employees, 45, 5000);
            }

        //System.out.println(employees[0].toString());

    }

    private static void congratulation(Employee[] emp, Holidays holiday) {
        switch (holiday){
            case NEWYEAR:
                for(Employee employee:emp){

                    System.out.println(employee.getName() + " Happy New Yewr!");

                }
                break;
            case MARCH8:
                for(Employee employee:emp){
                    if (employee.getGender()=='f') {
                        System.out.println(employee.getName() + " happy holiday");
                    }

                }
                break;
            case FEB23:
                for(Employee employee:emp){
                    if (employee.getGender()=='m') {
                        System.out.println(employee.getName() + " happy holiday");
                    }

                }
                break;
            default:
                break;

        }
    }




    private static void increaser(Employee[] emp, int age, int increment) {
         for (int i = 0; i < emp.length; i++) {
             if (emp[i].getAge() > age) {
                 emp[i].increaseSalary(increment);
                 }
             }
        }


}