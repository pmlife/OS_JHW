package GeometryFigures;

public class Circle {
/*
 * 1. ������� ����� "����������". 
 * ����� ������ ����� ��������� ����:
 * 1) x, y - ���������� ������ ����������;
 * 2) radius - ������ ����������.
 * ����� ������ ����� ��������� ������:
 * 1) ����������� ���������� �� dx � dy;
 * 2) ��������� ��������� �������� ����� ������ ������ ����������;
 * 3) ��������� ��������� ������ ���������� ������ ������;
 * 4) ������� �� ����� ��������� ����������.
 * 
*/
	/**
	 * This class creates a new circle with a specified radius and center location.
	 */
		private int centerX;
		private int centerY;
		private int radius;

		/**
		 * Creates a new instance of Circle with a specified position and radius.
		 */
		public Circle(int centerX, int centerY, int radius) {
			this.centerX = centerX;
			this.centerY = centerY;
			this.radius = radius;
		}

		/**
		 * Creates a new instance of Circle with a specified radius.
		 */
		public Circle(int radius) {
			// TODO Auto-generated constructor stub
		}

		/**
		 * Moves the center of the circle
		 * 
		 * @param dx
		 *            - differentiation of x coordinate
		 * @param dy
		 *            - differentiation of y coordinate
		 */
		public void move(int dx, int dy) {
			// TODO Auto-generated method stub
		}

		/**
		 * Checks if specified point belongs to this circle
		 * 
		 * @param x
		 *            - x center coordinate of specified point
		 * @param y
		 *            - y center coordinate of specified point
		 * @return true if specified point belongs to this circle, if not - return
		 *         false
		 */
		public boolean isPointInCircle(int x, int y) {
			// TODO Auto-generated method stub
			return false;
		}

		/**
		 * Checks if specified circle is in this circle
		 * 
		 * @param circle
		 *            - specified circle
		 * @return true if specified circle is in this circle, if not - return false
		 */
		public boolean isCircleInCurrentCircle(Circle circle) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

