public class LightBoard
{
 /** The lights on the board, where true represents on and false represents off.
 */
 private boolean[][] lights;
 /** Constructs a LightBoard object having numRows rows and numCols columns.
 * Precondition: numRows > 0, numCols > 0
 * Postcondition: each light has a 40% probability of being set to on.
 */
 public LightBoard(int numRows, int numCols)
 { 
lights= new boolean[numRows][numCols];
for(int r = 0; r < lights.length; r++)
{
    for(int c = 0; c < lights[0].length; c++)
    {
if(Math.random() < 0.4) lights[r][c] = true;
    }
}
 }

public double test()
{
    double on = 0;
    for(boolean[]row : lights)
    {
for(boolean b : row)
{
    if(b) on++;
}
    }
    return on /(  lights.length * lights[0].length);
}
  
 /** Evaluates a light in row index row and column index col and returns a status
 * as described in part (b).
 * Precondition: row and col are valid indexes in lights.
 */
 public boolean evaluateLight(int row, int col)
 { 

    boolean light = lights[row][col];
    int colights = 0;
    for(int r = 0; r < lights.length; r++)
    {
        if(lights[r][col]) colights++;
        if(light && colights % 2 ==0) return false;
        if(!light && colights % 3 ==0) return true;
    }
    return light;
 }

 public void setLights(boolean [][]arr)
    {
        lights = arr;
    }

 // There may be additional instance variables, constructors, and methods not shown.
} 
