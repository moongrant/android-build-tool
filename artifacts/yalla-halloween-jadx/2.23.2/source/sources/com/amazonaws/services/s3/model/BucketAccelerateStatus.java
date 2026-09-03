package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes2.dex */
public enum BucketAccelerateStatus {
    Enabled("Enabled"),
    Suspended("Suspended");

    private final String accelerateStatus;

    BucketAccelerateStatus(String str) {
        this.accelerateStatus = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.accelerateStatus;
    }
}
