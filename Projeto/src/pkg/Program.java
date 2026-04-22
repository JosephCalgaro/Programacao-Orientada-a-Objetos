package pkg;

import java.util.Scanner; //import scanner


public class Program{

    public static void main(String[] args){
        System.out.println("Testando sem contrabarra  n");
        System.out.println("Ola pessoall");
        int idade;
        idade = 18;
        System.out.println("A idade é "+idade);
        
        System.out.println("O individuo tem " +idade+ " anos");
        
        char c = 'r';
        
        System.out.println("O char: "+ c);
        
        float f = 3.14f;// valor float deve ser indicado no final com 'f'
        
        System.out.println("O float: "+f);
        
        double d = 3.141516;
        
        System.out.println("O double: "+d);
        
        String nome;
        Scanner teclado = new Scanner(System.in); //scanner parecido com scanf no c
        
        nome = teclado.nextLine(); // valor lido por 'tecldo.nextLine()' possui variações para cada tipo de valor
        
        System.out.println("O nome digitado: "+nome);
        
        int num;
        num = teclado.nextInt();
        System.out.println("O numero inteiro digitado é "+num);
       
        
        if(idade>=18) { //operadores logicos iguais ao c
        	
        	System.out.println("Maior de idade");
        }else {
        	System.out.println("Menor de idade");
        }
        
        int opcao;
        System.out.println("Escolha uma opção: ");
        System.out.println("1. cadastrar...");
        System.out.println("2. consultar...");
        System.out.println("3. sair");
        opcao = teclado.nextInt();
        
        switch(opcao) {
        case 1:
        	System.out.println("cadastro...");
        	break;
        case 2:
        	System.out.println("Consulta...");
        	break;
        case 3:
        	System.out.println("Sair...");
        	break;
        }
        
        }
}