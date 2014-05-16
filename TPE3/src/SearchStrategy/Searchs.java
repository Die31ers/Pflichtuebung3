package SearchStrategy;

/**
 * Im Interface Searchs werden die zwei gefragten Suchstrategien gegeben. Die
 * Tiefen- und Breitensuche.
 * 
 * @author Joshua Barsoum
 * @author Giang Pham
 * @author Hunar Mawlod
 * 
 */
public interface Searchs extends SearchStrategy {

	public void breadthFirst();

	public void tiefenSuche();
	
}