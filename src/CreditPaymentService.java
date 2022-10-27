public class CreditPaymentService {
    //вводим переменные, где creditPeriodYears - срок кредита в годах, amount - сумма кредита
    // rate - 0,008325 - ежемесячная кредитная ставка рассчитывается = 9,99/100/12
    //рассчитываем ежемесячный платеж по формуле
    //Payment=amountOfCredit*(rate*(1+rate)^creditPeriodYears*12)/((1+rate)^creditPeriodYears*12-1)
    public double calculate(int creditPeriodYears, int amount) {
        double result;
        result = amount * (0.008325 * Math.pow(1 + 0.008325, creditPeriodYears * 12)) / (Math.pow(1 + 0.008325, creditPeriodYears * 12) - 1);
        return result;
    }
}
