package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker = new Picker(warehouse1);
        Courier courier = new Courier(warehouse1);
        businessProcess(picker);
        businessProcess(courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker1 = new Picker(warehouse2);
        Courier courier1 = new Courier(warehouse2);


        picker1.doWork();
        courier1.doWork();
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();

        System.out.println(worker.toString() + "\n");
    }
}
