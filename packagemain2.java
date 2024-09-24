package main;



public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota","Azul","XXX-0001");
        Pessoa pessoa = new Pessoa("João", meuCarro);
        pessoa.dirigir();
    }
}