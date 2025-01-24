//package Tests.day11;
//
//import day11.Courier;
//import day11.Warehouse;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class Day11CourierTest {
//
//    Warehouse w;
//    Courier courier;
//
//    @BeforeEach
//    public void init() {
//        w = new Warehouse();
//        courier = new Courier(w);
//    }
//
//    @Test
//    void doWorkOnceCourier() {
//        courier.doWork();
//        assertEquals(100, courier.getSalary(),
//                "Однократный вызов метода doWork() на новом объекте Courier. Проверка поля salary");
//    }
//
//    @Test
//    void doWorkOnceWarehouse() {
//        courier.doWork();
//        assertEquals(1000, w.getBalance(),
//                "Однократный вызов метода doWork() на новом объекте Courier. Проверка поля balance у Warehouse");
//    }
//
//    @Test
//    void doWorkTwiceCourier() {
//        courier.doWork();
//        courier.doWork();
//        assertEquals(200, courier.getSalary(),
//                "Двукратный вызов метода doWork() на новом объекте Courier. Проверка поля salary");
//    }
//
//    @Test
//    void doWorkTwiceWarehouse() {
//        courier.doWork();
//        courier.doWork();
//        assertEquals(2000, w.getBalance(),
//                "Двукратный вызов метода doWork() на новом объекте Courier. Проверка поля balance у Warehouse");
//    }
//
//    @Test
//    void bonusYes() {
//        courier.doWork();
//        w.setBalance(1_000_000);
//        courier.bonus();
//        assertEquals(200, courier.getSalary(),
//                "Расчет бонуса курьера при 1 000 000 balance Warehouse, 100 salary Courier");
//    }
//
//    @Test
//    void bonusNo() {
//        courier.doWork();
//        w.setBalance(999_999);
//        courier.bonus();
//        assertEquals(100, courier.getSalary(),
//                "Расчет бонуса курьера при 999 999 balance Warehouse, 100 salary Courier");
//    }
//
//    @Test
//    void bonusTwice() {
//        courier.doWork();
//        w.setBalance(1_000_000);
//        courier.bonus();
//        courier.bonus();
//        assertEquals(200, courier.getSalary(),
//                "Расчет бонуса курьера при 1 000 000 balance (Warehouse), salary = 100 (Courier), двукратном вызове bonus()");
//    }
//}