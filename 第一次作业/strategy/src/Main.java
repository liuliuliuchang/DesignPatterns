public class Main {
    public static void main(String[] args) {
        // 创建购物车
        ShoppingCart cart = new ShoppingCart();

        // 使用信用卡支付
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100.0);

        // 使用 PayPal 支付
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(200.0);

        // 使用比特币支付
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(300.0);
    }}