package GeometryFigures;

public class Circle {
private static int x;
	/*
 * 1. —оздать класс "ќкружность". 
 *  ласс должен иметь следующие пол€:
 * 1) x, y - координаты центра окружности;
 * 2) radius - радиус окружности.
 *  ласс должен иметь следующие методы:
 * 1) передвинуть окружность на dx и dy;
 * 2) проверить попадание заданной точки внутрь данной окружности;
 * 3) проверить попадание другой окружности внутрь данной;
 * 4) вывести на экран параметры окружности.
 * 
*/
	/**
	 * This class creates a new circle with a specified radius and center location.
	 */
		private static int centerX;
		private static int centerY;
		private static int radius;

		/**
		 * Creates a new instance of Circle with a specified position and radius.
		*/
		public Circle(int centerX, int centerY, int radius) {
			Circle.centerX = centerX;
			Circle.centerY = centerY;
			Circle.radius = radius;
		}
		
		
		/**
		 * Creates a new instance of Circle with a specified radius.
		 */
		public Circle(int radius) {
			
			Circle.radius = radius;

		}
		
		/**
		 * Print a circle.
		 */
		public void printCircle (){
			
			System.out.println(" руг: центр ("+centerX+";"+centerY+") и радиус "+radius);	
			
		}

		/**
		 * Moves the center of the circle
		 * 
		 * @param dx
		 *            - differentiation of x coordinate
		 * @param dy
		 *            - differentiation of y coordinate
		 */
		public void moveCenter(int dx, int dy) {

			centerX = centerX + dx;
			centerY = centerY + dy;
		}

		/**
		 * Checks if specified point belongs to this circle
		 * 
		 * @param x
		 *            - x center coordinate of specified point
		 * @param y
		 *            - y center coordinate of specified point
		 */
		public static boolean isPointInCircle(int x, int y) {
			
			if ((x-centerX)*(x-centerX)+(y-centerY)*(y-centerY) <= radius*radius) 
				return true;
			else  
				return false;
					
		}

		/**
		 * Checks if specified circle is in this circle
		 * 
		 * @param circle
		 *            - specified circle
		 * @param Circle () 
		 * @return true if specified circle is in this circle, if not - return false
		 */
		
		public boolean isCircleInCurrentCircle1(Circle circle) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		


		public static void main(String[] args) {

/* Create the circle */			
			
			int centerX = 0;
			int centerY = 0;
			int radius = 10;
			
			Circle crcl1 = new Circle(centerX, centerY, radius);
			crcl1.printCircle();
			
/* Move the center of the circle
			
			Circle delta = new Circle(centerX, centerY, radius); 
			delta.moveCenter(3, 3);
			delta.printCircle(); 
*/
			
/* Check whether the point is in the circle */
						
			int ox = 10;
			int oy = 5;
			
			{
			if (isPointInCircle(ox,oy) == true){
				System.out.println ("“очка с координатами (" + ox + "," + oy + ") внутри круга");
			}
			else
				System.out.println ("“очка с координатами (" + ox + "," + oy + ") вне круга");

			}

/*			if (isCircleInCurrentCircle(Circle circle) == true){
				System.out.println ("“екуща€ окружность включает указанную.");
			}
			else
				System.out.println ("“екуща€ окружность не включает указанную.");
}
*/
			
		}
}