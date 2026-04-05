class ArcaneBlastStatus extends StatusEffect {

    private AttackModifier attackModifier = new AttackModifier(10);

    ArcaneBlastStatus(Combatant affectedEntity, int duration) {
        super(affectedEntity, duration);
        this.setStatusName("Arcane Blast");
        this.setPriority(0);
        this.addLocalTriggerCondition(Local_Trigger_Types.ON_MODIFY_ATTACK);
        this.applyStatus();
    }

    public int onModifyAttack(int attack) {
        return attackModifier.applyAttackModifier(attack, '+');
    }

}