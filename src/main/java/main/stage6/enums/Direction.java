package main.stage6.enums;

public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }
    static class Main{
        public static void main(String[] args) {
            System.out.println(Direction.NORTH.name());
            System.out.println(Direction.NORTH.toString());
            System.out.println(Direction.NORTH.getShortCode());
          //  System.out.println(Direction.valueOf("N"));
            System.out.println(Direction.valueOf("NORTH"));
        }
    }
}
