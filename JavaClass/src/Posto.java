import java.util.ArrayList;
import java.util.List;

class Posto {
private List<Bomba> bombas;

public Posto(int numBombas) {
bombas = new ArrayList<Bomba>();

for (int i = 0; i < numBombas; i++) {
bombas.add(new Bomba("Diesel"));
}
}
 
public Bomba bombaDisponivel() throws Exception {
for (Bomba bomba : bombas) {
 
if (bomba.estaDisponivel()) {
return bomba;
}
}

throw new Exception("Nenhuma bomba disponível");
}
}