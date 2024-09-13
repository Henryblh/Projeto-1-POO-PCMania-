public class SistemaOperacional {
    String nome;
    int bits;
    int tipo;

    SistemaOperacional(int tipo) {
        this.tipo = tipo;
        switch (tipo){
            case 1:
                this.nome = "Sistema Operacional Linux Ubuntu";
                this.bits = 32;
                break;
            case 2:
                this.nome = "Sistema Operacional Windows 8";
                this.bits = 64;
                break;
            case 3:
                this.nome = "Sistema Operacional Windows 10";
                this.bits = 64;
                break;
        }
    }
}
