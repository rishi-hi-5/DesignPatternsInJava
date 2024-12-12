package Structural.facade.with;


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

class ShoppingFacade {
    Authentication authentication;
    ProductCatalog productCatalog;
    Payment payment;

    public ShoppingFacade(){
        authentication = new Authentication();
        productCatalog = new ProductCatalog();
        payment = new Payment();
    }

    public void purchaseProduct(String userName, String password, String productId, double amount) {
        Authentication authentication = new Authentication();
        ProductCatalog productCatalog = new ProductCatalog();
        Payment payment = new Payment();

        authentication.authenticateUser(userName,password);
        productCatalog.getProduct(productId);
        payment.makePayment(amount);
    }
}

public class Runner {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.purchaseProduct("Akash","akash123","1234",200);

        shoppingFacade.purchaseProduct("Pritesh","Prit12","4443",500);
    }
}