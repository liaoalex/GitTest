package com.sap.lbwtest.base;

public class ClassA {
	private String name;
	private ClassB bb;

	public ClassB getBb() {
		return bb;
	}

	public void setBb(ClassB bb) {
		this.bb = bb;
	}

	
	public String getName() {
		return name;
	}
	
	@AnnotateMenthod(appObject="CLASS_A",operation="UPDATE")
	public void setName(String name) {
		this.name = name;
	}
	public final ClassB buildParas(){
		this.name = "liao";
		ClassB bb1 = new ClassB();
		bb1.setPosition("manager");
		bb1.setAa(this);
		this.bb = bb1;
		return bb1;
	}

}
