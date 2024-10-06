public class Main {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Fiat", "Gol");
        // Irá exibir "O carro Toyota Corolla está andando".
        carro.andar();

        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);
        // O caminhão Mercedes 1318 carrega 16 toneladas
        caminhao.mostraCarga();

        Bomba bomba = new Bomba("Gasolina");
        bomba.abastecer(new Carro("Fiat", "Gol")); // O Carro Fiat Gol está sendo abastecido com Gasolina

        Posto posto = new Posto(3);

        try {
        Bomba bombaDisponivel = posto.bombaDisponivel();
        bombaDisponivel.abastecer(caminhao); 
        } catch (Exception e) {
        System.err.println(e.getMessage());
        }

        }

        }
