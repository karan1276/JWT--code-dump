/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

abstract class Employee {

    private String name, address;
    protected int basicSalary;

    public Employee(String name, String address, int basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }

    public Employee() {
        this("lamda","India",25000);
    }
    public String getName() {

        return name;

    }

    public String getAddress() {

        return address;

    }

    public int getBasicSalary() {

        return basicSalary;

    }

    public void setAddress(String add) {

        address = add;

    }

    public void setName(String nm) {

        name = nm;

    }

    public void setBasicSalary(int sal) {

        basicSalary = sal;

    }

    public abstract int getMonthlySalary();
    
    
    public static void main(String args[]){
        Employee e = new NormalEmployee();
        System.out.println("Montly Salary of normal employee :"+e.getBasicSalary());
        
        e = new BonusEmployee();
        System.out.println("Montly Salary of bonus employee :"+e.getMonthlySalary());
    }
}
