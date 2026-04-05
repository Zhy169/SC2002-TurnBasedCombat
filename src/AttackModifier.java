class AttackModifier {

    private double attackModifier = 1.0;

    AttackModifier(double attackModifier) {
        this.attackModifier = attackModifier;
    }

    public double getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(double attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int applyAttackModifier(int attack, char operation) {
        switch(operation) {
            case '+':
                return (int)(attack + this.getAttackModifier());
            case '-':
                return (int)(attack - this.getAttackModifier());
            case '/':
                return (int)(attack / this.getAttackModifier());
            case '*':
                return (int)(attack * this.getAttackModifier());
            default:
                return attack;
        }
    }
}