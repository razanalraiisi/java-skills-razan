public class shoppingCart {
    public static double calculateTotal(double[] prices, String customerType) {
        double total = 0;


        for (double price = 0) {
            total += price;
        }


        switch (customerType) {
            case "regular":

                break;
            case "premium":
                total *= 0.90;
                break;
            case "VIP":
                total *= 0.80;
                break;
            default:
                System.out.println("Invalid customer type.");
                break;
        }

        return total;
    }


    public static double findMostExpensive(double[] prices) {
        if (prices.length == 0) return 0;

        double max = prices[0];

        for (double price : prices) {
            if (price > max) {
                max = price;
            }
        }

        return max;
    }


    public static int countExpensiveItems(double[] prices, double threshold) {
        int count = 0;

        for (double price : prices) {
            if (price > threshold) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};


        System.out.println("Regular customer total: " + calculateTotal(cart, "regular"));
        System.out.println("Premium customer total: " + calculateTotal(cart, "premium"));
        System.out.println("VIP customer total: " + calculateTotal(cart, "VIP"));


        double maxItem = findMostExpensive(cart);
        System.out.println("Most expensive item: " + maxItem);


        int expensiveCount = countExpensiveItems(cart, 30);
        System.out.println("Items over 30: " + expensiveCount);
    }
}
