package sk.umb.projekty.ardbot.astar;

/**
 * A heuristic that uses the tile that is closest to the target
 * as the next best tile.
 */
public class ClosestHeuristic implements AStarHeuristic {

        public float getEstimatedDistanceToGoal(int startX, int startY, int goalX, int goalY) {         
                float dx = goalX - startX;
                float dy = goalY - startY;
                
                float result = (float) (Math.sqrt((dx*dx)+(dy*dy)));
               
                return result;
        }

}