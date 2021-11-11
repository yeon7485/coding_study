// Lv.2 - 전화번호 목록
import java.util.*;

public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i < phone_book.length; i++){
            for(int j = i+1; j < phone_book.length; j++){
                String temp = "";
                if(phone_book[i].length() < phone_book[j].length()){
                    temp = phone_book[j].substring(0, phone_book[i].length());
                    if(phone_book[i].equals(temp)) {
                        answer = false;
                        return answer;
                    }
                }
                else{
                    temp = phone_book[i].substring(0, phone_book[j].length());
                    if(phone_book[j].equals(temp)) {
                        answer = false;
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        PhoneNumList pl = new PhoneNumList();
        String[] arr1 = {"119", "97674223", "1195524421"};
        String[] arr2 = {"123","456","789"};
        String[] arr3 = {"12","123","1235","567","88"};
        System.out.println(pl.solution(arr1));
        System.out.println(pl.solution(arr2));
        System.out.println(pl.solution(arr3));
    }
}
