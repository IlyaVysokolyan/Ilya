package day6;

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int ageAuto) {
        year = ageAuto;
    }

    public void setColor(String colorAuto) {
        color = colorAuto;

    }

    public void setModel(String modelAuto) {
        model = modelAuto;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return inputYear - year;
    }

}
