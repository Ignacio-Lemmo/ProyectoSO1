package Clases;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;

public class GraphicsChart2 extends JFrame{
    
    public GraphicsChart2(String title, String chartTitle, double num1, double num2){
        JFreeChart chart = ChartFactory.createPieChart3D(title, createDataset(num1, num2), true, true, false);
        ChartPanel chartPane1 = new ChartPanel( chart );
        chartPane1.setPreferredSize(new java.awt.Dimension(560,367));
        setContentPane(chartPane1);
    }
    
    private PieDataset createDataset(double num1, double num2){
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Xperia 10 IV", num1);
        result.setValue("Xperia 10 III", num2);
        
        return result;
    }
}
