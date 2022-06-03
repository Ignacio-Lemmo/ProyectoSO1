package Clases;

import java.util.Locale;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class GraphicsChart extends JFrame{
    
    
    public GraphicsChart(String title, String chartTitle, double num1, double num2){
        JFreeChart chart = ChartFactory.createBarChart(title, "", chartTitle, createDataset(num1, num2), PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel( chart );        
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
        setContentPane( chartPanel );    
    }
    
    private CategoryDataset createDataset(double num1, double num2){
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        result.addValue(num1, "Planta1", "Xperia 10 IV");
        result.addValue(num2, "Planta2", "Xperia 10 III");        
        return result;
        
    }
    
//        Clases.GraphicsChart graphG = new Clases.GraphicsChart("Pie Chart","Gastos", 80, 20);
//        graphG.pack();
//        RefineryUtilities.centerFrameOnScreen(graphG);        
//        graphG.setVisible(true);    
    
}
