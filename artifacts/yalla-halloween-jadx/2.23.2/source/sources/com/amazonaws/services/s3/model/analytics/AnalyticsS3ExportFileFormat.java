package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum AnalyticsS3ExportFileFormat implements Serializable {
    CSV;

    private final String format = "CSV";

    @Override // java.lang.Enum
    public final String toString() {
        return this.format;
    }
}
