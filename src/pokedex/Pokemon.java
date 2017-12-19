package pokedex;

import java.util.ArrayList;

public class Pokemon {
	private int id, idEvolucao, ataqueSp, defesa, ataque, vida, defesaSp, velocidade;
	private String nome, descricao, categoria;
	private double altura, peso;
	private	ArrayList<String> tipos, habilidades, fraquezas, sexo;
	
	public Pokemon() {

		this.fraquezas = new ArrayList<String>();
		this.tipos = new ArrayList<String>();
		this.habilidades = new ArrayList<String>();
		this.sexo = new ArrayList<String>();
		
	}
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
	
	public ArrayList<String> getTipos() {
		return this.tipos;
	}
	public void setTipos(String tipo) {
		this.tipos.add(tipo);
	}
	public ArrayList<String> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidade) {
		this.habilidades.add(habilidade);
	}
	public ArrayList<String> getFraquezas() {
		return fraquezas;
	}
	public void setFraquezas(String fraqueza) {
		this.fraquezas.add(fraqueza);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<String> getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo.add(sexo);
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
