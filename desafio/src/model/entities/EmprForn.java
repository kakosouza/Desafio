package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class EmprForn implements Serializable{

	private static final long serialVersionUID = 1L;

	private String fornecedor;
	private String empresa;
	
	public EmprForn() {
	}

	public EmprForn(String fornecedor, String empresa) {
		this.fornecedor = fornecedor;
		this.empresa = empresa;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empresa, fornecedor);
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
		return Objects.equals(empresa, other.empresa) && Objects.equals(fornecedor, other.fornecedor);
	}

	@Override
	public String toString() {
		return "FornEmp [fornecedor=" + fornecedor + ", empresa=" + empresa + "]";
	}
}
