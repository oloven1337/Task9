package pg;

public class TestPurchaseOnline {
    public static void main(String[] args) {
        pg1 customer = new pg1("Рассел", 12345);
        try {
            TINUtils.checkTIN(customer);
        }
        catch (TINNumberException e) {
            System.out.println("Вы ввели неверный ИНН");
            System.out.println(e.getMessage());
        }
    }
}