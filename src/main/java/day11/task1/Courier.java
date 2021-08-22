package day11.task1;

class Courier implements Worker {
    private int salary; //заработная плата
    private boolean isPayed; //выплачен бонус или нет
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.getCountDelivered();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000) {
            if (!isPayed) {
                salary += 70000;
                isPayed = true;
                System.out.println("Выплата бонуса");
            } else System.out.println("Бонус уже был выплачен");
        } else System.out.println("Бонус пока не доступен");
    }
}
