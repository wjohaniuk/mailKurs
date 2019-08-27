public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 700);
        System.out.println(phone.weight + " " + phone.price);
        phone.dispalyValues();
        phone.discountMethod();
        String parameters = phone.getParameters();
        System.out.println(parameters);
    }
}

class MobilePhone {
    String weight;
    int price;

    public MobilePhone(String weight, int price) {
        this.price = price;
        this.weight = weight;
    }

    public void dispalyValues() {
        System.out.println("Waga: "  + this.weight + " cena: " + this.price);
    }

    public void discountMethod(){
        double discount = price - (0.1 * price);
        System.out.println("Cena po zniżce 10%: " + discount);
    }

    public String getParameters() {
        return this.weight + " " + this.price;
    }
}