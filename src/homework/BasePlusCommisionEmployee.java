package homework;

/**
 * created by wkw
 */
public class BasePlusCommisionEmployee extends CommissionEmployee {

    private float baseSalary=1000;



    public BasePlusCommisionEmployee(String firstName, String lastName,
                                     int socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public float earning() {
        return baseSalary+super.getGrossSales()*super.getCommissionRate();
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee" +
                "\n基本工资：" + baseSalary +
                super.toString();
    }
}
