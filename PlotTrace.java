import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.imageio.*;
import java.io.*;
import java.lang.Math.*;

class PlotTrace{
	
	private ArrayList<Double> x_values;
	private ArrayList<Double> y_values;
	
	private Color traceColor;
	
	int lineType; //0 = solid, 1 = dashed, 2 = dotted, 3 = dash-dotted OR 0 = point, 1 = asterisk
	int plotType; //0 - line, 1 - points
	int lineThickness;
	
	//plotType values
	public static final int LINEPLOT = 0; //Plot using lines connecting the points
	public static final int POINTPLOT = 1; //Plot points at each point - don't connect
	
	//lineType values
	
	public PlotTrace(){
		x_values = new ArrayList<Double>();
		y_values = new ArrayList<Double>();
		traceColor = Color.blue;
		lineType = 0;
		plotType = LINEPLOT;
		lineThickness = 1;
	}
	
	public void add_point(double x, double y){
		x_values.add(x);
		y_values.add(y);
	}
	
	public void setValues(ArrayList<Double> x, ArrayList<Double> y){
		x_values = x;
		y_values = y;
	}
	
	public void setColor(Color c){
		traceColor = c;
	}
	
	public Color getColor(){
		return traceColor;
	}
	
	public double getX(int idx){
		return x_values.get(idx).doubleValue();
	}
	
	public double getY(int idx){
		return y_values.get(idx).doubleValue();
	}
	
	public int getNumPts(){
		return x_values.size();
	}
	
	public int getLineThickness(){
		return lineThickness;
	}
	
	public void setLineThickness(int thickness){
		lineThickness = thickness;
	}
	
	public int getLineType(){
		return lineType;
	}
	
	public void setLineType(int type){
		lineType = type;
	}
	
	public int getPlotType(){
		return plotType;
	}
	
	public void setPlotType(int nplotType){
		this.plotType = nplotType;
	}
}