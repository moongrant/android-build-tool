package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes2.dex */
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

    @Override // java.lang.Enum
    public final String toString() {
        return this.storageClassId;
    }
}
