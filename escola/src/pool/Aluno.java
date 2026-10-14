package pool;

public class Aluno {
    private String  name;
    private double  nota;
    private double  nota2;


    public String getname(){
        return name;
    }

    public double getnota(){
        double res = nota + nota2;
        return res/2;
    }
    public Aluno(String name, double nota, double nota2){
        this.name = name;
        this.nota = nota;
        this.nota2 = nota2;
    }
}
