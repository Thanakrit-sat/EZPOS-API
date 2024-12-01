package ezpos.program.EZPOS.controller;

import ezpos.program.EZPOS.model.Product;
import ezpos.program.EZPOS.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllItems() {
        return productService.getAllItems();
    }

    @PostMapping
    public Product createItem(@RequestBody Product product) {
        return productService.createItem(product);
    }
}
