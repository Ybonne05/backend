package ProjectBackEnd.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    private @Id
    @GeneratedValue Long productId;
    private String productName;
    private String description;
    private String url;
    
    Product(){}

    public Product(String productName, String description, String url) {
        this.productName = productName;
        this.description = description;
        this.url = url;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

       public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}

