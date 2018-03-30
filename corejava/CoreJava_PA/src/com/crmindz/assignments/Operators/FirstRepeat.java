package com.crmindz.assignments.Operators;

public class FirstRepeat {
	
	public void firstRep(int[] a) {
		int[] count = new int[256];
		int index=0;
		for(int i=0;i<a.length;i++) {
			count[a[i]]++;
			
		}
		
		for(int j=0;j<a.length;j++) {
			if(count[a[j]]==1) {
				index = j;
				break;
			}
		}
		System.out.println(a[index]);
	}

	
	public static void main(String[] args) {
		FirstRepeat f = new FirstRepeat();
		f.firstRep(new int[] {1,2,3,5,7,4,4,3,2,1,5});

	}

}
