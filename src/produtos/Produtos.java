package produtos;

public class Produtos {
    private String nomeProduct;
    private double precoProduct;
    private int    quantidadeDeEstoque;

    public void mostrarProdutos(){
        System.out.println("nome do produto:  "+ nomeProduct + " preço do produto: " + precoProduct + " quantidade em estoque: " + quantidadeDeEstoque);
    }

    public String getproduct(){
        
        return nomeProduct;
    }

    public void setnameproduct(String nomeProduct){
        this.nomeProduct = nomeProduct;
    }

    public double getprecoproduct(){
       
        return precoProduct;
    }

    public void setprecoproduct(double precoProduct){
         if(precoProduct < 0){
            System.out.println("Preço invalido");
        }
        else{ 
        this.precoProduct = precoProduct;
        }
    }

    public int getquantidade(){

        return quantidadeDeEstoque;
    }

    public void setquantidade(int quantidadeDeEstoque){
         if(quantidadeDeEstoque < 0){
            System.out.println("QUantidade invalida");
        }
        else{ 
        this.quantidadeDeEstoque = quantidadeDeEstoque;
        }
    }
}
