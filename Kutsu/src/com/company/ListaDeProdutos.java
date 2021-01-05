package com.company;

import java.util.HashMap;

public class ListaDeProdutos {
    HashMap<String, String> Produtos = new HashMap<String, String>();

    ListaDeProdutos(){
        Produtos.put("Nike", "20.0");
        Produtos.put("Adidas", "24.5");
        Produtos.put("Panther", "30.7");
        Produtos.put("Comfort", "28.0");
        Produtos.put("Diesel", "30.0");
        Produtos.put("GAP", "15.0");

    }
    protected HashMap getProdutosInfo () {
            return Produtos;


    }
}

