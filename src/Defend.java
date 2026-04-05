import java.util.List;

public class Defend implements Action {
    @Override
    public void execute(Combatant performer, List<Combatant> targets) {
        performer.addEffect(new DefenseBuffEffect(10, 2));
        System.out.println(performer.getName() + " defends, defense increased for 2 turns.");
    }

    @Override
    public String getName() {
        return "Defend";
    }
}
