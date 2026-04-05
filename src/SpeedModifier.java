class SpeedModifier {

    private double speedModifier = 1.0;

    SpeedModifier(double speedModifier) {
        this.speedModifier = speedModifier;
    }

    public double getSpeedModifier() {
        return speedModifier;
    }

    public void setSpeedModifier(double speedModifier) {
        this.speedModifier = speedModifier;
    }

    public int applySpeedModifier(int speed, char operation) {
        switch(operation) {
            case '+':
                return (int)(speed + this.getSpeedModifier());
            case '-':
                return (int)(speed - this.getSpeedModifier());
            case '/':
                return (int)(speed / this.getSpeedModifier());
            case '*':
                return (int)(speed * this.getSpeedModifier());
            default:
                return speed;
        }
    }
}