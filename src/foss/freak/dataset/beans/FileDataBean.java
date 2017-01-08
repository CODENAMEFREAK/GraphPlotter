/**
 * 
 */
package foss.freak.dataset.beans;

/**
 * @author csuser
 *
 */
public class FileDataBean {
	
	private int seconds;

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public FileDataBean(String inputLine) {
		setSeconds(Integer.parseInt(inputLine));
	}
}
