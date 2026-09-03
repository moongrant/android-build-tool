package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum SSEAlgorithm {
    AES256("AES256"),
    KMS("aws:kms");

    private final String algorithm;

    SSEAlgorithm(String str) {
        this.algorithm = str;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.algorithm;
    }
}
