package movie2;

public class Handler {
	
	static Movie[] arr = new Movie[10];

	static String getList() {	// 배열의 모든 요소의 내용을 문자열로 반환해야 한다
		
		String result = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].getInfo() + "\n";
			}
		}
		
		return result;
	
	}

	public static String search(String keyword) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				return arr[i].getInfo();
			}
		}
		return null;
	}
	
	
}




