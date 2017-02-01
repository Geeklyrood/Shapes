/**
 * 
 */
package edu.cvtc.shapes;

/**
 * @author Keenan
 *
 */
public class Cylinder extends Shape {

	// The radius of a Cylinder
	private float radius = 0.0f;
	
	// The height of a height
	private float height = 0.0f;
	
	// Create a new instance of Cylinder
	public Cylinder(float radius, float height) {
	
		// Set the dimensions of this Cylinder instance
		setRadius(radius);
		setHeight(height);
	}
	
	// Get radius
	public float getRadius() {
		return radius;
	}
	// Set radius
	public void setRadius(float radius) {
		this.radius = radius;
	}
	// Get Height
	public float getHeight() {
		return height;
	}
	// Set Height
	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	float surfaceArea() {
		// Equation for surface area 
		return (float) (2.0f * (Math.PI * radius * height) + 2.0f * (Math.PI * (radius * radius)));
	}

	@Override
	float volume() {
		// Equation for volume 
		return (float) (Math.PI * (getRadius() * getRadius()) * height);
	}

	@Override
	String render() {
		// Create string to show later
		return "The surface area of a Cylinder is " + surfaceArea() + " and the volume is " + volume();	
	}
	
	
	
}
