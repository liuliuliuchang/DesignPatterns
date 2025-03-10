// 定义支付策略接口
interface PaymentStrategy {
    void pay(double amount);
}

// 具体策略：信用卡支付
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber + " (" + name + ")");
    }
}