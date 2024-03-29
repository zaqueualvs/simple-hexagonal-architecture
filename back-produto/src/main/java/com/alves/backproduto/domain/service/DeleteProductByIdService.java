package com.alves.backproduto.domain.service;

import com.alves.backproduto.application.ports.in.DeleteProductByIdUseCase;
import com.alves.backproduto.application.ports.in.FindProductByIdUseCase;
import com.alves.backproduto.application.ports.out.DeleteProductByIdPort;
import com.alves.backproduto.commons.customannotations.UseCase;
import com.alves.backproduto.domain.model.Product;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class DeleteProductByIdService implements DeleteProductByIdUseCase {

    private final DeleteProductByIdPort deleteProductByIdPort;
    private final FindProductByIdUseCase findProductByIdUseCase;

    @Override
    public void deleteById(Long id) {
        Product product = findProductByIdUseCase.findById(id);
        deleteProductByIdPort.deleteById(product.getId());
    }
}
