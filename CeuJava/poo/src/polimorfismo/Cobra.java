package polimorfismo;

public class Cobra extends Animal{
	public Cobra() {
		
	}
		public Cobra(String _nome, String _corpelo, String _tipoanimal) {
			super(_nome, _corpelo, _tipoanimal);
		}
		@Override
		public void andar() {
			System.out.println("A cobra está rastejando");
		}
		public void emitirsom() {
			System.out.println("SSSSSSSSSSSSSSSSSS");
		}
	}


