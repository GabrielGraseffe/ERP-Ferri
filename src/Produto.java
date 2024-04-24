import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Produto {
    private int iP = 1;
    String[][] cProduto = new String [iP][2];
    Produto (int iP) {
    this.iP = iP;
    }




    public String[][] cProduto(int iP, int i, String dado){
            String pDado = dado;
               cProduto[iP][i] = pDado;
               return cProduto;
    }
    /*public void listProduct (int iP){
        System.out.println("Produtos disponiveis:");
        for( int i = 0; i <= iP; i++){
            System.out.println("Produto " + cProduto(i, 0));
            System.out.println("Preço R$" + cProduto(i, 1));
            }*/

        }







