import java.util.Scanner;

public class Cliente {
    private int c = 1;
    private String[][] cCliente = new String[c][6];
    Cliente(int iC){
        this.c = iC;
    }
    public void novocClient (int t){
        cCliente = new String[t][6];
        c = t;
    }

    public  String[][] setcCliente(int iC, String name, String cpf, String email,
                                   String cep, String endereco, String telefone) {
        if (1 <= iC) {
            String[][] novocClient = new String[c][6];
            for (int j = 0; j < cCliente.length; j++) {
                novocClient[j][0] = this.cCliente[j][0];
                novocClient[j][1] = this.cCliente[j][1];
                novocClient[j][2] = this.cCliente[j][2];
                novocClient[j][3] = this.cCliente[j][3];
                novocClient[j][4] = this.cCliente[j][4];
                novocClient[j][5] = this.cCliente[j][5];
            }
            this.novocClient(c);
            for (int j = 0; j < c; j++) {
                this. cCliente[j][0] = novocClient[j][0];
                this. cCliente[j][1] = novocClient[j][1];
                this.cCliente[j][2] = novocClient[j][2];
                this.cCliente[j][3] = novocClient[j][3];
                this.cCliente[j][4] = novocClient[j][4];
                this.cCliente[j][5] = novocClient[j][5];
            }
            this.cCliente[iC][0] = name;
            this.cCliente[iC][1] = cpf;
            this.cCliente[iC][2] = email;
            this.cCliente[iC][3] = cep;
            this.cCliente[iC][4] = endereco;
            this.cCliente[iC][5] = telefone;
            c = c + 1;
        }else {
            cCliente[iC][0] = name;
            cCliente[iC][1] = cpf;
            cCliente[iC][2] = email;
            cCliente[iC][3] = cep;
            cCliente[iC][4] = endereco;
            cCliente[iC][5] = telefone;
            c = c + 1;
        }
        return this.cCliente;


    }

    public String[][] getcCliente() {
        return cCliente;
    }



    public String listCliente (String name){
        String trueName = "";
        for (int i = 0; i < c; i++) {
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
