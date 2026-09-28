import java.util.ArrayList;
import java.util.List;

public class ProductInventory {

    private List<Product> products;

    // Constructor khởi tạo danh sách
    public ProductInventory() {
        this.products = new ArrayList<>();
    }

    // Thêm sản phẩm
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    // Xóa sản phẩm theo ID
    public boolean removeProduct(String id) {
        return products.removeIf(p -> p.getId().equals(id));
    }

    // Tìm kiếm sản phẩm theo tên
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    // Tính tổng giá trị kho hàng
    public double calculateTotalValue() {
        double total = 0.0;
        for (Product p : products) {
            total += p.calculateFinalPrice();
        }
        return total;
    }
}