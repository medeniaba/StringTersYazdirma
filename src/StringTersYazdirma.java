
// Kendisine parametre olarak gelen bir stringi ters yazdıran uygulama 

public class StringTersYazdirma {
	
public static void tersten (String b) {
		
		StringBuffer a = new StringBuffer(b);
		System.out.println(a.reverse());
     
	}
	public static void main(String[] args) {
		tersten("medeni");
		
	}

}

//kendisine parametre olarak gelen bir stringi tersten yazdırmanın bir diğer yolu 

 
	public static void tersten (String a) {
		
		for (int i = a.length()-1; i>= 0 ; i-- ) {
			System.out.print(a.charAt(i));
		}
	}
	public static void main(String[] args) {
		tersten("medeni");
		
	}

}}
 
