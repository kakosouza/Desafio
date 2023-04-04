package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class FornEmp implements Serializable{

	private static final long serialVersionUID = 1L;

	private Fornecedor fornecedor;
	private Empresa empresa;
	
	public FornEmp() {
	}

	public FornEmp(Fornecedor fornecedor, Empresa empresa) {
		this.fornecedor = fornecedor;
		this.empresa = empresa;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
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
		FornEmp other = (FornEmp) obj;
		return Objects.equals(empresa, other.empresa) && Objects.equals(fornecedor, other.fornecedor);
	}

	@Override
	public String toString() {
		return "FornEmp [fornecedor=" + fornecedor + ", empresa=" + empresa + "]";
	}
}
