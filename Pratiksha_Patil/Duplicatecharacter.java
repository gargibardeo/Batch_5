package batch4;

public class Duplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str=" Hello Pratiksha how are u ";
		int count;
		
		char String[]=Str.toCharArray();
		System.out.println("Original String");
		System.out.println(Str);
		
		System.out.println();
		
		System.out.println(" Duplicate character: ");
		for(int i=0;i<String.length;i++) {
			
			count=1;
			for(int j=i+1; j<String.length; j++) {
				if (String[i]==String[j]&&String[i]!=' ') {
					count++;
					
					String[j]='0';
				}
		}
			if(count>1&& String[i]!='0') {
			System.out.println(String [i]);
		
		}
		
		
	
	}
	}



	}


