package com.ff14.macro;

import java.util.ArrayList;
import java.util.List;

/**
 * 宏指令实体类
 */
public class Macro {
    private String id;
    private String name;
    private List<MacroAction> actions;

    public Macro() {
        this.id = String.valueOf(System.currentTimeMillis());
        this.actions = new ArrayList<>();
    }

    public Macro(String name) {
        this();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MacroAction> getActions() {
        return actions;
    }

    public void setActions(List<MacroAction> actions) {
        this.actions = actions;
    }

    public void addAction(MacroAction action) {
        if (action != null) {
            this.actions.add(action);
        }
    }

    /**
     * 将操作列表转换为命令字符串
     */
    public String getCommandsString() {
        StringBuilder sb = new StringBuilder();
        for (MacroAction action : actions) {
            sb.append(action.toString()).append("\n");
        }
        return sb.toString().trim();
    }

    /**
     * 从命令字符串解析操作列表
     */
    public void parseCommands(String commands) {
        actions.clear();
        String[] lines = commands.split("\n");
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                MacroAction action = MacroAction.parse(line);
                if (action != null) {
                    actions.add(action);
                }
            }
        }
    }
}
