public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 700);
        System.out.println(phone.weight + " " + phone.price);
        phone.dispalyValues();
        phone.discountMethod();
        phone.extraPrice(150);
        String parameters = phone.getParameters();
        System.out.println(parameters);
        phone.displayEvenNumbers(3, -10);
        phone.getEvenSum(5, 9);
    }
}

class MobilePhone {
    String weight;
    int price;
    int evenSum = 0;

    public MobilePhone(String weight, int price) {
        this.price = price;
        this.weight = weight;
    }

    public void dispalyValues() {
        System.out.println("Waga: " + this.weight + " cena: " + this.price);
    }

    public void discountMethod() {
        double discount = price - (0.1 * price);
        System.out.println("Cena po zniżce 10%: " + discount);
    }

    public void extraPrice(int extraPrice) {
        int suma = price + extraPrice;
        System.out.println("Wyższa kwota: " + suma);
    }

    public void checkPrice() {
        if (this.price > 550) {
            System.out.println("This phone is so expensive.");
        } else if (this.price < 200) {
            System.out.println("This is good price");
        }
    }

    // pętla dla licz parzystych
    public void displayEvenNumbers(int min, int max) {
        for (int i = min; i >= max; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }

        }
    }

    //rozkminic
    public void getEvenSum(int min, int max) {
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum);
    }

    public String getParameters() {
        return this.weight + " " + this.price;
    }
}