package day11.task1;

class Warehouse {
    private int countPickedOrders; //количество собранных заказов
    private int countDeliveredOrders; //количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPicker() {
        return countPickedOrders++;
    }

    public int getCountDelivered() {
        return countDeliveredOrders++;
    }


    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

}
