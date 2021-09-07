import java.util.Arrays;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2 ,5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int index1 = 0, index2 = 0, index3 = 0;
        int score1 = 0, score2 = 0, score3 = 0;
        int max = 0;
        String stu = "";


        for(int i = 0; i < answers.length; i++){
            if(stu1[index1] == answers[i]) score1++;
            if(stu2[index2] == answers[i]) score2++;
            if(stu3[index3] == answers[i]) score3++;

            index1++;
            index2++;
            index3++;

            //맨 끝까지 갔으면 인덱스 0으로 초기화
            if(index1 == stu1.length) index1 = 0;
            if(index2 == stu2.length) index2 = 0;
            if(index3 == stu3.length) index3 = 0;
        }

        //가장 큰 점수 구하기
        max = Math.max(Math.max(score1, score2), score3);

        //가장 많이 맞은 사람 찾아서 문자열에 저장
        if(max == score1) stu += 1;
        if(max == score2) stu += 2;
        if(max == score3) stu += 3;


        //가장 많은 문제를 맞힌 사람 수만큼 배열 크기 초기화
        answer = new int[stu.length()];

        //한 글자를 숫자로 뽑아내서 answer에 값 넣기
        for(int i = 0; i < stu.length(); i++) answer[i] = stu.charAt(i) - '0'; 

        return answer;
    }

    public static void main(String[] args){
        MockExam me = new MockExam();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(me.solution(arr1)));
        System.out.println(Arrays.toString(me.solution(arr2)));
    }
}
