/**
 * 
 */
package foss.freak.graph.generator;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author csuser
 *
 */
public class FreakGraphGenerator {
	
	public static void generateLineChart(DefaultCategoryDataset dataset, String outputGraphFilePath,String graphName,String graphTitle,String yAxisLabel, String xAxisLabel,int width,int height){
		
		JFreeChart lineChart  = ChartFactory.createLineChart3D(graphTitle, yAxisLabel, xAxisLabel, dataset);		
		File lineChartImage = new File(outputGraphFilePath+"/"+graphName);
		try {
			ChartUtilities.saveChartAsJPEG(lineChartImage, lineChart, width, height);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
