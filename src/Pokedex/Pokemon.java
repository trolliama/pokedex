package Pokedex;

public class Pokemon {
	private int id, idEvolucao, ataqueSp, defesa, ataque, vida, defesaSp, velocidade;
	private String nome, descricao;
	private String[] tipo, habilidades, fraquezas;
	private char sexo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEvolucao() {
		return idEvolucao;
	}
	public void setIdEvolucao(int idEvolucao) {
		this.idEvolucao = idEvolucao;
	}
	public int getAtaqueSp() {
		return ataqueSp;
	}
	public void setAtaqueSp(int ataqueSp) {
		this.ataqueSp = ataqueSp;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDefesaSp() {
		return defesaSp;
	}
	public void setDefesaSp(int defesaSp) {
		this.defesaSp = defesaSp;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String[] getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		
		this.tipo = tipo.split(",");
	}
	public String[] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades.split(",");
	}
	public String[] getFraquezas() {
		return fraquezas;
	}
	public void setFraquezas(String fraquezas) {
		this.fraquezas = fraquezas.split(",");
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
