/**
 * 
 */
package foss.freak.dataset.beans;

/**
 * @author csuser
 *
 */
public class FileDataBean {
	
	private ObjectBase baseObject = null;

	/**
	 * @return the baseObject
	 */
	public ObjectBase getBaseObject() {
		return baseObject;
	}

	/**
	 * @param baseObject the baseObject to set
	 */
	public void setBaseObject(ObjectBase baseObject) {
		this.baseObject = baseObject;
	}
	
	public FileDataBean(String logLine)
	{
		baseObject = new ObjectBase();
		String inputs[] = logLine.split(" ");
		baseObject.setMigrationNumber(Integer.valueOf(inputs[0]));
		baseObject.setSourceNode(inputs[1]);
		baseObject.setDestinationNode(inputs[2]);
		baseObject.setTimeInSeconds(Long.valueOf(inputs[3]));		
	}
	
	}
