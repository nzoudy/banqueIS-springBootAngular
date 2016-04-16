package com.zoudys.metier;

import com.zoudys.entities.Operation;

import java.io.Serializable;
import java.util.List;

public class PageOperation implements Serializable{

	private List<Operation> operations;
	private int page;
	private int nombreOperations;
	private int totalOperations;
	private int totalPage;
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNombreOperations() {
		return nombreOperations;
	}
	public void setNombreOperations(int nombreOperations) {
		this.nombreOperations = nombreOperations;
	}
	public int getTotalOperations() {
		return totalOperations;
	}
	public void setTotalOperations(int totalOperations) {
		this.totalOperations = totalOperations;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public PageOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
