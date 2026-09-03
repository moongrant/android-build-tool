package com.amazonaws.services.cognitoidentity.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCode {
    AccessDenied("AccessDenied"),
    InternalServerError("InternalServerError");

    private static final Map<String, ErrorCode> enumMap;
    private String value;

    static {
        ErrorCode errorCode = AccessDenied;
        ErrorCode errorCode2 = InternalServerError;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("AccessDenied", errorCode);
        map.put("InternalServerError", errorCode2);
    }

    ErrorCode(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
