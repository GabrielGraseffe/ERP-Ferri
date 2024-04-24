import java.util.Scanner;

public class Cliente {
    private int iC = 1;
    private String[][] cCliente = new String[iC][6];
    Cliente(int iC){
        this.iC = iC;
    }
    Scanner scanner = new Scanner(System.in);

    public  String[][] setcCliente(int iC, int i, String dado) {
        String novoDado = dado;
        cCliente[iC][i] = novoDado;
        return cCliente;
    }

    public String[][] getcCliente() {
        return cCliente;
    }



    public String listCliente (String name){
        String trueName = "";
        for (int i = 0; i < iC; i++) {
            trueName = cCliente[i][0];
            if (name.equals(trueName)){
                return trueName;
            }else {
                trueName = "Sem cadastro";
            }
        }
        return trueName;
    }
}
