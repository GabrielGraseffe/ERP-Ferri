import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Produto {
    private int p = 1;
    private String[][] cProduto = new String[p][2];

    Produto(int p) {
        this.p = p;
    }

    public String[][] setcProduto(int iP, int i, String dado) {
        String novoDado = dado;
        this.cProduto[iP][i] = novoDado;
        p = p + 1;
        return this.cProduto;
    }

    public String[][] getcProduto() {
        return cProduto;
    }

    public String[][] listProduto() {
        for (int i = 0; i < cProduto.length; i++) {
            System.out.println("Produto " + i);
            System.out.println(cProduto[i][0]);
            System.out.println("R$" + cProduto[i][1]);
            System.out.println(); // Nova linha após cada linha do array
        }
        return this.cProduto;
    }
}









