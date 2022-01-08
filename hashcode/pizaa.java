
import java.util.*;
class hashcode {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Map<String, Integer> good = new HashMap<>();
		Map<String, Integer> bad = new HashMap<>();
		Map<String, Integer> result = new HashMap<>();


		int x = 1;
		// the structure for store the good and bad ingredeints.
		int n = in.nextInt();
		String[][] proces = new String[n][5];
		// init matrix with ""
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < 5 ; j++){
				proces[i][j] = "";
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			// what's loves 
			int k = in.nextInt();

			for(int l = 0 ; l < k ; l++) {
				String il = in.next();
				if(good.containsKey(il))
			    	good.put(il , good.get(il)+1);
				else 
					good.put(il , x);		
			}


			int k1 = in.nextInt();
			for(int h = 0 ; h < k1 ; h++){
				String ih = in.next();
				proces[i][h] = ih;
				if(bad.containsKey(ih)) 
					bad.put(ih , bad.get(ih)+1);
				else 
					bad.put(ih , x);
			}
			
		}
			for (String key : good.keySet()){
					if(bad.containsKey(key)) {
						int s = good.get(key) - bad.get(key);
						result.put(key , s);
					}else {
						result.put(key , good.get(key));
					}
			}
			
			int[] value = new int[result.size()];
			String[] keys = new String[result.size()];
			
			int r = 0;
			for(String key : result.keySet()){
				value[r] = result.get(key);
				keys[r] = key;
				r = r+1;
			}
			
			for(int i = 0 ; i < value.length-1 ; i++){
				for(int j = i+1 ; j < value.length ; j++){
					if(value[i]<value[j]){
						// for numbers
						int temp = value[i];
						value[i] = value[j];
						value[j] = temp;
						
						//for string
						String temps = keys[i];
						keys[i] = keys[j];
						keys[j] = temps;
					}
				}
			}
			
			// pizaa ing
			
			String[] ing = new String[value.length];
			
			// fill array with 3 
			for(int i = 0; i <3 ; i++){
				ing[i] = keys[i];
			}
			
			// procces for pickup the clients
			// if not dislike ing in the ing[] then will select
			// the right cleint as myclient. 
			int nop = 0;
			int norp= 0;
			for(int i = 0 ; i < n ; i++) {
				boolean loop = true;
				for(int j = 0 ; j < 5 ; j++) {
					if(!loop){break;}
					for(int cur = 0 ; cur < 3 ; cur++) {
						if(proces[i][j].equals(ing[cur])){
						norp = norp+1;
						loop = false;
						break;
						}
					}
				}
			}
			
			nop = n - norp;
			
			System.out.print("my client = " + nop +
			 " no client =" + norp);
			 
			 int porso = n*100;
			 int finl = (porso - (norp*100)) / 100;
			 
			 System.out.print("the porsentage of secsus is = " + finl+"0%");
			
	}
}
