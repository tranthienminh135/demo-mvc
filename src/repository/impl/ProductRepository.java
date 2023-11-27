package repository.impl;

import model.Product;
import repository.IProductRepository;
import service.FileService;

import java.util.List;

public class ProductRepository implements IProductRepository {

    private final String STUDENT_PATH_FILE = "src/data/product.csv";

    @Override
    public void save(Product product) {
        List<Product> products = FileService.readProduct(STUDENT_PATH_FILE);
        products.add(product);
        FileService.writeProduct(STUDENT_PATH_FILE, products);
    }

    @Override
    public List<Product> findAll() {
        return FileService.readProduct(STUDENT_PATH_FILE);
    }
}
