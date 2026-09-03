package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum AlgorithmSpec {
    RSAES_PKCS1_V1_5("RSAES_PKCS1_V1_5"),
    RSAES_OAEP_SHA_1("RSAES_OAEP_SHA_1"),
    RSAES_OAEP_SHA_256("RSAES_OAEP_SHA_256");

    private static final Map<String, AlgorithmSpec> enumMap;
    private String value;

    static {
        AlgorithmSpec algorithmSpec = RSAES_PKCS1_V1_5;
        AlgorithmSpec algorithmSpec2 = RSAES_OAEP_SHA_1;
        AlgorithmSpec algorithmSpec3 = RSAES_OAEP_SHA_256;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("RSAES_PKCS1_V1_5", algorithmSpec);
        map.put("RSAES_OAEP_SHA_1", algorithmSpec2);
        map.put("RSAES_OAEP_SHA_256", algorithmSpec3);
    }

    AlgorithmSpec(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
