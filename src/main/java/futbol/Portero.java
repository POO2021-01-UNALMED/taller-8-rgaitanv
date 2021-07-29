package futbol;

public class Portero extends Futbolista implements Comparable<Futbolista>{
	
	public short golesRecibidos;
	public byte dorsal;
	
	
	
	public Portero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal ) {
		super(nombre, edad, "Portero");
		this.golesRecibidos= golesRecibidos;
		this.dorsal = dorsal;
		
	}



	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public String toString(){
		return "El futbolista "+ this.getNombre() +" tiene "+ this.getEdad() + ", y juega de " + this.getPosicion() + 
				" con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos ;
	}

	public int compareTo(Portero f) {
		return this.golesRecibidos - f.golesRecibidos;
	}

}
