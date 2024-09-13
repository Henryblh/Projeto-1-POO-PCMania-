    public class HardwareBasico {
        String nome;
        float capacidade;

        HardwareBasico(int tipo) {
            switch (tipo){
                case 1:
                    this.nome = "Pentium Core i3 (2200 Mhz)";
                    this.capacidade = 500;
                    break;
                case 2:
                    this.nome   = "Pentium Core i5 (3370 Mhz)";
                    this.capacidade = 1024;
                    break;
                case 3:

                    this.nome = "Pentium Core i7 (4500 Mhz)";
                    this.capacidade = 2048;
                    break;
            }
        }
    }

