import org.apache.commons.lang3.RandomStringUtils;

/**
 * Apache Commons Lang 라이브러리를
 * 컴퓨터에 다운받거나
 * Maven 혹은 Gradle에 dependency 추가
 */
public class ApacheCommonsLang {
    public static void main(String[] args) {
        // 임의의 문자를 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.random(int count)");
        System.out.println(RandomStringUtils.random(10));


        // 지정한 char 배열에서 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.random(int count, char[] chars)");
        System.out.println(RandomStringUtils.random(10, new char[]{'A', 'B', 'C'}));


        // 지정한 문자열에서 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.random(int count, String chars)");
        System.out.println(RandomStringUtils.random(10, "ABC"));


        // 임의의 문자를 start부터 end까지의 범위에서 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.random(int count, int start, int end, boolean letters, boolean number)");
        System.out.println(RandomStringUtils.random(10, 33, 125, false, false));
        System.out.println(RandomStringUtils.random(10, 33, 125, true, false));
        System.out.println(RandomStringUtils.random(10, 33, 125, false, true));
        System.out.println(RandomStringUtils.random(10, 33, 125, true, true));


        // 영문 대소문자를 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.randomAlphabetic(int count)");
        System.out.println(RandomStringUtils.randomAlphabetic(10));


        // 숫자를 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.randomNumeric(int count)");
        System.out.println(RandomStringUtils.randomNumeric(10));


        // 대소문자, 숫자를 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.randomAlphanumeric(int count)");
        System.out.println(RandomStringUtils.randomAlphanumeric(10));


        // 아스키코드를 count만큼 랜덤으로 생성
        System.out.println(">>>> RandomStringUtils.randomAscii(int count)");
        System.out.println(RandomStringUtils.randomAscii(10));
    }
}