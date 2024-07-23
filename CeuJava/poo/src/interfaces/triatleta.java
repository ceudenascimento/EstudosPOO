package interfaces;

public class triatleta implements ciclista, corredor, nadador, atleta {
	private String nome;
	private int idade;
	private boolean nadando;
	private boolean correndo;
	private boolean pedalando;

	public triatleta(String _nome, int _idade) {
		this.nome = _nome;
		this.idade = _idade;
		this.nadando = false;
		this.correndo = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void nadar() {
		if (this.pedalando == true) {
			System.out.printf("O atleta %s não pode nadar porque está pedalando\n", this.nome);
		} else if (this.correndo == true) {
			System.out.printf("O atleta %s não pode nadar porque está correndo\n", this.nome);
		} else {
			System.out.printf("o atleta %s está nadando\n", this.nome);
			this.nadando = true;
		}
	}

	@Override
	public void correr() {
		if (this.pedalando == true) {
			System.out.printf("O atleta %s não pode correr porque está pedalando\n", this.nome);
		} else if (this.nadando == true) {
			System.out.printf("O atleta %s não pode correr porque está nadando\n", this.nome);
		} else {
			System.out.printf("o atleta %s está correndo\n", this.nome);
			this.correndo = true;
		}
	}

	@Override
	public void pedalar() {
		if (this.correndo == true) {
			System.out.printf("O atleta %s não pode pedalar porque está correndo\n", this.nome);
		} else if (this.nadando == true) {
			System.out.printf("O atleta %s não pode pedalar porque está nadando\n", this.nome);
		} else {
			System.out.printf("o atleta %s está pedalando\n", this.nome);
			this.pedalando = true;
		}
	}

	@Override
	public void descansar() {
		if (this.correndo == false && this.nadando == false && this.pedalando == false) {
			System.out.printf("O atleta %s já está descansando\n", this.nome);
		} else {
			System.out.printf("O atleta %s está descansando\n", this.nome);
			this.correndo = false;
			this.nadando = false;
			this.pedalando = false;
		}
	}
}
