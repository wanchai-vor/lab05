package rmuti.lab05;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class ArraysList {
	
	 protected Object[] elementData = new Object[1];
	 protected int size = 0;
	
            //	 public void add(int i, Object e) {
	 		//			ensureCapacity(size + 1);
	 		//			for (int j = size - 1; j >= i; j--) {
	 		//				elementData[j + 1] = elementData[j];
	 		//			}
	 		//			elementData[i] = e;
	 		//			size++;
	 		//		}
	 
	 public void add(Object e){
		 	ensureCapacity(size + 1);
		 	elementData[size++] = e;
	 }
		
	 public void remove(int i) {
			for (int j = i; j < size-1; j++) {
				elementData[j] = elementData[j + 1];
			}
			elementData[size - 1] = null;
			size--;
		}

	 private void ensureCapacity(int capacity) {
					if (capacity > elementData.length) {
						int s = 2 * elementData.length;
						Object[] arr = new Object[s];
							for (int i = 0; i < size; i++) {
								arr[i] = elementData[i];
							}
						elementData = arr;
					}
					
		}
	 
	 public Object get(int i){
		 return elementData[i];
	 }
	 
		@Override
		public String toString() {
			return Arrays.toString(elementData);
		}


}
