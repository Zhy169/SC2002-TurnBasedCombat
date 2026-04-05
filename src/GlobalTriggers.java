import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class GlobalTriggers {
    
    private static GlobalTriggers onlyObject = null;
    private Map<Global_Trigger_Types, List<StatusEffect>> globalTriggerList = new HashMap<>();

    GlobalTriggers() {
        for(Global_Trigger_Types condition : Global_Trigger_Types.values()) {
            globalTriggerList.put(condition, new ArrayList<>());
        }
    }

    public static GlobalTriggers getGlobalTriggerObject() {
        if(onlyObject == null) {
            onlyObject = new GlobalTriggers();
        }
        return onlyObject;
    }

    public void addGlobalTrigger(Global_Trigger_Types condition, StatusEffect status) {
        globalTriggerList.get(condition).add(status);
        Collections.sort(globalTriggerList.get(condition), Comparator.comparingInt(StatusEffect::getPriority));
    }

    public void removeGlobalTrigger(Global_Trigger_Types condition, StatusEffect status) {
        globalTriggerList.get(condition).remove(status);
    }

    public List<StatusEffect> getGlobalTriggers(Global_Trigger_Types condition) {
        return globalTriggerList.get(condition);
    }

    public void trigger(Global_Trigger_Types condition) {
        for(StatusEffect status : new ArrayList<>(globalTriggerList.get(condition))) {
            switch(condition) {
                case ON_ROUND_START -> status.onRoundStart();
                case ON_ROUND_END -> status.onRoundEnd();
                default -> {}
            }
        }
    }
}