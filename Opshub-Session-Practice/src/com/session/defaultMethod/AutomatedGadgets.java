package com.session.defaultMethod;

public class AutomatedGadgets implements Gadgets{

	@Override
	public void start() {
		System.out.println("AutomatedGadgets Gadgets.. start !!");
	}

	@Override
	public void stop() {
		System.out.println("AutomatedGadgets Gadgets.. stop !!");
	}

	@Override
	public void recycle() {
		System.out.println("AutomatedGadgets recycle..!!");
	}

}
