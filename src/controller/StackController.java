package controller;

import stackStrings.StackStrings;

public abstract class StackController {

	public static void execute() throws Exception {
		String[] vetor = { "J", "G", "R", "B", "H", "L", "W" };

		StackStrings pilha = new StackStrings();
		StackStrings pilha2 = new StackStrings();
		
		for (String i : vetor) {
			pilha.push(i);
		}
		
		while (!pilha.isEmpty()) {
			String aux = pilha.pop();
			
			if (aux.contains("R") || aux.contains("W")) {
				System.out.println(aux + " ");
			} else {
				pilha2.push(aux);
			}
		}
		
		System.out.println("\n");

		while (!pilha2.isEmpty()) {
			System.out.print(pilha2.pop() + "  ");
		}
	}

}
