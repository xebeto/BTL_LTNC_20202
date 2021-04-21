package com.example.web_sell_fruit.converter;


import com.example.web_sell_fruit.entity.Category;
import com.example.web_sell_fruit.entity.Product;
import com.example.web_sell_fruit.models.ProductDTO;
import com.example.web_sell_fruit.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    private ModelMapper modelMapper;
    @Autowired
    private CategoryRepository categoryRepository;

    public ProductConverter() {
        modelMapper = new ModelMapper();
    }

    public ProductDTO toDTO(Product product) {
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);

        productDTO.setCategory(product.getCategory().getName());

        return productDTO;
    }

    public Product toEntity(ProductDTO productDTO) {
        Product product = modelMapper.map(productDTO, Product.class);

        Category category = categoryRepository.findByName(productDTO.getCategory());

        product.setCategory(category);

        return product;

    }
}
