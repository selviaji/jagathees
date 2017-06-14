public class Dul {
	public static void main(String[] args){
	int count=0;
		String s=args[0];
		for(int i=0;i<=s.length()-2;i++){count=0;
			for(int k=i+1;k<s.length()-1;k++){
		if(s.substring(i,i+1).equals(s.substring(k,k+1))){
		count++;
		}}
			if(count<1)
		{
		System.out.print(s.substring(i,i+1));
		}
		}if(count==1){
		System.out.print(s.substring(s.length()-1));
		}}}

			
