public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double Payment1 = service.calculate( 1, 1_000_000);
        double Payment2 = service.calculate( 2, 1_000_000);
        double Payment3 = service.calculate( 3, 1_000_000);
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1 миллион, сроке 1 год, ставке 9.99% :");
        System.out.printf("%.0f",Payment1);
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1 миллион, сроке 2 года, ставке 9.99% :");
        System.out.printf("%.0f",Payment2);
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1 миллион, сроке 3 года, ставке 9.99% :");
        System.out.printf("%.0f",Payment3);
    }
}