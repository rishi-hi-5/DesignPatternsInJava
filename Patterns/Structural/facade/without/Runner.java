package Structural.facade.without;

// payment
// product catalog
// authentication

class Authentication{
    public void authenticateUser(String userName, String password){
        System.out.println("Authenticating user with username"+userName);
    }
}

class ProductCatalog{
    public void getProduct(String productId){
        System.out.println("Fetching details of product with product id "+productId);
    }
}

class Payment{
    public void makePayment(double amount){
        System.out.println("Processing payment of Rs "+amount);
    }
}


public class Runner {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();
        ProductCatalog productCatalog = new ProductCatalog();
        Payment payment = new Payment();

        authentication.authenticateUser("akash","akash123");
        productCatalog.getProduct("1234");
        payment.makePayment(200);
    }
}
