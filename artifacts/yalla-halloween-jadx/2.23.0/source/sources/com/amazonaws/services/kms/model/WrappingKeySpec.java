package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum WrappingKeySpec {
    RSA_2048;

    private static final Map<String, WrappingKeySpec> enumMap;
    private String value = "RSA_2048";

    static {
        WrappingKeySpec wrappingKeySpec = RSA_2048;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("RSA_2048", wrappingKeySpec);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
