package com.amazonaws.services.cognitoidentity.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum AmbiguousRoleResolutionType {
    AuthenticatedRole("AuthenticatedRole"),
    Deny("Deny");

    private static final Map<String, AmbiguousRoleResolutionType> enumMap;
    private String value;

    static {
        AmbiguousRoleResolutionType ambiguousRoleResolutionType = AuthenticatedRole;
        AmbiguousRoleResolutionType ambiguousRoleResolutionType2 = Deny;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("AuthenticatedRole", ambiguousRoleResolutionType);
        map.put("Deny", ambiguousRoleResolutionType2);
    }

    AmbiguousRoleResolutionType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
