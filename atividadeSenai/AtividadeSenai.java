package atividadeSenai;

import java.util.Scanner;

import estudos.Entities;


public class AtividadeSenai {

	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    Entities calculo = new Entities();
    calculo.quantidade(sc);
   
    sc.close();
	
	}
}
