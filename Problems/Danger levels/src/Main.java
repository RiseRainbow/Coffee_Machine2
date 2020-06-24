enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private int a;
    DangerLevel(int a) {
        this.a = a;
    };
    int getLevel() {
        return this.a;
    }
}