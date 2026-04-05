import java.util.List;

public class Defend implements Action {
    @Override
    public void execute(Combatant performer, List<Combatant> targets) {
        new DefendStatus(performer, 2);
        System.out.println(performer.getName() + " defends, defense increased for 2 turns.");
    }

    @Override
    public String getName() {
        return "Defend";
    }
}
