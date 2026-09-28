public class ElectronicProduct extends Product implements Discountable {

    private int warrantyMonths;

    // Constructor kế thừa từ Product
    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    // Ghi đè phương thức tính giá cuối cùng có tính VAT 10%
    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }

    // Triển khai phương thức giảm giá trực tiếp vào price
    @Override
    public void applyDiscount(double percent) {
        double currentPrice = getPrice();
        double discountAmount = currentPrice * (percent / 100.0);
        setPrice(currentPrice - discountAmount);
    }
}