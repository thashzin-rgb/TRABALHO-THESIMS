package com.mycompany.main;

import java.util.ArrayList;
public class BancoDeEmprego {
    
    private ArrayList<Trabalho> vagas;
    
    public BancoDeEmprego(){
    
        vagas = new ArrayList<>();
        
        vagas.add(new Trabalho(1, "Programador", 4000, 15));
        vagas.add(new Trabalho(2, "Repositor", 2500, 20));
        vagas.add(new Trabalho(3, "Vendedor", 3500, 20));
        vagas.add(new Trabalho(4, "Médico", 5000, 15));
        vagas.add(new Trabalho(5, "Professor", 3000, 15));
        
    
    }
    
    /* método para pegar uma lista SÒ dos nomes dos empregos */

    public ArrayList<String> listarNomesTrabalho(){
        
        ArrayList<String> nomes = new ArrayList<>();
    
        for (Trabalho e: vagas){
        nomes.add(e.getNome());
        
            
        }
         return nomes;
    }
    
    public Trabalho buscarPorId(int id){
    
        for (Trabalho e: vagas){
        
         if(e.getIdTrabalho() == id){
             return e;
         }
        }
        
     return null;
    }
    
    
    public void pedirDemissao(JogadorSimulacao jogador){
        
       jogador.setEmpregoAtual(null);

       System.out.println("Você pediu demissão");
    
    }

    
    
    
}
