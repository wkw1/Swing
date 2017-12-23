package homework;

/**
 * created by wkw
 */
public class BasePlusCommisionEmployee extends CommissionEmployee {

    private float baseSalary=1000;



    public BasePlusCommisionEmployee(String firstName, String lastName,
                                     String socialSecurityNumber) {
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
        return "BasePlusCommisionEmployee: " +
                "基本工资：" + baseSalary +
                ",销售额：" + super.getGrossSales() +
                ",提成比例：" + super.getCommissionRate() +
                ",姓名：" + super.getLastName() + super.getFirstName()  +
                ",社会安全码：" + super.getSocialSecurityNumber()+
                ",工资："+ earning();
    }
}
