package ProjectBackEnd.backend.Model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Cart {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long cartId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_cart",
        joinColumns = 
        {@JoinColumn(name = "cart_Id", referencedColumnName = "cartId")},
        inverseJoinColumns = 
        {@JoinColumn(name = "product_Id", referencedColumnName = "productId")})
        private Set<Product> product;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "addons_cart",
        joinColumns = 
        {@JoinColumn(name = "cart_Id", referencedColumnName = "cartId")},
        inverseJoinColumns = 
        {@JoinColumn(name = "addOns_Id", referencedColumnName = "addOnsId")})
        private Set<AddOns> addOns;
    private int sugarLevel;
    private String cupSize;
    private Long userId;
    private int quantity;
    private double totalAmount;
    
    public Cart(){}

    public Cart(int sugarLevel, String cupSize, Long userId, int quantity, double totalAmount) {
        this.sugarLevel = sugarLevel;
        this.cupSize = cupSize;
        this.userId = userId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }
    public Long getCartId() {
        return cartId;
    }
    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
    public Set<Product> getProduct() {
        return product;
    }
    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public Set<AddOns> getAddOns() {
        return addOns;
    }

    public void setAddOns(Set<AddOns> addOns) {
        this.addOns = addOns;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }



}