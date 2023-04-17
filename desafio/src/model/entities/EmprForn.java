package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class EmprForn implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Empresa cnpj;
	private Fornecedor chave;
	
	public EmprForn() {
	}

	public EmprForn(Integer id, Empresa cnpj, Fornecedor chave) {
		this.id = id;
		this.cnpj = cnpj;
		this.chave = chave;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Empresa getCnpj() {
		return cnpj;
	}

	public void setCnpj(Empresa cnpj) {
		this.cnpj = cnpj;
	}

	public Fornecedor getChave() {
		return chave;
	}

	public void setChave(Fornecedor chave) {
		this.chave = chave;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmprForn other = (EmprForn) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "EmprForn [id=" + id + ", Empresa=" + cnpj + ", Fornecedor=" + chave + "]";
	}	
}
