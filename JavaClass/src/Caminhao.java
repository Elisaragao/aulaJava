public class Caminhao extends Carro {
    private int carga;
    public Caminhao(String marca, String nome, int carga) {
    super(marca, nome);
    this.carga = carga;
    }

    public void mostraCarga() {
    System.out.println("O caminhão " + super.nomeCompleto() +
    " carrega " + carga + " toneladas");
    }

    public void andar() {
     System.out.println("O caminhão " + super.nomeCompleto() +
    " está carregando " + carga + " toneladas");
    }
    
    public void andar(boolean deRe) {
    if (deRe)
    System.out.println("O caminhão " + super.nomeCompleto() +
    " está carregando " + carga + " toneladas de ré");
    else
    andar();
    }
   }
