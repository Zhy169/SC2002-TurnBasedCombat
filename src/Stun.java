class Stun extends StatusEffect {

    Stun(Combatant affectedEntity, int duration) {
        super(affectedEntity, duration);
        this.setStatusName("Stun");
        this.setPriority(1);
        this.addLocalTriggerCondition(Local_Trigger_Types.ON_TURN_END);
        this.applyStatus();
    }

    public void onTurnStart() {
        this.updateCurStatusDuration();
    }

}