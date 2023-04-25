import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
            "Believe you can and you're halfway there. -Theodore Roosevelt",
            "The only way to do great work is to love what you do. -Steve Jobs",
            "If you can dream it, you can achieve it. -Zig Ziglar",
            "Strive not to be a success, but rather to be of value. -Albert Einstein",
            "I have not failed. I've just found 10,000 ways that won't work. -Thomas Edison"
        };
        
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        String selectedQuote = quotes[index];
        System.out.println(selectedQuote);
    }
}
