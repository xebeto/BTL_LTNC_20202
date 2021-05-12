package com.example.web_sell_fruit.controller;

import com.example.web_sell_fruit.models.ProductDTO;
import com.example.web_sell_fruit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ViewProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/detailproduct/{id}")
    public String viewDetailProduct(HttpServletRequest request, @PathVariable("id") int id) {
        ProductDTO productDTO = productService.getById(id);

        request.setAttribute("product", productDTO);

        return "user/viewDetailProduct";
    }
}
