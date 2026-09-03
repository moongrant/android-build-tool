package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum MessageType {
    RAW("RAW"),
    DIGEST("DIGEST");

    private static final Map<String, MessageType> enumMap;
    private String value;

    static {
        MessageType messageType = RAW;
        MessageType messageType2 = DIGEST;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("RAW", messageType);
        map.put("DIGEST", messageType2);
    }

    MessageType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
