	how to order multidimensional arrays in ascending order:
	
	Arrays.sort(arr2, new Comparator<int[]>() {
		public int compare(int x[], int y[]) {
			return x[0]-y[0];
		}
	}); 
	
