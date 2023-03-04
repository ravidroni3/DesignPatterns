public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("ravi")
                .middleName("kumar")
                .lastName("dhroni")
                .primaryEmail("ravi@gmail.com")
                .primaryMobileNumber("1234567890")
                .build();
        System.out.println(customer.toString());
    }
}