package polimorfismo;

public class Tubarao extends Animal{
	public Tubarao() {
		
	}
	public Tubarao(String _nome, String _corpelo, String _tipoanimal) {
		super(_nome, _corpelo, _tipoanimal);
	}
	@Override
	public void andar() {
		System.out.println("Tubarão está nadando");
	}
}
