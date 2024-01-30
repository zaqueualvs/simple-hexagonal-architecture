package com.alves.backproduto.infrastructure.adapters.out.h2.adapters;

import com.alves.backproduto.application.ports.out.DeleteProductByIdPort;
import com.alves.backproduto.infrastructure.adapters.out.h2.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class DeleteProductByIdAdapter implements DeleteProductByIdPort {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}