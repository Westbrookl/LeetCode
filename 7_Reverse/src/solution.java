
public class solution {
	public static int reverse(String s){
		int result=0;
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
			int length1 = s.l
			if(temp == '-'){
				flag = false;
				s = s.substring(1,)
			}
		}else{
			return 0;
		}
		
		
		return result;
	}
}
