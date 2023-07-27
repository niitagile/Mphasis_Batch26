package com.template;

public class Product {
	String pid, prodname;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", prodname=" + prodname + "]";
	}
	
}
