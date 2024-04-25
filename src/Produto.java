import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Produto {
    private int p = 1;
    private String[][] cProduto = new String[p][2];

    Produto(int p) {
        this.p = p;
    }

    public void novocProduto (int t){
        cProduto = new String[t][2];
        p = t;
    }

    public String[][] setcProduto(int iP, String nome, String preco) {
        if (1 <= iP) {
            String[][] novocProd = new String[p][2];
            for (int j = 0; j < cProduto.length; j++) {
                novocProd[j][0] = this.cProduto[j][0];
                novocProd[j][1] = this.cProduto[j][1];
            }
            this.novocProduto(p);
            for (int j = 0; j < p; j++) {
                this.cProduto[j][0] = novocProd[j][0];
                this.cProduto[j][1] = novocProd[j][1];
            }
            this.cProduto[iP][0] = nome;
            this.cProduto[iP][1] = preco;
            p = p + 1;
        }else {
            this.cProduto[iP][0] = nome;
            this.cProduto[iP][1] = preco;
            p = p + 1;
        }
        return this.cProduto;
    }


    public String[][] getcProduto() {
        return cProduto;
    }

    //Gera um print de todos os produtos do Array
    public String[][] listProduto() {
        for (int i = 0; i < cProduto.length; i++) {
            int p = i+1;
            System.out.println("Produto " + p);
            System.out.println(cProduto[i][0]);
            System.out.println("R$" + cProduto[i][1]);
            System.out.println(); // Nova linha após cada linha do array
        }
        return this.cProduto;
    }
}









