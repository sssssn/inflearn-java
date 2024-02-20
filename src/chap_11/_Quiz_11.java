package chap_11;
/*
(조건)
인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서 발생할 수 있는 문제를 처리하는 프로그램 작성
- 발생 가능 문제의 2가지 조건 : 상품 구매 가능 시간, 상품 매진
- 각 문제에 대한 사용자 정의 예외 클래스 작성
- 에러 코드에 따른 의도적 예외 발생 및 예외 처리
- 모든 클래스는 하나의 파일에 정의

(힌트)
e.getMessage() 이용하여 예외 메시지 출력

(실행 결과)
- 에러 코드 : 0 (에러 없음)
상품 구매를 완료하였습니다.

- 에러 코드 : 1 (판매 시간 아님)
상품 구매 가능 시간이 아닙니다.
상품 구매는 20시부터 가능합니다.

- 에러 코드 : 2 (매진)
해당 상품은 매진되었습니다.
다음 기회에 이용해주세요.
 */

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
