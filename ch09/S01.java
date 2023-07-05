package ch09;

public class S01 {
    public static void main(String[] args) {
        String str = " Show me the money ";

        // 실행해보기 이런 저런 기능이 있구나 확인하기
        System.out.println("str.length() : " + str.length());
        System.out.println("str.charAt(1) : " + str.charAt(1));
        // 주민번호 등을 잘라낼 때 사용할 수 있겠다. 
        // "12345678" -> "1" + "*******"
        System.out.println("str.substring(4) : " + str.substring(4));
        System.out.println("str.substring(6, 11) : " + str.substring(6, 11));
        // 아이디 캡스록을 실수로 눌러서 대문자로 표현이 되었을 때 소문자로 바꿔 쓸 수 있는 메서드
        System.out.println("str.toLowerCase() : " + str.toLowerCase()); 
        // 소문자를 대문자로 바꿔 씀.
        System.out.println("str.toUpperCase() : " + str.toUpperCase());
        System.out.println("str.indexOf(\"e\") : " + str.indexOf("e"));
        System.out.println("str.lastIndexOf(\"e\") : " + str.lastIndexOf("e"));
        // 글자 존재 여부를 나타내줌.
        System.out.println("str.contains(\"the\") : " + str.contains("the"));
        // 글 시작이 어떻게 되어있는지의 사실 여부
        System.out.println("str.startsWith(\"Show\") : " + str.startsWith("Show"));
        // 띄어쓰기 여부까지 봄.
        System.out.println("str.endsWith(\"money\") : " + str.endsWith("money "));
        // 좌 우 공백 제거
        System.out.println("str.trim() : " + str.trim());
        // 글 바꿈.
        System.out.println("str.replace(\"e\", \"x\") : " + str.replace("e", "x"));
        // 반복
        System.out.println("str.repeat(2) : " + str.repeat(2));
        System.out.println("str.split(\" \").length : " + str.split(" ").length);
        // 띄어쓰기 기준으로 쪼갬. split을 하면 기준은 제거
        System.out.println("str.split(\" \")[1] : " + str.split(" ")[0]);
        System.out.println("str.split(\" \")[1] : " + str.split(" ")[1]);
        System.out.println("str.split(\" \")[1] : " + str.split(" ")[2]);
        System.out.println("str.split(\" \")[1] : " + str.split(" ")[3]);
        System.out.println("str.split(\" \")[1] : " + str.split(" ")[4]);

        String name1 = "홍 길 동";
        System.out.println("name1.split(\" \").length : " + name1.split(" ").length);

        String name2 = "cocacola";
        System.out.println("name2.split(\"\").length : " + name2.split("").length);    

        // 값이 없는 빈 문자열 ""만 true
        System.out.println("\"\".isEmpty() : " + "".isEmpty());
        System.out.println("\" \".isEmpty() : " + " ".isEmpty());

        // ""과 " "이 둘 다 ture
        System.out.println("\"\".isBlank() : " + "".isBlank());
        System.out.println("\" \".isBlank() : " + " ".isBlank());
        System.out.println("\"  \".isBlank() : " + "  ".isBlank());

        String bird1 = "오리";
        String bird2 = "오리";

        System.out.println("bird1 == bird2 : " + (bird1 == bird2));

        String bird3 = "독수리";

        System.out.println("bird3 == \"독수리\" : " + (bird3 == "독수리"));

        String bird4 = new String("갈매기");
        String bird5 = new String("갈매기");

        // 그림 참조
        System.out.println("bird4 == bird5 : " + (bird4 == bird5));
        System.out.println("bird4 == \"갈매기\" : " + (bird4 == "갈매기"));
        
        // 객체끼리 == 을 사용하면 주소를 비교하게 된다.
        // 객체끼리 equals를 사용하면 주소를 비교해보고 false면
        // 내부의 값을 한 번 더 확인해서 비교한 뒤 true false를 리턴한다. 

        // 객체끼리 비교는 equals를 권장함.
        System.out.println("bird1.equals(bird2) : " + bird1.equals(bird2));
        System.out.println("bird4.equals(bird5) : " + bird4.equals(bird5));


        // 문자열 / 문자배열
        String korean = "가나다라";
        String[] split = korean.split("");

        // 문자열의 문자(char)를 반복할 때
        for (int i = 0; i < korean.length(); i++) {
            System.out.println(korean.charAt(i));
        }

        // 위와 같음
        for (int i = 0; i < korean.length(); i++) {
            System.out.println(split[i]);
        }

        // 문자열의 문자배열로 바꿔서 반복할 때
        // 각 문자에 문자열 메소드를 사용하고 싶을 때
        for (int i = 0; i < korean.length(); i++) {
            System.out.println(split[i].repeat(2));
        }

        // 문자열을 나란히 표현하고 싶을 때
        System.out.println("String.join(\"\", split) : " + String.join("", split));
        // 나란히 정렬된 문자열 사이에 무언가 넣고 싶을 때 
        System.out.println("String.join(\"a\", split) : " + String.join("a", split));

    }
}
