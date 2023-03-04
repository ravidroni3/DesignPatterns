public interface ICustomerBuilder {
   ICustomerBuilder  firstName(String firstName);
   ICustomerBuilder middleName(String middleName);
   ICustomerBuilder lastName(String lastName);
   ICustomerBuilder primaryEmail(String primaryEmail);
   ICustomerBuilder primaryMobileNumber(String primaryMobileNumber);

   Customer build();
}
