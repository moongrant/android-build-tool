package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum KeyUsageType {
    SIGN_VERIFY("SIGN_VERIFY"),
    ENCRYPT_DECRYPT("ENCRYPT_DECRYPT");

    private static final Map<String, KeyUsageType> enumMap;
    private String value;

    static {
        KeyUsageType keyUsageType = SIGN_VERIFY;
        KeyUsageType keyUsageType2 = ENCRYPT_DECRYPT;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("SIGN_VERIFY", keyUsageType);
        map.put("ENCRYPT_DECRYPT", keyUsageType2);
    }

    KeyUsageType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
