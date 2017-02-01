/**
 * 
 */
package edu.cvtc.shapes;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author Keenan
 *
 */
public class Test {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set sides of the cuboid
		Cuboid cuboid = new Cuboid(10, 10, 10);
		// Set sides of the sphere
		Sphere sphere = new Sphere(10);
		// Set sides of the cylinder
		Cylinder cylinder = new Cylinder(10, 10);
		
		// Set the frame for JOptionPane
		Component frame = null;
		
		// Output cupoid measurements
		JOptionPane.showMessageDialog(frame,
				cuboid.render());
		// Output sphere measurements
		JOptionPane.showMessageDialog(frame,
				sphere.render());
		// Output cylinder measurements
		JOptionPane.showMessageDialog(frame,
				cylinder.render());

	}

}
