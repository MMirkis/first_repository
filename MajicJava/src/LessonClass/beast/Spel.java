package LessonClass.beast;

public abstract class Spel {
    private String name;
    private String efect;
    private boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEfect() {
        return efect;
    }

    public void setEfect(String efect) {
        this.efect = efect;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public abstract void doMagic();

    public Spel(String name, String efect, boolean status) {
        this.name = name;
        this.efect = efect;
        this.status = status;
    }
}
