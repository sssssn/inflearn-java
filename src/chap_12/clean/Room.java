package chap_12.clean;

public class Room {
    public int number = 1;
    // synchronized : 쓰레드에서 메서드에 진입해서 작업을 하는 동안 다른 쓰레드는 해당 메서드에 진입 불가
    synchronized public void clean(String name) {
        // 직원1 : 3번방 청소 중
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
