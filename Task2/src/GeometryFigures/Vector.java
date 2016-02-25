package GeometryFigures;

public class Vector {
/*
 * 2. Создать класс "Вектор" для хранения ссылок на объекты.
 * Класс должен иметь следующие поля:
 * 1) массив ссылок, который может расти;
 * 2) количество ссылок в массиве.
 * Класс должен иметь следующие методы
 * 1) очистить весь массив;
 * 2) добавить ссылку в массив;
 * 3) Получить j-й элемент;
 * 4) Удалить j-й элемент;
 * 5) вывести значения массива на экран.
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
	    System.out.println("Размер вектора:"+ objects.length); 
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
/* Очистить массив */       
        ar.clear();
/* Добавить ссылку на массив */       
        ar.add(element);
/* Получить j-й элемент */            
        int j = 0;
		System.out.println("j-й элемент :- "+ar.get(j));
/* Удалить j-й элемент */        
		ar.remove(j);
/* Получить значения массива на экран */		
		System.out.println(ar.toString());
		
	}

}
