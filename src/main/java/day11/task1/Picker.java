package day11.task1;

class Picker implements Worker {
    private int salary; //заработная плата
    private boolean isPayed; //выплачен бонус или нет
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Picker{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.getCountPicker();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000) {
            if (!isPayed) {
                salary += 70000;
                isPayed = true;
                System.out.println("Выплата бонуса");
            } else System.out.println("Бонус уже был выплачен");
        } else System.out.println("Бонус пока не доступен");
    }
}
