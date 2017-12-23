package homework;

/**
 * created by wkw
 */
public class CommissionEmployee extends Employee {

    private int grossSales=10;
    private float commissionRate=99;

    public CommissionEmployee(String firstName, String lastName, int socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public float earning() {
        return grossSales*commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee" +
                "\n销售额：" + grossSales +
                "\n提成比例：" + commissionRate +
                 super.toString();
    }
}
