/**
 * 
 */
package foss.freak.engine;

import java.util.ArrayList;

import org.jfree.data.category.DefaultCategoryDataset;

import foss.freak.dataset.beans.FileDataBean;
import foss.freak.dataset.generator.GenerateDataListFromFile;
import foss.freak.dataset.generator.GenerateDataSetForLineChart;
import foss.freak.graph.generator.FreakGraphGenerator;

/**
 * @author csuser
 *
 */
public class Engine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String inputDataFilePath = "/inputLogs";
		String outputGraphFilePath = "/output";
		String graphName = "test.jpeg";
		String graphTitle = "Migration Time";
		String yAxisLabel = "Time (in seconds)";
		String xAxisLabel = "Migration Number";
		int width =640;
		int height=480;
		
		/**
		 * First populate the list of beans.
		 * ArrayList<FileDataBean> beanList = GenerateDataListFromFile.generateDataListFromFile(inputDataFilePath);
		 * */
		ArrayList<FileDataBean> beanList = GenerateDataListFromFile.generateDataListFromFile(inputDataFilePath);
		/**
		 * Then create the dataset for specific graph plot
		 * DefaultCategoryDataset datasetForLineChart = GenerateDataSetForLineChart.generateDataSetV1(beanList);
		 * */
		DefaultCategoryDataset datasetForLineChart = GenerateDataSetForLineChart.generateDataSetV1(beanList);
		
		/**
		 * Plot the graph.
		 * */
		FreakGraphGenerator.generateLineChart(datasetForLineChart,outputGraphFilePath,graphName,graphTitle,yAxisLabel,xAxisLabel,width,height);;
	}

}
