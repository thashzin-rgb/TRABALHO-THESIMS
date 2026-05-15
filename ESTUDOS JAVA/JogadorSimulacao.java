package com.mycompany.main;

public class JogadorSimulacao {

    private static String nome = "Arthur";
    private static int idade = 19;
    private static double energiaAtual = 100;
    private static Trabalho empregoAtual;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getenergiaAtual() {
        return energiaAtual;
    }

    public Trabalho getEmpregoAtual() {
    return empregoAtual;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual != null;
    }



    /*
     * public JogadorSimulacao(String nome, int idade, int energia, boolean
     * emprego){
     * 
     * this.nome = nome;
     * this.idade = idade;
     * this.energia = energia;
     * this.emprego = emprego;
     * 
     * } Construtor pré feito
     */

    public void status() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energiaAtual);
        

        if (empregoAtual != null) {

            System.out.println("Emprego: " + empregoAtual.getNome());
            System.out.println("Salário: " + empregoAtual.getSalario());
        }else{

            System.out.println("Emprego: Desempregado");
        }

    }

    public static void setNome(String nome) {
        JogadorSimulacao.nome = nome;
    }

    public static void setIdade(int idade) {
        JogadorSimulacao.idade = idade;
    }

    public static void setEnergia(double energiaAtual) {
        JogadorSimulacao.energiaAtual = energiaAtual;
    }

    public static void setEmpregoAtual(Trabalho emprego) {
        JogadorSimulacao.empregoAtual = emprego;
    }



}
