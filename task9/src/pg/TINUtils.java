package pg;

public class TINUtils {
    public static void checkTIN(pg1 customer) throws TINNumberException {
        if(customer.getNumberTIN() < 100000000000L) {
            throw new TooShortTINNumberException("ИНН: " + customer.getNumberTIN()  + " слишком короткий");
        }
        else if(customer.getNumberTIN()  > 999999999999L) {
            throw new TooShortTINNumberException("ИНН: " + customer.getNumberTIN()  + " слишком длинный");
        }
        System.out.println("ИНН: " + customer.getNumberTIN()  + " принят!");
    }
}