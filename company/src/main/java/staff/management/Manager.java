package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName,String name, String niNumber, double salary){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {

        return deptName;
    }

    public static class Director {

    }
}
