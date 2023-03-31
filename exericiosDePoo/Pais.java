package exericiosDePoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 4 - Escreva uma classe que represente um país. Um país é representado através dos
atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.:
193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país
mantém uma lista de outros países com os quais ele faz fronteira. Escreva a classe em
Java e forneça os seus membros a seguir:
a) Construtor que inicialize o código ISO, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter) para as propriedades código ISSO, nome,
população e dimensão do país;
c) Um método que permita verificar se dois objetos representam o mesmo país
(igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;
d) Um método que informe se outro país é limítrofe do país que recebeu a mensagem;
e) Um método que retorne a densidade populacional do país;
f) Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns
aos dois países.
Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.
 */

public class Pais{

    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;

    private List<String> paisesFronteiricos = new ArrayList<>();

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getcodigoISO() {
        return codigoISO;
    }

	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public List<String> getPaisesFronteiricos() {
		return paisesFronteiricos;
	}

	public void setPaisesFronteiricos(List<String> paisesFronteiricos) {
		this.paisesFronteiricos = paisesFronteiricos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoISO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigoISO, other.codigoISO);
	}
    
    public boolean isLimitrofe(String pais) {
    	return getPaisesFronteiricos().contains(pais);
    }
    
    public double getDensidadePopulacional() {
    	return this.populacao / this.dimensao;
    }
 
    public List<String> getPaisesFronteiricosEmComum(Pais pais){
    	//criar a lista vazia que sera retornada preenchida;
    	//Iterar sobre a lista de um pais
    	//verificar se o item atual está contido na do outro pais
    	//se estiver adicionar a uma lista que sera retornado
    	//retorna a lista preenchida ou vazia;
    	return null;
    }
    
}













