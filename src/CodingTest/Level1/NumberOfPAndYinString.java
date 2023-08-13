package CodingTest.Level1;
/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12916
    문자열 내 p와 y의 개수

    대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

    예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

    제한사항
    문자열 s의 길이 : 50 이하의 자연수
    문자열 s는 알파벳으로만 이루어져 있습니다.

    입출력 예
    s	        answer
    "pPoooyY"	true
    "Pyy"	    false
 */
public class NumberOfPAndYinString {
    public static void main(String[] args) {
        String case1 = "pPoooyY";
        String case2 = "Pyy";
        System.out.println(solution(case1));
        System.out.println(solution(case2));
    }

    public static boolean solution(String s) {
        int count1 = 0;
        int count2 = 0;
        for(String x : s.split("")) {
            if(x.equalsIgnoreCase("p")) {
                count1++;
            } else if (x.equalsIgnoreCase("y")) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
