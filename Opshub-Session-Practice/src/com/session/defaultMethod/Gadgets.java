package com.session.defaultMethod;

public interface Gadgets {
	public void start();
	public void stop();
	default public void recycle() {
		System.out.println("Gadgets recycle support has not been enabled..!");
	}
}
