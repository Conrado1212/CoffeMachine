package main.stage6.enums;

public enum DanegerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int level;

    DanegerLevel(int level) {
        this.level = level;
    }

    public int getLevel(){
        return level;
    }
}
/*HIGH(3),
    MEDIUM(2),
    LOW(1);
    private int dangerLevel;

    DangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public int getLevel() {
        return dangerLevel;
    }*/
/*HIGH(3),
    MEDIUM(2),
    LOW(1);

    int sections;

    DangerLevel(int sections) {
        this.sections = sections;
    }

    public int getSections() {
        return sections;
    }

    public int getLevel() {
        return sections;
    }*/