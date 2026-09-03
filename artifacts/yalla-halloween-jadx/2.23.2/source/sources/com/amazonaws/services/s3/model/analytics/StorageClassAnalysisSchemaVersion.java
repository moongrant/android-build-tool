package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum StorageClassAnalysisSchemaVersion implements Serializable {
    V_1;

    private final String version = "V_1";

    @Override // java.lang.Enum
    public final String toString() {
        return this.version;
    }
}
