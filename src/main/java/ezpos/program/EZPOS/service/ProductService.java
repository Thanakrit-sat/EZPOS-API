package ezpos.program.EZPOS.service;

import ezpos.program.EZPOS.model.Product;
import ezpos.program.EZPOS.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllItems() {
        return productRepository.findAll();
    }

    public Product createItem(Product product) {
        return productRepository.save(product);
    }
}
