/**
 * 
 */
package foss.freak.dataset.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import foss.freak.dataset.beans.FileDataBean;

/**
 * @author csuser
 *
 */
public class GenerateDataListFromFile {
	
	/**
	 * @returns List of Beans populated from the log file generated.
	 * */
	public static ArrayList<FileDataBean> generateDataListFromFile(String inputFile)
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("")));
			String dataLine = br.readLine();
			ArrayList<FileDataBean> dataList = new ArrayList<FileDataBean>();
			while(dataLine!=null)
			{
				dataList.add(new FileDataBean(dataLine));
				dataLine = br.readLine();
			}
			br.close();
			return dataList;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
