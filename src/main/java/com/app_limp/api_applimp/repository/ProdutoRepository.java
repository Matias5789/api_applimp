package com.app_limp.api_applimp.repository;

import com.app_limp.api_applimp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
