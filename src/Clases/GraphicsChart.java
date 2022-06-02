/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Locale;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
/**
 *
 * @author mvlop
 */
public class GraphicsChart extends JFrame{
    
    
    public GraphicsChart(String title, String chartTitle, int num1, int num2){
        PieDataset dataset = createDataset(num1, num2);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);
    }
    
    public PieDataset createDataset(int num1, int num2){
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Xperia 10 IV", num1);
        result.setValue("Xperia 10 III", num2);
        return result;
    }
    
    private JFreeChart createChart(PieDataset dataset, String chartTitle) {
        
        JFreeChart chart = ChartFactory.createPieChart3D(chartTitle, dataset, true, true, false);
        
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
}
