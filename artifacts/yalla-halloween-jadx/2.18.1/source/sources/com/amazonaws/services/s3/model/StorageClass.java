package com.amazonaws.services.s3.model;

import OooO0o.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public enum StorageClass {
    Standard("STANDARD"),
    ReducedRedundancy("REDUCED_REDUNDANCY"),
    Glacier("GLACIER"),
    StandardInfrequentAccess("STANDARD_IA"),
    OneZoneInfrequentAccess("ONEZONE_IA"),
    IntelligentTiering("INTELLIGENT_TIERING");

    private final String storageClassId;

    StorageClass(String str) {
        this.storageClassId = str;
    }

    public static StorageClass OooO00o(String str) throws IllegalArgumentException {
        for (StorageClass storageClass : values()) {
            if (storageClass.storageClassId.equals(str)) {
                return storageClass;
            }
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o("Cannot create enum from ", str, " value!"));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.storageClassId;
    }
}
