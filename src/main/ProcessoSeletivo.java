package main;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import models.Candidato;

public class ProcessoSeletivo {	
	static double salaryCandidate;
	static String nameCandidate;
	static String continueProcess = "S";

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Candidato> listCandidate = new ArrayList<Candidato>();
		try {
			
			do {
				System.out.println("Olá, sou da empresa WILLDEV e gostaria que  você preenchesse o formulário do processo seletivo");
				System.out.println("Digite seu nome completo: ");
				nameCandidate = scan.next();
				
				System.out.println("Digite sua pretensão de de salário R$");
				salaryCandidate = scan.nextDouble();
				
				Candidato candidate = new Candidato(nameCandidate.toUpperCase(), salaryCandidate);
				
				listCandidate.add(candidate);
				
				System.out.println("Deseja continuar ? tecle 'S' - sim | tecle 'N' - nao");
				continueProcess = scan.next();
				System.out.println();
			} while (
					continueProcess.substring(0,1).toUpperCase().equals("S") ||
					continueProcess.substring(0,1).toUpperCase().equals("Y"));
			
			for (Candidato candidate:listCandidate) {
				answerCandidate(candidate);
			}
		} catch(InputMismatchException e) {
			System.out.println("Os dados inseridos estão incorretos!");
			System.out.println("Prencha salário assim: 1000.00");
			System.out.println("Utilize apenas letras maiúsculas para seu nome");
		}
		
	}
	
	private static void answerCandidate(Candidato candidate) {
		System.out.println(candidate.toString());
		if (2000 > candidate.getIntendedSalary()) {
			System.out.println("TELL TO CANDIDATE.");
		} else if (2000 == candidate.getIntendedSalary()) {
			System.out.println("TELL TO CANDIDATE WITH COUNTER PROPOSAL.");
		} else {			
			System.out.println("WAITING ANSWER OTHER CANDIDATES");
		}
		System.out.println();
	}

}
