package pool;

public class Funcionarios {
    private String name;
    private double salario;
    private String cargo;
    private int aumento;

    public void description(){
        System.out.println("olá "+ name +" seu salario é: " + salario + " seu cargo é: " + cargo + " seu aumento é de " +aumento );
    }

    public String getfuncionarios(){
        return name + cargo;
       
    }
    public double getsalario(){
        return salario;
    }

    public Funcionarios(String name, double salario, String cargo, int aumento){
    this.name = name;
    double calculo = salario * 10;
    double total = calculo/100;
    this.salario = total + salario;
    this.cargo = cargo;
    this.aumento = aumento;
    }
}
