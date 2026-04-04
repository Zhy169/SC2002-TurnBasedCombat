import java.util.List;

public class UseItem implements Action {
    private final Item item;

    public UseItem(Item item) {
        this.item = item;
    }

    @Override
    public void execute(Combatant performer, List<Combatant> targets) {
        if (!(performer instanceof Player)) {
            System.out.println("Only players can use items.");
            return;
        }
        Player player = (Player) performer;
        Combatant target = (targets == null || targets.isEmpty()) ? performer : targets.get(0);
        item.use(performer, target);
        if (item.isPerishable()) {
            player.getBag().removeItem(item);
        }
        System.out.println(performer.getName() + " uses " + item.getName());
    }

    @Override
    public String getName() {
        return "Use " + item.getName();
    }
}
