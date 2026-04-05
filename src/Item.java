public interface Item {
    void use(Combatant performer, Combatant target);
    String getName();
    boolean isPerishable();
}
