package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum ExpirationModelType {
    KEY_MATERIAL_EXPIRES("KEY_MATERIAL_EXPIRES"),
    KEY_MATERIAL_DOES_NOT_EXPIRE("KEY_MATERIAL_DOES_NOT_EXPIRE");

    private static final Map<String, ExpirationModelType> enumMap;
    private String value;

    static {
        ExpirationModelType expirationModelType = KEY_MATERIAL_EXPIRES;
        ExpirationModelType expirationModelType2 = KEY_MATERIAL_DOES_NOT_EXPIRE;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("KEY_MATERIAL_EXPIRES", expirationModelType);
        map.put("KEY_MATERIAL_DOES_NOT_EXPIRE", expirationModelType2);
    }

    ExpirationModelType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
