package escola;
import pool.Aluno;
import java.util.Scanner;
import java.util.ArrayList;
public class Escola {
    
ArrayList<Aluno> alunos = new ArrayList<>();

   
    public void alunos(){
        try{
    Scanner scanner  = new Scanner(System.in);

    System.out.println("Qual o nome do aluno? ");
    String name = scanner.nextLine();

    System.out.println("Qual a nota do aluno?");
    double nota = scanner.nextDouble();
        if(nota > 10 || nota < 0){
              System.out.print("Nota invalida");
              return;
        }

    System.out.println("Qual a segunda nota do aluno?");
    double nota2 = scanner.nextDouble();
     if(nota2 > 10 || nota2 < 0){
            System.out.print("Nota invalida");
            return;
        }
    scanner.nextLine();
    Aluno aluno = new Aluno(name, nota, nota2);
    alunos.add(aluno);
    }catch(java.util.InputMismatchException e){
System.err.print("Erro ao colocar nota " + e);
    }
    }
    
    public void getaluno(){
       
        for(Aluno aluno: alunos){
            System.out.print("O nome do aluno é: " + aluno.getname() + "E a nota é: " + aluno.getnota());
        }
       
    }
    public void rep(){
        try{
    Scanner scanner  = new Scanner(System.in);
    System.out.print(" Mais algum aluno para colocar nota?");
    String condicao = scanner.nextLine();
    
    while (condicao.equalsIgnoreCase("sim")) {
        alunos();
        System.out.print("Quer continuar? ");
        condicao = scanner.nextLine();
    }
    }catch(Exception e){
        System.err.print(("Erro ao fazer repetição " + e));
    }
    }

    public Escola(){
        alunos();
        rep();
        getaluno();
    }
     
}
