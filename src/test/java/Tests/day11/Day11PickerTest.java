//package Tests.day11;
//
//import day11.Picker;
//import day11.Warehouse;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class Day11PickerTest {
//
//    Warehouse w;
//    Picker picker;
//
//    @BeforeEach
//    public void init() {
//        w = new Warehouse();
//        picker = new Picker(w);
//    }
//
//    @Test
//    void doWorkOncePicker() {
//        picker.doWork();
//        assertEquals(80, picker.getSalary(),
//                "Однократный вызов метода doWork() на новом объекте Picker. Проверка поля salary");
//    }
//
//    @Test
//    void doWorkOnceWarehouse() {
//        picker.doWork();
//        assertEquals(1, w.getCountOrders(),
//                "Однократный вызов метода doWork() на новом объекте Picker. Проверка поля countOrders у Warehouse");
//    }
//
//    @Test
//    void doWorkTwice() {
//        picker.doWork();
//        picker.doWork();
//        assertEquals(160, picker.getSalary(),
//                "Двукратный вызов метода doWork() на новом объекте Picker. Проверка поля salary");
//    }
//
//    @Test
//    void doWorkTwiceWarehouse() {
//        picker.doWork();
//        picker.doWork();
//        assertEquals(2, w.getCountOrders(),
//                "Двукратный вызов метода doWork() на новом объекте Picker. Проверка поля countOrders у Warehouse");
//    }
//
//    @Test
//    void bonusYes() {
//        picker.doWork();
//        w.setCountOrders(1500);
//        picker.bonus();
//        assertEquals(240, picker.getSalary(),
//                "Расчет бонуса сборщика при countOrders = 1500 (Warehouse), salary = 80 (Picker)");
//    }
//
//    @Test
//    void bonusNo() {
//        picker.doWork();
//        w.setCountOrders(1499);
//        picker.bonus();
//        assertEquals(80, picker.getSalary(),
//                "Расчет бонуса сборщика при countOrders = 1499 (Warehouse), salary = 80 (Picker)");
//    }
//
//    @Test
//    void bonusTwice() {
//        picker.doWork();
//        w.setCountOrders(1500);
//        picker.bonus();
//        picker.bonus();
//        assertEquals(240, picker.getSalary(),
//                "Расчет бонуса сборщика при countOrders = 1500 (Warehouse), salary = 80 (Picker), двукратном вызове bonus()");
//    }
//}