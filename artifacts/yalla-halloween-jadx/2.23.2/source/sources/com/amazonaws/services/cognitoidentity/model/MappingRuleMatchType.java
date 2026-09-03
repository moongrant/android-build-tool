package com.amazonaws.services.cognitoidentity.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum MappingRuleMatchType {
    Equals("Equals"),
    Contains("Contains"),
    StartsWith("StartsWith"),
    NotEqual("NotEqual");

    private static final Map<String, MappingRuleMatchType> enumMap;
    private String value;

    static {
        MappingRuleMatchType mappingRuleMatchType = Equals;
        MappingRuleMatchType mappingRuleMatchType2 = Contains;
        MappingRuleMatchType mappingRuleMatchType3 = StartsWith;
        MappingRuleMatchType mappingRuleMatchType4 = NotEqual;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("Equals", mappingRuleMatchType);
        map.put("Contains", mappingRuleMatchType2);
        map.put("StartsWith", mappingRuleMatchType3);
        map.put("NotEqual", mappingRuleMatchType4);
    }

    MappingRuleMatchType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
