/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author student
 */
public class BonusEmployee extends Employee{
    private int bonus;

    public BonusEmployee(int bonus) {
        this.bonus = bonus;
    }
    
    public BonusEmployee() {
        this(5);
    }

    @Override
    public int getMonthlySalary() {
        return basicSalary*(100+bonus)/100;
    }
}
