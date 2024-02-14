package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> { // User 클래스 또는 User 클래스를 상속하는 T만 사용할 수 있도록 제한
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
