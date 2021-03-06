
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;


/**
 * Generates and returns the data for local search, including the set of all recipes and the neighbor matrix for them
 * Creates and returns the data sets.<br>
 * Will be replaced with a parser to use with a large .txt file storing data sets.
 *
 */
public class DataSet {

	private ArrayList<Recipe> recipes;
	private ArrayList<ArrayList<Integer>> neighborMatrix = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> getNeighborMatrix() {//TODO replace with dynamic creation
//		{{1,0,1,0,0,0,1},
//		 {0,1,0,1,1,0,0},
//		 {1,0,1,0,0,0,1},
//		 {0,1,0,1,1,0,0},
//		 {0,1,0,1,1,0,0},
//		 {0,0,0,0,0,1,0},
//		 {1,0,1,0,0,0,1}};
		
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(1,0,1,0,0,0,1)));
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(0,1,0,1,1,0,0)));
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(1,0,1,0,0,0,1)));
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(0,1,0,1,1,0,0)));
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(0,1,0,1,1,0,0)));
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,1,0)));
		neighborMatrix.add(new ArrayList<Integer>(Arrays.asList(1,0,1,0,0,0,1)));

		return neighborMatrix;
	}

	/**
	 * creates the all data sets: weights, setOfIngredients, and setOfRecipies
	 */
	public ArrayList<Recipe> getData(){
		if(recipes != null){
			return recipes;
		}
		recipes = new ArrayList<Recipe>();

		Integer[] recipe1= {1,2,3};			//conflicts with 3,7
		Integer[] recipe2= {4,5,6};			//conflicts with 4,5
		Integer[] recipe3= {7,8,9,1};		//conflicts with 1,7
		Integer[] recipe4= {10,11,12,6};	//conflicts with 2,5
		Integer[] recipe5= {13,14,15,6};	//conflicts with 2,4
		Integer[] recipe6= {16,17,18};		//conflicts with NOBODY
		Integer[] recipe7= {19,20,21,1};	//conflicts with 1,3
		
		recipes.add(new Recipe(recipe1, 1));	//necessarily included in the initial non-greedy solution		
		recipes.add(new Recipe(recipe2, 1));		
		recipes.add(new Recipe(recipe3, 1));		
		recipes.add(new Recipe(recipe4, 1));		
		recipes.add(new Recipe(recipe5, 1));		
		recipes.add(new Recipe(recipe6, 1));		
		recipes.add(new Recipe(recipe7, 125));	//necessarily not included in the initial non-greedy solution, but should be in sol iff works out... :/
		
		return recipes;
	}
}
