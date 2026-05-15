package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BancoDeEmprego bancoEmprego = new BancoDeEmprego();
        JogadorSimulacao jogador = new JogadorSimulacao();
        
        boolean loop = true;
        
        while(loop) {
            
            if(!jogador.isEmpregoAtual()) {
            System.out.println("\n1--Procurar Emprego");
            }
            if(jogador.isEmpregoAtual() ){
            System.out.println("\n1--Se Demitir");
            
          
            }
            System.out.println("2--Status");
            System.out.println("3--SAIR");
            if(jogador.isEmpregoAtual()){

            System.out.println("4--Trabalhar");
            
            }

            if(jogador.isEmpregoAtual()){

                System.out.println("5--Fazer Hora Extra");
                
                
                
            }
            
            
            int escolha = scan.nextInt();
            
            if(escolha == 1 && jogador.isEmpregoAtual()) {
                
                bancoEmprego.pedirDemissao(jogador);
                continue;
                
            }

            if(escolha == 4 && jogador.isEmpregoAtual()){
               
                    jogador.getEmpregoAtual().trabalhar(jogador);;
                
            }

            if(escolha == 5 && jogador.isEmpregoAtual()){

                jogador.getEmpregoAtual().fazerHoraExtra(jogador);
            }
            
            switch (escolha) {
                case 1: 
                    System.out.println("\n1--Programador");
                    System.out.println("2--Repositor");
                    System.out.println("3--Vendedor");
                    System.out.println("4--Voltar\n");
                    
                    escolha = scan.nextInt();
                    switch (escolha){
                        
                        case 1: 
                            BancoDeEmprego banco = new BancoDeEmprego();
                            Trabalho emprego = banco.buscarPorId(escolha);
                            
                            System.out.println("Profissão: "+ emprego.getNome());
                            System.out.println("Salário: " + emprego.getSalario());
                           
                            System.out.println("\n1--Agendar Entrevista"); 
                            System.out.println("2--voltar\n");
                            
                            escolha = scan.nextInt();
                            
                            switch(escolha){
                                
                                case 1: emprego.marcarEntrevista(jogador);
                                    break;
                                case 2: 
                                    break;
                            
                            }
                            
                            break;
                            
                        case 2: 
                            break;
                        case 3: 
                            break;
                        case 4: 
                            break;
                    
                    }
                    break;
                case 2:  
                    jogador.status();
                    break;
                case 3: loop = false; break;
            }
            
        }
    }
}
