public class Compudores {
    String marca;
    float preco;
    int promo;

    SistemaOperacional sysop;
    HardwareBasico hard;
    MemoriaUSB usb;


    Compudores(int promo) {
        this.promo = promo;
        switch (promo) {
            case 1:
                this.marca = "Positivo";
                this.preco = 362;
                break;
            case 2:
                this.marca = "Acer";
                this.preco = 362 + 1234;
                break;
            case 3:
                this.marca = "Vaio";
                this.preco = 362 + 5678;
                break;
        }


        this.sysop = new SistemaOperacional(promo);
        this.hard = new HardwareBasico(promo);
        this.usb = new MemoriaUSB(promo);
    }


    public void mostrarPCConfig() {
        System.out.println("Promoção: " + this.promo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Sistema Operacional: " + sysop.nome + " (" + sysop.bits + " Bits)");
        System.out.println("Processador: " + hard.nome);
        System.out.println("Armazenamento: " + hard.capacidade + " GB");
        System.out.println("A promoção também acompanha um " + usb.nome + " de " + usb.capacidade + " GB!!");
    }
}