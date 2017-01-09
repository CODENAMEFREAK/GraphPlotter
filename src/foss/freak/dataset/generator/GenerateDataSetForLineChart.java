/**
 * 
 */
package foss.freak.dataset.generator;

import java.util.ArrayList;

import org.jfree.data.category.DefaultCategoryDataset;

import foss.freak.dataset.beans.FileDataBean;

/**
 * @author csuser
 *
 */
public class GenerateDataSetForLineChart {
	
	public static DefaultCategoryDataset generateDataSetV1(ArrayList<FileDataBean> dataBeanList)
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for(FileDataBean dataBean : dataBeanList)
		{
			dataset.addValue(dataBean.getBaseObject().getTimeInSeconds(), "seconds", new Integer (dataBean.getBaseObject().getMigrationNumber()));			
		}
		return dataset;
	}

}
