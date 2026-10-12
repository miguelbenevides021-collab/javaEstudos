import banco.Contabancaria;

public class App{
    public static void main(String[] args){
       Contabancaria conta = new Contabancaria();

       conta.settitular("Miguel Benevides");
       conta.setsaldo(100);
       conta.setdepositar();
       conta.conta();
    }   
    
}