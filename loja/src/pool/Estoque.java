package pool;
import java.util.ArrayList;
import java.util.Scanner;
public class Estoque {
ArrayList<String> produtos = new ArrayList<>();
public void adionarproduto(){
 Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu produto: ");
    String produtosad = scanner.nextLine();
    produtos.add(produtosad);
}
public void setproducts(){
Scanner scanner = new Scanner(System.in);
    String condicao = "sim";

    while(condicao.equalsIgnoreCase("sim")){
        System.out.print("quer adicionar outro produto? ");
        condicao = scanner.nextLine();

        if(condicao.equalsIgnoreCase("sim")){
           adionarproduto();
        }
        else{
            System.out.println("saiu");
        }
    }
}
public void getproducts(){
System.out.println(produtos);
}

public Estoque(){
    adionarproduto();
    setproducts();
    
}
}

