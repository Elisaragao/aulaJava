public class Bomba {
    
        private String combustivel;
        private Carro carroAbastecendo;
        public Bomba(String combustivel) {
        this.combustivel = combustivel;
        }

        public void abastecer(Carro carro) {
        this.carroAbastecendo = carro;
        System.out.println("O " + carro.getClass().getSimpleName() + " " + carro.nomeCompleto()  + " está sendo abastecido com " + this.combustivel);
        }
        
        public boolean estaDisponivel() {
        return this.carroAbastecendo == null;
        }
       }

