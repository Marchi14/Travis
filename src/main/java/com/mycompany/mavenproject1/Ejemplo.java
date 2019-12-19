package com.mycompany.mavenproject1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Ejemplo {
    public static void main(String[] args){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(6, "2017", "Jorge");
        dataset.setValue(7, "2018", "Jorge");
        
        dataset.setValue(8, "2017", "Cristina");
        dataset.setValue(5, "2018", "Cristina");
        
        dataset.setValue(12, "2017", "Pedro");
        dataset.setValue(9, "2018", "Pedro");
        
        JFreeChart chart = ChartFactory.createBarChart(
                "Comparación Ventas 2017-2018",
                "Vendedores", 
                "Ventas", 
                dataset, 
                PlotOrientation.HORIZONTAL,
                true, 
                false, 
                false
        );
        
        //Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Ejemplo Grafica de Barras", chart);
        frame.pack();
        frame.setVisible(true);

    }
}
