package banco;
import java.util.Scanner;
public class Contabancaria {
    private String titular;
    private double saldo;
    private double depositar;

    public void conta(){
        System.out.println(titular + " seu saldo é: "+ saldo + " voce depositou "+ depositar);
    }

    public String getTitular(){
        return titular;
    }

    public void settitular(String titular){
        this.titular = titular;
    }

    public double getsaldo(){
        
        return saldo;
    }

    public void setsaldo(double saldobancario){
        
        this.saldo = saldobancario;
    }

    public double getdepositar(){
        return depositar;
    }

    public void setdepositar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quanto depositar?: ");
        double depositarsaldo = scanner.nextDouble();
        if(depositarsaldo <= 0){
            System.err.println("Deposito invalido");
        }
        else{
        depositar = depositarsaldo;
        }

        scanner.close();

    }
}
