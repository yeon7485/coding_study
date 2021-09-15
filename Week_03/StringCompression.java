// Lv.2 - 문자열 압축

public class StringCompression {
    public int solution(String s) {
        int answer = 0;
        int n = 0;
        int min = s.length();
        String a = "";
        String com = "";
        String current = "";

        for(int i = 1; i <= s.length()/2; i++){
            com = s.substring(0, i);
            n = 1;
            for(int j = i; j < s.length(); j = j + i){
                if(j + i <= s.length()){
                    current = s.substring(j, j + i);
                    if(com.equals(current)){
                        n++;
                        // 마지막 글자면
                        if(j + i == s.length()){
                            a += n + com;
                            break;
                        }
                        
                    }
                    else{
                        if(n == 1) a += com;
                        else a += n + com;  
                        // 마지막 글자면
                        if(j + i == s.length()){
                            a += current;
                            break;
                        }
                        com = current;
                        n = 1;
                    }
                }
                else{
                    a += s.substring(j - i);
                }
            }
            // System.out.println("i : " + i + " || str : " + a);
            min = Math.min(min, a.length());
            a = "";
        }
        answer = min;
        return answer;
    }
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();

        System.out.println(sc.solution("aabbaccc"));
        System.out.println(sc.solution("ababcdcdababcdcd"));
        System.out.println(sc.solution("abcabcdede"));
        System.out.println(sc.solution("abcabcabcabcdededededede"));
        System.out.println(sc.solution("xababcdcdababcdcd"));
    }    
}
