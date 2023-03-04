public class Customer {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String primaryMobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.getFirstName();
        this.middleName = customerBuilder.getMiddleName();
        this.lastName = customerBuilder.getLastName();
        this.primaryEmail = customerBuilder.getPrimaryEmail();
        this.primaryMobileNumber = customerBuilder.getPrimaryMobileNumber();


    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", primaryMobileNumber='" + primaryMobileNumber + '\'' +
                '}';
    }
}
