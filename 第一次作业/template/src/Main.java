public class Main {
    public static void main(String[] args) {
        System.out.println("Making coffee:");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println("\nMaking tea:");
        Beverage tea = new Tea();
        tea.prepareBeverage();
    }
}