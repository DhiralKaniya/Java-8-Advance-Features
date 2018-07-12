package com.session.defaultMethod;

public class TestDefaultMethod {
	public static void main(String[] args) {
		Gadgets automated = new AutomatedGadgets();
		Gadgets manual = new ManualGadgets();
		automated.recycle();
		manual.recycle();
	}
}
