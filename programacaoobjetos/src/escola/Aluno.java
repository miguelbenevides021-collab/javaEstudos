package escola;

public class Aluno {
    private String name;
    private double nota1;
    private double nota2;

   
    public String getaluno(){
        return name;
    }

    public double getnota(){
        if(nota1 < 0 || nota2 < 0 ){
            System.out.println("Nota invalida");
            return -1;
        }
        else if(nota1 > 10 || nota2 >10){
            System.out.println("Numero muito grande");
            return -1;
        }
        else{
        double total = nota1 + nota2;
        return total / 2;
        }
        
    }
    public Aluno(String name, double nota1, double nota2){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

     public void detalhes(){
        System.out.println("o aluno é: " + name + " a média é: " + getnota());
    }

}
