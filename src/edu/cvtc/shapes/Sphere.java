/**
 * 
 */
package edu.cvtc.shapes;
/**
 * @author Keenan
 *
 */
public class Sphere extends Shape {

	// Radius of sphere
	private float radius = 0.0f;

	// Create a new instance of Sphere
	public Sphere(float radius) {
	
		// Set the dimensions of this Sphere instance
		setRadius(radius);
	}
	
	// Get radius
	public float getRadius() {
		return radius;
	}

	// Set radius
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float getVolume() {
		// Equation for volume  V=4/3 pi r cubed
		return (float) (4.0f / 3.0f * Math.PI * (radius * radius * radius));
	}

	@Override
	float surfaceArea() {
		// Equation for surface area
		return (float) (4.0f * Math.PI * (radius * radius));
	}

	@Override
	float volume() {
		// Equation for volume 
		return (float) (4.0f / 3.0f * Math.PI * (radius * radius * radius));
	}

	@Override
	String render() {
		// Create string to show later
		return "The surface area of a sphere is " + surfaceArea() + " and the volume is " + volume();
	}
}
