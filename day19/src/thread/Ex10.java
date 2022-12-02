package thread;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0, height = 0;
        for(int i = 0; i < sizes.length; i++) {
//        	if(sizes[i][0] < sizes[i][1]) {
//        		int tmp = sizes[i][0];
//        		sizes[i][0] = sizes[i][1];
//        		sizes[i][1] = tmp;
//        	}
//        	width = Math.max(width, sizes[i][0]);
//        	height = Math.max(height, sizes[i][1]);
        	
        	width = Math.max(width, Math.max(sizes[i][0], sizes[i][1]));
        	height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
        }
        answer = width * height;
        return answer;
    }
}

public class Ex10 {
	public static void main(String[] args) {
		
	}
}
