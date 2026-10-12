import pool.Funcionarios;    
public class App {
    public static void main(String[] args) throws Exception {
       Funcionarios funcionarios = new Funcionarios("Miguel Benevides", 1200, "programador java jr", 10);

       funcionarios.description();
    }
}
