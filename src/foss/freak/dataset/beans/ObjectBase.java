/**
 * 
 */
package foss.freak.dataset.beans;

/**
 * @author csuser
 *
 */
public class ObjectBase {

	private int migrationNumber;
	private String sourceNode;
	private String destinationNode;
	/**
	 * @return the migrationNumber
	 */
	public int getMigrationNumber() {
		return migrationNumber;
	}
	/**
	 * @param migrationNumber the migrationNumber to set
	 */
	public void setMigrationNumber(int migrationNumber) {
		this.migrationNumber = migrationNumber;
	}
	/**
	 * @return the sourceNode
	 */
	public String getSourceNode() {
		return sourceNode;
	}
	/**
	 * @param sourceNode the sourceNode to set
	 */
	public void setSourceNode(String sourceNode) {
		this.sourceNode = sourceNode;
	}
	/**
	 * @return the destinationNode
	 */
	public String getDestinationNode() {
		return destinationNode;
	}
	/**
	 * @param destinationNode the destinationNode to set
	 */
	public void setDestinationNode(String destinationNode) {
		this.destinationNode = destinationNode;
	}
	
}
