package edu.cvtc.shapes;

import java.awt.Dialog;

public class ShapeFactory {

	private Dialog dialog = null;
	
	public ShapeFactory() {
		//this.dialog = messageBox;
	}
	
	public Shape makeCuboid(float width, float height, float depth) {
		return new Cuboid(width, height, depth);
	}
	
	public Shape makeCylinder(float radius, float height) {
		return new Cylinder(radius, height);
	}
	
	public Shape makeSphere(float radius) {
		return new Sphere(radius);
	}
}
