package ProjectBackEnd.backend.DTO;

public class CartDTO {
    private Long userId;
    private Long productId;
    private int quantity;
    private Long addOnsId;
    private double totalAmount;
    private int sugarLevel;
    private String cupSize;

    CartDTO(){}

    

    public CartDTO(Long userId, Long productId, int quantity, Long addOnsId, double totalAmount, int sugarLevel,
            String cupSize) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.addOnsId = addOnsId;
        this.totalAmount = totalAmount;
        this.sugarLevel = sugarLevel;
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



    public Long getAddOnsId() {
        return addOnsId;
    }



    public void setAddOnsId(Long addOnsId) {
        this.addOnsId = addOnsId;
    }



    public double getTotalAmount() {
        return totalAmount;
    }



    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
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



    public Long getProductId() {
        return productId;
    }



    public void setProductId(Long productId) {
        this.productId = productId;
    }



    
}
