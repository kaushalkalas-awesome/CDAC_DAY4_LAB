package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x, double y){
		this.x=x;
		this.y=y;
	}

	public String getDetails() {
		return Double.toString(this.x)+","+Double.toString(this.y);
	}
	
	public boolean isEqual(Point2D p) {
		if(this.x==p.x && this.y==p.y) {
			return true;
		} else {
			return false;
		}
	}
	
	public double calculateDistance(Point2D p1) {
		return Math.sqrt(Math.pow((p1.x - this.x),2) + Math.pow((p1.y - this.y),2));
	}
	
}
