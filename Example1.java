import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.imageio.*;
import java.io.*;
import java.lang.Math.*;

class Example1{

	public static void main(String[] args){
		    
        PlotTrace pt = new PlotTrace();
        for (int i = 0 ; i < 1000 ; i++){

            pt.add_point((i/100.0), Math.sin(i/100.0));
        }
        pt.setPlotType(PlotTrace.LINEPLOT);
        
        PlotTrace pt2 = new PlotTrace();
        for (int i = 0 ; i < 1000 ; i++){
            pt2.add_point((i/100.0), (i/100.0));
        }
        pt2.setColor(Color.red);
        pt2.setPlotType(PlotTrace.POINTPLOT);
        
        KPlot kp = new KPlot("KPlot Window");
        kp.addPlotTrace(pt);
		kp.addPlotTrace(pt2);
		kp.setBounds(-2, 12, -2, 12);
	}

}
