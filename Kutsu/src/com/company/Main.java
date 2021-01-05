package com.company;
public class Main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
        //Catalogo catalogo = new Catalogo(listaDeProdutos.getProdutosInfo());
    }

}

