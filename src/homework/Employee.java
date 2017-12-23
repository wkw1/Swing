package homework;

/**
 * created by wkw
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public Employee(String firstName,String lastName,
                    int socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract float earning();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return  "\n\t������" + lastName + firstName  +
                "\n\t��ᰲȫ�룺" + socialSecurityNumber+
                "\n\t���ʣ�"+ earning();
    }
}
