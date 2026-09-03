package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum EncryptionAlgorithmSpec {
    SYMMETRIC_DEFAULT("SYMMETRIC_DEFAULT"),
    RSAES_OAEP_SHA_1("RSAES_OAEP_SHA_1"),
    RSAES_OAEP_SHA_256("RSAES_OAEP_SHA_256");

    private static final Map<String, EncryptionAlgorithmSpec> enumMap;
    private String value;

    static {
        EncryptionAlgorithmSpec encryptionAlgorithmSpec = SYMMETRIC_DEFAULT;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec2 = RSAES_OAEP_SHA_1;
        EncryptionAlgorithmSpec encryptionAlgorithmSpec3 = RSAES_OAEP_SHA_256;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("SYMMETRIC_DEFAULT", encryptionAlgorithmSpec);
        map.put("RSAES_OAEP_SHA_1", encryptionAlgorithmSpec2);
        map.put("RSAES_OAEP_SHA_256", encryptionAlgorithmSpec3);
    }

    EncryptionAlgorithmSpec(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
