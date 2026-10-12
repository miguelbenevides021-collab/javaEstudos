package poo;
public class Pessoa {
    String nome;
    int idade;
    public void apresentar(){
        System.out.println("olá eu sou "+ nome +" e tenho " + idade);
    }

    public String getname(){
        return nome;
    }

    public void setname(String nome){
        this.nome = nome;
    }

    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
}
