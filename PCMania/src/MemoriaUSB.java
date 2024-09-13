public class MemoriaUSB {
    String nome;
    int capacidade;

    MemoriaUSB(int tipo) {
        switch (tipo){
            case 1:
                this.nome = "Pen-drive";
                this.capacidade = 16;
                break;
            case 2:
                this.nome   = "Pen-drive";
                this.capacidade = 32;
                break;
            case 3:

                this.nome = "HD externo";
                this.capacidade = 1024;
                break;
        }
    }
}