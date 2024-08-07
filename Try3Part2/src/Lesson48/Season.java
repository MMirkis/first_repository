package Lesson48;

public enum Season {
    SUMMER(300),WINTER(-300),AUTOWMN(-150), SPRING(150);

    private int temperatur;

    Season(int temperatur){
        this.temperatur=temperatur;
    }

    public String getTemperatur(){
        return "На улице примерно "+temperatur+" градусов цельсия";
    }
}
