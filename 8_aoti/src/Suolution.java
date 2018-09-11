
public class Suolution {

	public static long myAoti(String s){
		if(s == null || s == "") return 0;
		int length = s.length();
		for(int i=0;i<length;i++){
			if(s.charAt(i)== ' ' ){
				continue;
			}else{
				s = s.substring(i, length);
				break;
			}
		}
		
		char temp = s.charAt(0);
		boolean flag = true;
		if(temp == '+' || temp == '-' || (temp>= '0'&& temp<= '9') ){
			int length1 = s.length();
			if(temp == '-'){
				flag = false;
				s = s.substring(1,length1);
			}else if(temp == '+'){
				s = s.substring(1,length1);
			}
		}else{
			return 0;
		}
		int i=0;
		long temp1 = 0;
		int length2 = s.length();
		while(s.charAt(i)>='0' && s.charAt(i)<='9'){

			temp1 = (long) (10*temp1+ (long)(s.charAt(i)-'0')) ;
			i++;
			if(i>=s.length()){
				break;
			}
			
		}
		if(temp1>Math.pow(2, 31)-1){
			temp1 = (long)(Math.pow(2, 31)-1);
		}
		if(!flag){
			temp1 = temp1*(-1);
		}
		int result = (int) temp1;
		
		return result;
	}
	public static void main(String[] args){
		String s1 = "-123";
		String s2 = "words and 987";
		String s3 = "-91283472332";
		String s4 = "";
		System.out.println("------------");
		System.out.println(myAoti(s3));
		System.out.println(myAoti(s2));
		System.out.println(myAoti(s4));
	}
}
