package ch06.sec12.hyundai;

// import 문으로 다른 패키지 사용을 명시
import ch06.sec12.hankkok.Tire;
import ch06.sec12.hankkok.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
    // 부품 필드 선언
    Tire tire1 = new Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
    
    SnowTire snowTire1 = new SnowTire();
    
    AllSeasonTire allSeasonTire1 = new AllSeasonTire();
}
