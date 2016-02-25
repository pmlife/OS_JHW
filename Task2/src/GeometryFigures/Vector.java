package GeometryFigures;

public class Vector {
/*
 * 2. ������� ����� "������" ��� �������� ������ �� �������.
 * ����� ������ ����� ��������� ����:
 * 1) ������ ������, ������� ����� �����;
 * 2) ���������� ������ � �������.
 * ����� ������ ����� ��������� ������
 * 1) �������� ���� ������;
 * 2) �������� ������ � ������;
 * 3) �������� j-� �������;
 * 4) ������� j-� �������;
 * 5) ������� �������� ������� �� �����.
 */
	private static final int DEFAULT_SIZE = 10;

	private static Object element;

	private Object[] objects;
	private int size;

	 	    
	/**
	 * Creates a new instance of Vector with default size (default size = 10).
	 */
	public Vector() {
		this.size = 10;
	    this.objects = new Object [10];
	    System.out.println("������ �������:"+ objects.length); 
	}

	/**
	 * Creates a new instance of Vector with a specified size.
	 */
	public Vector(int size) {
		   this.size = size;
	       this.objects = new Object [size];
	    }
	
	/**
	 * Removes all of the elements from this vector.
	 */
	public void clear() {
		// TODO Auto-generated method stub
	}
	
	
	/**
	 * Appends the specified element to the end of this vector
	 * 
	 * @param element
	 *            - element to be appended to this vector
	 */
	public void add(Object element) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the element at the specified position in this vector.
	 * 
	 * @param index
	 *            - index of the element to return
	 * @return the element at the specified position in this vector
	 */
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Removes the element at the specified position in this vector. Shifts any
	 * subsequent elements to the left.
	 * 
	 * @param index
	 *            - the index of the element to be removed
	 */
	public void remove(int index) {
		// TODO Auto-generated method stub
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		 
        Vector ar = new Vector();
/* �������� ������ */       
        ar.clear();
/* �������� ������ �� ������ */       
        ar.add(element);
/* �������� j-� ������� */            
        int j = 0;
		System.out.println("j-� ������� :- "+ar.get(j));
/* ������� j-� ������� */        
		ar.remove(j);
/* �������� �������� ������� �� ����� */		
		System.out.println(ar.toString());
		
	}

}
