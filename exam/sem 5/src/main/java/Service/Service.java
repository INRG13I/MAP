package Service;

import Domain.Product;
import Domain.Product;
import Domain.Rent;
import Repository.AbstractRepository;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;


public class Service {
    AbstractRepository<Product> productRepository;


    public Service(AbstractRepository<Product> productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String brand, String name, Integer price, Integer quantity) {


        productRepository.add(new Product(getMinId(),brand,name,price,quantity));
    }


    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }


    public void updateProduct(Integer id, Product entity) {
        productRepository.update(id, entity);
    }


    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> products=productRepository.getAll();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product lhs, Product rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs.getId() > rhs.getId() ? -1 : (lhs.getId() < rhs.getId()) ? 1 : 0;
            }
        });
        Collections.reverse(products);
        return new ArrayList<>(productRepository.getAll());
    }

    public ArrayList<Product> filter(String string) throws Exception {
        ArrayList<Product> products = new ArrayList<>();

        for(Product product:productRepository.getAll()){
            if(product.getName().contains(string)||product.getBrand().contains(string)){
                products.add(product);
            }
        }

        if(products.size()==0){
            throw new Exception("No good");
        }

        return products;
    }


    private Integer getMinId() {

        Integer id = 1;

        for(Product product:productRepository.getAll()){
            if(product.getId()>id){
                id=product.getId();
            }
        }

        return id+1;
    }


}
