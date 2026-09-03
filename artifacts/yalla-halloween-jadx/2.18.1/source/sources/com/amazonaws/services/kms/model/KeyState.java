package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum KeyState {
    Enabled("Enabled"),
    Disabled("Disabled"),
    PendingDeletion("PendingDeletion"),
    PendingImport("PendingImport"),
    Unavailable("Unavailable");

    private static final Map<String, KeyState> enumMap;
    private String value;

    static {
        KeyState keyState = Enabled;
        KeyState keyState2 = Disabled;
        KeyState keyState3 = PendingDeletion;
        KeyState keyState4 = PendingImport;
        KeyState keyState5 = Unavailable;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("Enabled", keyState);
        map.put("Disabled", keyState2);
        map.put("PendingDeletion", keyState3);
        map.put("PendingImport", keyState4);
        map.put("Unavailable", keyState5);
    }

    KeyState(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
