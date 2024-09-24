package main;

public class Carro {
	    String modelo;
	    String cor;
	    String placa;
	    
	    Carro(String modelo, String cor, String placa){
	    	this.modelo = modelo;
	    	this.cor = cor;
	    	this.placa = placa;
	    }
	    
	}

	class Pessoa {
	    String nome;
	    Carro carro;
	    
		    Pessoa(String nome, Carro carro) {
	        this.nome = nome;
	        this.carro = carro;
	    }

	    void dirigir() {
	        System.out.println(nome + " está dirigindo o " + carro.modelo + ",da cor: " + carro.cor + ",da placa " + carro.placa);
	    }
	}

