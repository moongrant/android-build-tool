package com.ff14.macro;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 宏指令存储管理
 */
public class MacroStorage {
    private static final String PREFS_NAME = "ff14_macro_prefs";
    private static final String KEY_MACROS = "macros";
    private static final String KEY_SELECTED_MACRO = "selected_macro";

    private final SharedPreferences prefs;

    public MacroStorage(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    /**
     * 保存宏列表
     */
    public void saveMacros(List<Macro> macros) {
        JSONArray jsonArray = new JSONArray();
        for (Macro macro : macros) {
            try {
                JSONObject obj = new JSONObject();
                obj.put("id", macro.getId());
                obj.put("name", macro.getName());
                obj.put("commands", macro.getCommandsString());
                jsonArray.put(obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        prefs.edit().putString(KEY_MACROS, jsonArray.toString()).apply();
    }

    /**
     * 加载宏列表
     */
    public List<Macro> loadMacros() {
        List<Macro> macros = new ArrayList<>();
        String json = prefs.getString(KEY_MACROS, "[]");
        try {
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                Macro macro = new Macro();
                macro.setId(obj.getString("id"));
                macro.setName(obj.getString("name"));
                macro.parseCommands(obj.getString("commands"));
                macros.add(macro);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return macros;
    }

    /**
     * 添加宏
     */
    public void addMacro(Macro macro) {
        List<Macro> macros = loadMacros();
        macros.add(macro);
        saveMacros(macros);
    }

    /**
     * 更新宏
     */
    public void updateMacro(Macro macro) {
        List<Macro> macros = loadMacros();
        for (int i = 0; i < macros.size(); i++) {
            if (macros.get(i).getId().equals(macro.getId())) {
                macros.set(i, macro);
                break;
            }
        }
        saveMacros(macros);
    }

    /**
     * 删除宏
     */
    public void deleteMacro(String id) {
        List<Macro> macros = loadMacros();
        macros.removeIf(m -> m.getId().equals(id));
        saveMacros(macros);
    }

    /**
     * 保存选中的宏ID
     */
    public void setSelectedMacroId(String id) {
        prefs.edit().putString(KEY_SELECTED_MACRO, id).apply();
    }

    /**
     * 获取选中的宏ID
     */
    public String getSelectedMacroId() {
        return prefs.getString(KEY_SELECTED_MACRO, null);
    }

    /**
     * 获取选中的宏
     */
    public Macro getSelectedMacro() {
        String id = getSelectedMacroId();
        if (id == null) return null;

        List<Macro> macros = loadMacros();
        for (Macro macro : macros) {
            if (macro.getId().equals(id)) {
                return macro;
            }
        }
        return null;
    }
}
