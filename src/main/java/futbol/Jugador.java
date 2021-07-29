package futbol;

public class Jugador extends Futbolista implements Comparable<Futbolista>{
	
	public short golesMarcados;
	public byte dorsal;
	
	
	
	public Jugador() {
		super();
		this.golesMarcados= 289;
		this.dorsal =7;
	}

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte Dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = Dorsal;
		
	}

	

	@Override
	public int compareTo(Futbolista fut) {
		
		return this.getEdad()-fut.getEdad();
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
		
	}
	
	public String toString(){
		return "El futbolista "+ this.getNombre() +" tiene "+ this.getEdad() + ", y juega de " + this.getPosicion() + 
				" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados ;
	}

}
