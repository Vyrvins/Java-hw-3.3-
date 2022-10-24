public class CreditPaymentService {
    //вводим переменные, где y - срок кредита в годах, s - сумма кредита
    // r - 0,008325 - ежемесячная кредитная ставка рассчитывается = 9,99/100/12
    //рассчитываем ежемесячный платеж по формуле
    //P=S*(R*(1+R)^Y*12)/((1+R)^Y*12-1)
    public double calculate(int y, int s){
        double result;
        result = s*(0.008325*Math.pow(1+0.008325,y*12))/(Math.pow(1+0.008325,y*12)-1);
        return result;
    }
}
