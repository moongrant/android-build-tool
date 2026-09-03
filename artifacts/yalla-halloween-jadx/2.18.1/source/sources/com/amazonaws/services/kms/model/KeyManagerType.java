package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum KeyManagerType {
    AWS("AWS"),
    CUSTOMER("CUSTOMER");

    private static final Map<String, KeyManagerType> enumMap;
    private String value;

    static {
        KeyManagerType keyManagerType = AWS;
        KeyManagerType keyManagerType2 = CUSTOMER;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("AWS", keyManagerType);
        map.put("CUSTOMER", keyManagerType2);
    }

    KeyManagerType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
