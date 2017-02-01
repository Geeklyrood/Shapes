/**
 * 
 */
package edu.cvtc.shapes;

/**
 * @author Keenan
 *
 */
public class Cuboid extends Shape {
	// The width of the Cuboid
	private float width = 0.0f;
	
	// The height of the Cuboid
	private float height = 0.0f;
	
	// The depth of the cuboid
	private float depth = 0.0f;
	
	// Create a new instance of Cuboid
	public Cuboid(float width, float height, float depth) {
	
		// Set the dimensions of this Cuboid instance
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}

	// Get width of Cuboid
	public float getWidth() {
		return width;
	}

	// Set width of Cuboid
	public void setWidth(float width) {
		this.width = width;
	}
	
	// Get height of Cuboid
	public float getHeight() {
		return height;
	}

	// Set height of Cuboid
	public void setHeight(float height) {
		this.height = height;
	}

	// Get depth of Cuboid
	public float getDepth() {
		return depth;
	}

	// Set depth of Cuboid
	public void setDepth(float depth) {
		this.depth = depth;
	}

	@Override
	float surfaceArea() {
		// Equation to get surface area 
		return 2.0f * (getWidth() * getDepth() + getDepth() * getHeight() + getHeight() * getWidth());
	}

	@Override
	float volume() {
		// Equation to get volume
		return getWidth() * getDepth() * getHeight();
	}

	@Override
	String render() {
		// Create string to show later
		return "The surface area of a Cuboid is " + surfaceArea() + " and the volume is " + volume();
	}
}
